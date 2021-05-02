package homeWorks3dayW2;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student(1, "Sina", "Afshar", "sina@gmail.com", 12345);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setFirstName("SS");
		student2.setLastName("AA");
		student2.seteMail("sa@gmail.com");
		student2.setStudentNo(67890);
		
		Instructor instructor1 = new Instructor(3, "Engin", "Demirog", "engin@gmail.com", "C# ve Java");
		
		Instructor instructor2 = new Instructor();
		instructor2.setId(4);
		instructor2.setFirstName("EE");
		instructor2.setLastName("DD");
		instructor2.seteMail("ed@gmail.com");
		instructor2.setBranch("Angular ve React");
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.delete(student1);
		userManager.update(student1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.login(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.login(instructor1);
		
		
	}

}
