package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx4 {
	public static void main(String[] args) {
		/*
		 * List:interface, 데이터 그룹을 저장하기 위한 type Collection
		 * type
		 * 다수의 데이터를 저장하고 연산에 사용하기 위한 데이터type 
		 * 1.List 를 선언할때는 Generic type 을 지정한다
		 * List 에 add 되는 것을 방지하기윙함
		 * 2.메모리 낭비를 막고 성능상 이점이 있기 때문에
		 * 아래 선언된 List 는 Generic type 이 AddressVO 이다
		 * 여기 List  에 데이터를 추가하려면 먼저AddressVO type의 vo객체를
		 * 만들고, 데이터를 저장한 다음 add 한다.
		 */
		List <AddressVO> addr=new ArrayList<>();
		AddressVO vo= new AddressVO();
		
		/*
		 * VO 데이터를 List 에 add 하기 위해서는 
		 * 항상 새로운 Vo를 생성하가ㅗ 데이터를 Setting 하고 add 해야한다.
		 * 
		 */
		
		vo=new AddressVO();
		vo.setAddr("화정동");
		vo.setName("효선");
		vo.setTel("123456789");
		addr.add(vo);
		
		vo=new AddressVO();
		vo.setAddr("금호동");
		vo.setName("지선");
		vo.setTel("123456789");
		addr.add(vo);
		
		vo=new AddressVO();
		vo.setAddr("봉선동");
		vo.setName("민섭");
		vo.setTel("123456789");
		addr.add(vo);
		
		AddrServiceV1 sdService =new AddrServiceV1();
		sdService.printAddrList(addr);
		
	}

}
