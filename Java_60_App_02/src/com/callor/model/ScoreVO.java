package com.callor.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
//1
public class ScoreVO {

	// 학생이름,국어,영어,수학 점수 저장
	private String stName;
	private int intKor;
	private int intEng;
	private int intMath;

	//변수대신 메서드
	// private int intSum;
	// private float fAvg;
	
	
	//필드변수와 관계없이 
	//총점을 계싼하여 리턴하는 메서드 정의하기
	public int getIntSum() {
		int sum=intKor+intEng+intMath;
		return sum;
	}
	//vb.getavg 메서드를 호출하면 3과목의 평균을 계싼하여 리턴한다.
	public float getAvg() {
		int sum= getIntSum();
		float avg=(float)sum/3;
		return avg;
	}
	
	public String toString() {
		String result ="";
		result += String.format("%-10s\t",stName);
		
		result+=String.format("%5d\t", intKor);
		result+=String.format("%5d\t", intEng);
		result+=String.format("%5d\t", intMath);
		
		result+=String.format("%5d\t", getIntSum());
		result+=String.format("%5.2f\n", getAvg());
		
		return result;
	}
	

}
