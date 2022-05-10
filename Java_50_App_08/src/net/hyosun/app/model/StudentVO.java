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
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class StudentVO {
	private String stNum;
	private String stName;
	private String stDept;
	private String stTel;
	private String stAddr;
	private int stGrade;

}
