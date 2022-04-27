package net.hyosun.service.Impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

import net.hyosun.service.StudentService;
import net.hyosun.service.domain.StudentVO;

//svo
public class StudentServiceImplV1 implements StudentService {

	private StudentVO[] stList;
	private String stFile;

	// public StudentServiceImplV1() {

	// }

	public StudentServiceImplV1(String stFile, int length) {
		this.stFile = stFile;
		this.stList = new StudentVO[length];
		for (int i = 0; i < this.stList.length; i++) {
			this.stList[i] = new StudentVO();
		}

	}

	@Override
	public void loadStudent() {
		InputStream is = null; // try catch꼭 써줘야함
		try {

			// 파일에정보를 담아준다.
			is = new FileInputStream(this.stFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(stFile + "파일을 찾을수 없습니다.");
			return; // 아무조건없이 메소드 실행을 종료해라.
		}
		Scanner scan = new Scanner(is);
		/*
		 * 
		 * while (true) { boolean bYes = scan.hasNext(); if (bYes == false) { break; }
		 * String stLine = scan.nextLine(); System.out.println(stLine); }
		 */

		int index = 0; // index의 요소를 가르키는값
		// 이조건이 true일때만 실행하라라는 의미 읽을내용이있느냐 물어봄
		while (scan.hasNext() == true) {
			// 한개의 데이터
			String stLine = scan.nextLine();
			System.out.println(stLine); // 디버깅코드

			String[] stInfos = stLine.split(":");
			System.out.println("학번::" + stInfos[0]);
			System.out.println("이름::" + stInfos[1]);
			System.out.println("학년::" + stInfos[2]);
			System.out.println("학과::" + stInfos[3]);
			System.out.println("주소::" + stInfos[5]);

			StudentVO stVO = new StudentVO();
			stVO.setStName(stInfos[0]);
			stVO.setStNum(stInfos[1]);
			stVO.setStGrade(stInfos[2]);
			stVO.setStDept(stInfos[4]);
			stVO.setStAddr(stInfos[5]);

			// 0번부터 순서대로 데이터가 들어감
			stList[index++] = stVO;
			System.out.println();

		} // 여기들 지나면 stList에 모든 데이터가 담겨있을것이다
		this.printStudents();

	}// end loadStudent
		// V1에서 stList 에담긴 데이터들을 확인하기 위하여 내부용으로 만드는 메서드

	private void printStudents() {
		for (int i = 0; i < stList.length; i++) {
			System.out.println(stList[i].toString());
		}
		for (StudentVO vo : stList) {
			System.out.println(vo.toString());
		}

	}

	@Override
	public StudentVO[] getStudents() {
		return null;
	}

	@Override
	public StudentVO findByNum(String stNum) {
		return null;
	}

}
