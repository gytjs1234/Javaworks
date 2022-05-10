package com.callor.service.impl;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.callor.model.ScoreVO;

//
public class ScoreServiceImplV3 extends ScoreServiceImplV2 {
	
	
	protected String saveFileName;
	public ScoreServiceImplV3() {
		super();
		saveFileName= "src/com/callor/app/controller/Score.txt";
	}
	@Override
	public void saveScore() {
		
		//파일에 데이터를 기록하는 데 사용하는 도구
		FileOutputStream fileOut=null;
		BufferedOutputStream buffer =null;
		//파일입출력하는 친구들은 묶어줘야함
		/*
		 * BufferedOutPut 를 사용하는 이유
		 * 실제 데이터를 파일에 기록하기 위해서는 FileOutPutstream만 있어도 된다.
		 * 하지만, 파일에 기록하고 저장하는 일은 상당히 많은 시간을 소모한다
		 * 컴퓨터 메모리,CPU입장에서는 파일을 기록하는 동안 아무것도 하지 못하고 기다려야 하는 상황이 발생한다
		 * 
		 * 이떄 중간에 BufferOutPut라는 파이프를 연결해 두고 애플리케이션에서는 BufferOutput에게 데이터를 모두 보내고
		 * 다른 일을 수행한다
		 * 
		 * 그러면 BufferedOutput 와 FileOutPut가 협력하여 데이터를 파일에 기록하는 일을 대신 수행해준다.
		 */
		try {
			//너는 이파일을 저장을해라라는 의미
			fileOut =new FileOutputStream(saveFileName);
			buffer=new BufferedOutputStream(fileOut);
			for(ScoreVO scVO:scList) {
				String writestr="";
				writestr +=String.format("%s:",scVO.getStName());
				writestr +=String.format("%d:",scVO.getIntKor());
				writestr +=String.format("%d:",scVO.getIntEng());
				writestr +=String.format("%d\n",scVO.getIntMath());
				
				//파일을 입력하면서 예외발생할수있어서 오류가뜬다 그럴경우 트라이케치로 묶어준다
				buffer.write(writestr.getBytes());
				
				
			}//end for
			
			buffer.flush();
			buffer.close();
			fileOut.close();
			//데이터를 기록하는데 중요한 친구
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
