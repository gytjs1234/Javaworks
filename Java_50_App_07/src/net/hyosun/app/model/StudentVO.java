package net.hyosun.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor //모든 변수를 모두 매개변수로 받는 임의생성자
@NoArgsConstructor //기본생성자
@Builder //빌더패턴으로 VO를 만들수 있다

public class StudentVO {
	private String stNum;
	private String stName;
	private String stTel;
	private String stAddr;
	private String stDept;
	private int stGrade;

}
