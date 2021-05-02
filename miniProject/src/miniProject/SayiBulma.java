package miniProject;

public class SayiBulma {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,3,5,7,9,0};
		int aranacak = 3;  
		boolean varMi = false;
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		if(varMi) {
			System.out.println("Sayi mevcuttur");
		}else {
			System.out.println("Sayi mevcut degildir");
		}
		
	}

}
