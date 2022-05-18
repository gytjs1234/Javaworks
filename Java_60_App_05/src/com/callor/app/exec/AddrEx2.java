package com.callor.app.exec;

import com.callor.app.model.AddressVO;
import com.callor.app.service.AddrServiceV1;

public class AddrEx2 {
	public static void main(String[] args) {
		AddressVO hong =AddressVO.builder()
						.name("임효선")
						.tel("01032349007")
						.addr("서울특별시")
						.build();
		
		AddrServiceV1 sv1 =new AddrServiceV1();
		sv1.printAddr(hong);
		
		AddressVO[] vo= new AddressVO[4];
		vo[0]=AddressVO.builder()
				.name("g")
				.tel("1114")
				.build();
		vo[1]=new AddressVO();
		vo[1].setAddr("화정동");
		vo[1].setAge(27);
		
		vo[2]=new AddressVO();
		vo[2].setName("효선");
		vo[3]=new AddressVO();
		vo[3].setTel("1111");
		vo[3].setAge(17);
		
		sv1.printAddrList(vo);
		
		
		
		
		
		
		
		
		
		
		
	

	}

}
