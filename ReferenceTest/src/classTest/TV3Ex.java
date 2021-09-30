package classTest;

public class TV3Ex {

	public static void main(String[] args) {
		TV3 tv1 = new TV3();
		TV3 tv2 = new TV3();
		TV3 tv3 = new TV3();
		
		TV3 tvArr[] = new TV3[3];
		tvArr[0] = new TV3("»¡°­",true,2);
		tvArr[1] = new TV3("ÆÄ¶û",false,5);
		tvArr[2] = new TV3("º¸¶ó",true,7);
		
		printArr(tvArr);
		
	}
	
	static void printArr(TV3 tvArr[]) {
		for(int i=0;i<tvArr.length;i++) {
			System.out.println("ÇöÀç TV »ö»ó : "+tvArr[i].getColor());
			System.out.println("Àü¿ø : "+tvArr[i].isPower());
			System.out.println("ÇöÀç TV Ã¤³ã : "+tvArr[i].getChannel());
		}
	}

}
