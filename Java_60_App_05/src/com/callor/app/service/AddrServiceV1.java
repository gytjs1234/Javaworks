package com.callor.app.service;

import java.util.List;

import com.callor.app.model.AddressVO;

public class AddrServiceV1 {

	public void printAddr(AddressVO vo1) {
		System.out.println(vo1);
	}

	public void printAddrList(AddressVO[] vo) {
		for (int i = 0; i < vo.length; i++) {
			// 객체만 pritln()에 전달하면 내부에서 vo.toString()을 호출하여 문자열을 받아 출력
			System.out.println(vo[i]);
		}

	}

	public void printAddrList(AddressVO list) {

		System.out.println(list);
	}

	public void printAddrList(List<AddressVO> addr) {
//		for(AddressVO vo:addr) {
//			System.out.println(vo);
//		}
		int size = addr.size();
		for (int i = 0; i < size; i++) {
			System.out.println(addr.get(i));
		}

	}

}
