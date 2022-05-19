package com.callor.app.exec;

import com.callor.app.model.AddressVO;

public class Exec2 {

	public static void main(String[] args) {

		AddressVO[] addrs = new AddressVO[3];
		addrs[0] = new AddressVO();
		addrs[0].setName("홍길동");
		addrs[0].setAge(30);

		addrs[1] = AddressVO.builder().name("dd").age(10).build();

		addrs[2] = AddressVO.builder().name("ㅁㅁ").age(20).build();

		for (AddressVO aVO : addrs) {
			System.out.println(aVO);
		}

		int size = addrs.length;
	
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				// 배열의 i 번째 요소인 aVO 의 나이가 더 큰값이면
				if (addrs[i].getAge() > addrs[j].getAge()) {
					// 배열의 i 요소를 tVO 에 임시저장
					// 배열의 i 번째 요소를 대피
					AddressVO tVO = addrs[i];

					// i 번째 요소위치에 j번째 요소 값을 복사
					addrs[i] = addrs[j];
					// 대피해 두었던 i번째 요소 값을 j번째에 복사
					addrs[j] = tVO;
					
					
					

				}

			}

		}

	}

}
