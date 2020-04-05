package report03;

public class class_Sale_1 {

	public static void main(String[] args) {
		int sale[] = new int[] {157,259,251,312};
		
		for(int i=0; i<4; i++)
			System.out.printf("%d/4분기: sale[%d]= %d%n", i+1,i,sale[i]);
		                   //                            0+1,0,sale[0]
		                   //                             1, 0,sake[0]
		                   //  %가 가져오는 것 같음 뒤에 값을
		                   //   1/4분기: sale[0] = sale[0]의 값을 가져오기
		                   //결과값->  1/4분기: sale[0] = 157
	}
}