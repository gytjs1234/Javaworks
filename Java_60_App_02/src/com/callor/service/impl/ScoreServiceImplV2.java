package com.callor.service.impl;

import com.callor.model.ScoreVO;

public class ScoreServiceImplV2 extends ScoreServcieImplV1 {

	public ScoreServiceImplV2() {
		// 상속받은 ScoreServiceImplV1 클래스의 기본 생성자 호출
		super();
	}

	@Override
	public void inputScore() {
		while (true) {
			System.out.println("학생이름 입력(QUIT:종료)>>");
			String stName = scan.nextLine();
			String[] strsubject = {"국어", "영어", "수학"};
			Integer[] intScore = new Integer[3];
			int index = 0;
			if(stName.equals("QUIT")){
				break;
			}
			for(index = 0; index < strsubject.length; index++) {
				intScore[index] = getScore(strsubject[index]);
				if(intScore[index]==null) {
					/*
					 * 
					 * 
					 */
					index --;
					continue;
				}
				if(intScore[index]<0)break; 
			}//end for
			if(index<strsubject.length){
				break;
			}
			/*
			 * Build패턴을 사용하여 VO객체 생성하면서
			 * 데이터 setting 하기
			 * 1.생성자 키워드 new 사용하지않음
			 * 2.클래스.builde()method 시작
			 * 3.VO클래스에 정의된 변수이름이 method역할 수행
			 * 4.변수이름에 해당하는 method에 값 전달하여 데이터저장
			 * 5.build()method 호출하여 마감
			 * Build 패턴을 사용하는 이유
			 * VO객체를 생성하고setter method를 사용하여
			 *  데이터를 저장하는 번거로움을해결
			 * 2.필드생성자를 사용할때 모든 변수의 값을 준비해야하는 번거로움을 해결
			 * 3.준비된 데이터만 가지고 VO객체를 생성하면서 데이터를Setting 할수있다.
			 */
			ScoreVO scVO=ScoreVO.builder()
					.stName(stName)
					.intKor(intScore[0])
					.intEng(intScore[1])
					.intMath(intScore[2])
			        .build();
			
			//list에 저장하지않으면 파일에 데이터가 뜨지않는다
			scList.add(scVO);
		}
		for(ScoreVO scVO:scList) {
			System.out.println(scVO.toString());
		}
	}

	private Integer getScore(String title) {
		System.out.printf("%s 점수입력(QUIT:종료)>>", title);
		String Score = scan.nextLine();
		if (Score.equals("QUIT")) {
			return -1;
		}
		Integer intScore = 0;
		try {
			intScore = Integer.valueOf(Score);
		} catch (Exception e){
			System.out.printf("%s점수는 정수만가능\n", title);
			return null;
		}
		return intScore;

	}

}
