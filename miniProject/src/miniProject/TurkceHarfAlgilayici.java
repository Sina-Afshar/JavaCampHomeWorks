package miniProject;

public class TurkceHarfAlgilayici {

	public static void main(String[] args) {
		char harf = 'W';
		switch (harf) {
		case'A', 'I','O','U' :
			System.out.println("Girilen harf kal�n sesli harftir");
			break;
		
		case'E', '�','�','�' :
			System.out.println("Girilen harf ince sesli harftir");
			return;
		case 'T', '�', 'S', 'P', 'K', 'H', 'F', '�':
			System.out.println("Girilen harf sert sessiz harftir");
			return;
			
		case 'V', 'Y', 'Z', 'R', 'N', 'M', 'L', 'J', '�', 'G', 'D', 'C', 'B' :
			System.out.println("Girilen harf yumu�ak sessiz harftir");
			return;
			
		default:
			System.out.println("L�tfen T�rk�e karakter giriniz");
		
						
	}
		
		
	}

}
