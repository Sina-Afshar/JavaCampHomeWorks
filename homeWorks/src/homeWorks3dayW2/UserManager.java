package homeWorks3dayW2;

public class UserManager {
	public void add(User user) {
		System.out.println("Kayd�n�z Olu�turuldu! "+user.getFirstName()+" "+ user.getLastName());
	}
	
	public void delete(User user) {
		System.out.println("Kayd�n�z Silindi! "+user.getFirstName()+" "+ user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("Kayd�n�z G�ncellendi! "+user.getFirstName()+" "+ user.getLastName());
	}
}
