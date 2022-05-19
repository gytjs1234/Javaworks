package exec;

import model.AddressVO;

public class Exec01 {
	public static void main(String[] args) {
		AddressVO[]addr=new AddressVO[3];
		
		addr[0]=new AddressVO();
		addr[0].setName("효선");
		addr[0].setAge(27);
		addr[0].setTel("010-3234-9007");
		addr[0].setAddr("화정4동");
		addr[0].setHobby("영화보기");
		System.out.println(addr[0]);
		
		addr[1]=AddressVO.builder().name("모찌")
								.age(1)
								.addr("우리집")
								.hobby("밥먹기")
								.build();
		System.out.println(addr[1]);
		
	}

}
