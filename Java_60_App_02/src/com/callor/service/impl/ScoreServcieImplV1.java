package com.callor.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.model.ScoreVO;
import com.callor.service.ScoreService;

public class ScoreServcieImplV1 implements ScoreService {

	protected final Scanner scan;
	protected final  List<ScoreVO>scList;
	
	public ScoreServcieImplV1() {
		//오래된 버전은 제네릭을 넣어줘야한다
		scList=new ArrayList<ScoreVO>();
		scan=new Scanner(System.in);
	}
	
	
	ScoreVO VO=new ScoreVO();
	public void inputScore() {
		while(true){
			//학생이름 입력
			System.out.println("학생이름 입력(QUIT종료)>>");
			String stName=scan.nextLine();
			//Quit 입력되면 break;
			if(stName.equals("QUIT")) {
				break;
			}
			
			//국어 입력
			System.out.println("국어점수>>");
			String strKor =scan.nextLine();
			Integer intKor =Integer.valueOf(strKor);
			
			//영어 입력
			System.out.println("영어점수>>");
			String strEng=scan.nextLine();
			Integer intEng =Integer.valueOf(strEng);
			//수학 입력

			System.out.println("수학점수>>");
			String strMath=scan.nextLine();
			Integer intMath =Integer.valueOf(strMath);
			//수학 입력
			//VO생성
			ScoreVO scVO =new ScoreVO();
			//VO에 Setting
			scVO.setStName(stName);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			//scList.add()
			scList.add(scVO);
			
		}//end while
		System.out.println("입력이 중단되었습니다.");
		
		
	}
	
	 public void saveScore() {
		
	}

}
