package net.hyosun.score.exec;

import net.hyosun.score.domain.ScoreVo;
import net.hyosun.score.utils.Line;

public class ExecV1 {
public static void main(String[] args) {
	//ScoreVo 클래스를 사용하아 3개의 객체 생성
	ScoreVo stNo1 =new ScoreVo();
	ScoreVo stNo2 =new ScoreVo();
	ScoreVo stNo3 =new ScoreVo();
	
	System.out.println(stNo1.stName);
	System.out.println(stNo1.intKor);
	
	stNo1.stName ="홍길동";
	stNo2.stName ="이몽룡";
	stNo3.stName ="성춘향";
	
	stNo1.intKor=90;  //속성
	stNo2.intKor=80;
	stNo3.intKor=50;
	//1번 학생의 이름과 국어점수를 확인하고싶다
	System.out.println(Line.dLine(50));
	System.out.println("성적처리");
	System.out.println(Line.sLine(50));
	System.out.printf("%s\t%d",stNo1.stName,stNo1.intKor);
	System.out.printf("%s\t%d",stNo2.stName,stNo2.intKor);
	System.out.printf("%s\t%d",stNo3.stName,stNo3.intKor);
	System.out.print(Line.dLine(50));
	
	
}
}
