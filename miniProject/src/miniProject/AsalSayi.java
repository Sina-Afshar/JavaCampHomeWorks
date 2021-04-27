package miniProject;

public class AsalSayi {

	public static void main(String[] args) {
		int number = 7; //<<<-- Sonucu ogrenmek istediginiz Sayiyi buraya giriniz
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;
		
		if (number==1) {
			System.out.println("Sayi asal degildir");
			return;
		}
		
		if(number<1){
			System.out.println("Sayi gecersiz");
			return;
		}
		
		for (int i=2; i<number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Sayi asaldir");
			
		}
		else{
			System.out.println("Sayi asal degildir");
		}

	}

}
