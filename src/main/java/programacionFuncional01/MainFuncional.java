package programacionFuncional01;

import java.util.List;

public class MainFuncional {

	public static void main(String[] args) {

		List<Integer> numberList = List.of(18, 6, 4, 15, 55, 78, 12, 9, 8);
		
		long result = numberList.stream().filter(number -> number > 10).count();
		
		System.out.println("Hay un total de " + result + " números que son mayor de 10");

		

	}

}
