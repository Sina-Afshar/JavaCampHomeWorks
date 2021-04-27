package miniProject;

public class TurkceHarfAlgilayici {

	public static void main(String[] args) {
		char harf = 'W';
		switch (harf) {
		case'A', 'I','O','U' :
			System.out.println("Girilen harf kalýn sesli harftir");
			break;
		
		case'E', 'Ý','Ö','Ü' :
			System.out.println("Girilen harf ince sesli harftir");
			return;
		case 'T', 'Þ', 'S', 'P', 'K', 'H', 'F', 'Ç':
			System.out.println("Girilen harf sert sessiz harftir");
			return;
			
		case 'V', 'Y', 'Z', 'R', 'N', 'M', 'L', 'J', 'Ð', 'G', 'D', 'C', 'B' :
			System.out.println("Girilen harf yumuþak sessiz harftir");
			return;
			
		default:
			System.out.println("Lütfen Türkçe karakter giriniz");
		
						
	}
		
		
	}

}
