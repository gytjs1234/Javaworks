package net.hyosun.var;

public class GUGUDAN_02 {
public static void main(String[] args) {
	
	int intDan = 8;
	int intIndex = 1;

	//미리 출력할 모양을 만들고("%d x %d =  %d")
	//뒤에 나열된 값을 순서대로 %d대신 부착하여 console에 출력하기
	//양식을 미리만들고 (form)모양에 따라 값을 출력하는 용도의 method
	// "\n" :println 처럼 출력후 줄바꿈하기
	// "\t" :키보드의 Tab 키를 누른것처럼 간격을 띄우기
	// "%d" :정수형 숫자를 표현하는 기호
	// 변수명 뒤에있는 ++는 ()안에있는 명령문이 모두 실행되고 나서 마지막에 실행된다.
	
	System.out.printf("\t%d x%d =%d\n" ,intDan ,intIndex, intDan*intIndex++);
	System.out.printf("\t%d x%d =%d\n" ,intDan ,intIndex, intDan*intIndex++);
	System.out.printf("\t%d x%d =%d\n" ,intDan ,intIndex, intDan*intIndex++);
	System.out.printf("\t%d x%d =%d\n" ,intDan ,intIndex, intDan*intIndex++);
	System.out.printf("\t%d x%d =%d\n" ,intDan ,intIndex, intDan*intIndex++);
	System.out.printf("\t%d x%d =%d\n" ,intDan ,intIndex, intDan*intIndex++);
	System.out.printf("\t%d x%d =%d\n" ,intDan ,intIndex, intDan*intIndex++);
	System.out.printf("\t%d x%d =%d\n" ,intDan ,intIndex, intDan*intIndex++);
	System.out.printf("\t%d x%d =%d\n" ,intDan ,intIndex, intDan*intIndex++);
	
	
	
	
	
	
	
	
	
	
}
}
