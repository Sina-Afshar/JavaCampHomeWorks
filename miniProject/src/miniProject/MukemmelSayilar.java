package miniProject;

public class MukemmelSayilar {

	public static void main(String[] args) {
		//6 -->1,2,3
		//28 -->1,2,4,7,14
		//496 --> 1,2,4,8,16,31,62,124,248,
		int number = 496;
		int total = 0;
		
		for(int i=1; i<number;i++) {
			
			if(number % i == 0) {
				total = total + i;
			}
		}
		
			if(total == number) {
				System.out.println("Mukemmel sayidir");
				//return;
			}
			else {
				System.out.println("Mukemmel sayi degildir");
				//return;
				
			}
			

	}
	
}