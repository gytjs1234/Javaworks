package com.callor.app.exec;

import java.util.ArrayList;
import java.util.List;

import com.callor.app.model.BookVO;

public class Exec3 {
	public static void main(String[] args) {
		List<BookVO> bookList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			BookVO vo = new BookVO();
			String title=((int)(Math.random()*1000)+100)+"";
			vo.setTitle(title);
			vo.setComp("이지즈퍼블리시");
			
			bookList.add(vo);

		}

	}

}
