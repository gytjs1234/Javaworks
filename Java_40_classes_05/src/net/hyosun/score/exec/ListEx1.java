package net.hyosun.score.exec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListEx1 {
//set:변수에 값을 저장하는 메서드(0.30)영번째에 30을 저장해라   //get:변수에 값을 읽어오는 메서드
	public static void main(String[] args) {
		List<Integer> nums1 = new ArrayList<Integer>();
		List<Float> nums2 = new LinkedList<Float>();

		// 3개의요소를 같는 List
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);

		int num0 = nums1.get(0);
		System.out.println(num0);

		System.out.println(nums1.get(1));
		System.out.println(nums1.get(2));

		// 현재 3개의 데이터만 추가되어 있기 떄문에
		// index 3번쨰 요소의 값은 get()할수가 없다
		// System.out.println(nums1.get(3));

		// size():개수를 세어서 리턴해줌
		for (int i = 0; i < nums1.size(); i++) {
			System.out.println(nums1.get(i));
		}
		// 위코드에서 nums1.size()는 nums1의 요소 개수만큼 반복하여 호출 실행된다
		// 이는 비 효율적인 코드가 될것이다.
		int nums1Len = nums1.size();
		for (int i = 0; i < nums1Len; i++) {
			Integer num = nums1.get(i);
			System.out.println(nums1.get(i));
		}

		for (Integer num : nums1) {
			System.out.println(num);
		}

	}

}
