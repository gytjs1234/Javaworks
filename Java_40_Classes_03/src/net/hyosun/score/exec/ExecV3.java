package net.hyosun.score.exec;

import net.hyosun.score.domain.ScoreV2VO;

public class ExecV3 {
	public static void main(String[] args) {
		//vo 클래스를 사용하여 배열 선언하기
		ScoreV2VO[] scores = new ScoreV2VO[10]; //10개가들어있는배열선언 아직쓸수없음
		
		
		//꼭필요함 안하면 저장도안되고 읽혀지지도않음 배열을 객체로선언했을때
		//배열로 선언된 객체는 아직 사용할 준비가 덜 되었다
		//각요서들을 반드시 생성자로 초기화 시켜주어야한다
		scores[0]=new ScoreV2VO();
		scores[1]=new ScoreV2VO();
		scores[2]=new ScoreV2VO();
		scores[3]=new ScoreV2VO();
		
		
		
		scores[0].setStName("임");
		scores[1].setStName("효");
		scores[2].setStName("선");
		scores[3].setStName("이");
	}

}
