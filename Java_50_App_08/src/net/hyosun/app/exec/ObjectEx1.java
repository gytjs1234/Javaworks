package net.hyosun.app.exec;

import java.util.ArrayList;
import java.util.List;

import net.hyosun.app.model.ScoreVO;

public class ObjectEx1 {
	public static void main(String[] args) {
		//한사람 성적을 저장하기위한 VO
		ScoreVO scVO =new ScoreVO();
		
		scVO.setStNum(1);
		scVO.setIntKor(90);//점수저장
		scVO.setIntEng(80);
		scVO.setIntMath(85);
		
		ScoreVO scVO2 =new ScoreVO();
		
		scVO2.setStNum(1);
		scVO2.setIntKor(90);//점수저장
		scVO2.setIntEng(80);
		scVO2.setIntMath(85);
		
		
		
		//5명 학생의 성적을 저장할 VO배열 선언
		ScoreVO[] scVOs=new ScoreVO[5];
		
		//scVOs배열의 0번 요소를 객체로 생성하기(초기화 하기)
		scVOs[0]=new ScoreVO();
		scVOs[0].setStNum(2);
		scVOs[0].setIntKor(80);
		scVOs[0].setIntEng(89);
		scVOs[0].setIntMath(78);
		
		
		scVOs[1]=new ScoreVO();
		scVOs[1].setStNum(2);
		scVOs[1].setIntKor(80);
		scVOs[1].setIntEng(89);
		scVOs[1].setIntMath(78);
		
		
		scVOs[2]=new ScoreVO();
		scVOs[2].setStNum(2);
		scVOs[2].setIntKor(80);
		scVOs[2].setIntEng(89);
		scVOs[2].setIntMath(78);
		
		
		//다수의 학생 성적을 저장할 ScoreVO list 생성
		List<ScoreVO> scList= new ArrayList<>();
		ScoreVO sVO1=new ScoreVO();
		sVO1.setStNum(4);
		sVO1.setIntKor(88);
		sVO1.setIntEng(50);
		sVO1.setIntMath(60);
		scList.add(sVO1);
		
		
		sVO1=new ScoreVO();
		sVO1.setStNum(4);
		sVO1.setIntKor(87);
		sVO1.setIntEng(50);
		sVO1.setIntMath(60);
		scList.add(sVO1);
		
		
		
	}

}
