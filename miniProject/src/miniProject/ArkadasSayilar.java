package miniProject;

public class ArkadasSayilar {

	public static void main(String[] args) {
		//Ýlk 10 arkadaþ sayý çifti (220, 284), (1184, 1210), (2620, 2924), 
		//(5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), 
		//(17296, 18416), (63020, 76084), ve (66928, 66992)’dir.
		
		int sayi1 = 1184;
		int sayi2 = 1210;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i=1; i<sayi1; i++) {
			if(sayi1%i==0) {
				toplam1 = toplam1 + i;
			}		
		}
		
		for(int i=1; i<sayi2; i++) {
			if(sayi2%i==0) {
				toplam2 = toplam2 + i;
			}
		}
		
		if(sayi1==toplam2 && sayi2==toplam1) {
			System.out.println("bu iki sayi arkadasdir");
		}
		else {
			System.out.println("bu iki sayi arkadas degildir");
		}
	}

}
