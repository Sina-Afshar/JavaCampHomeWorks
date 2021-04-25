package homeWorks2dayW1;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1,"C# ve Angular","Sıfırdan Yazılım Öğrenme");
		Course course2 = new Course(2,"Java ve React","Sıfırdan Yazılım Gelistirme");
		
		//Course[] courses = {course1,course2};
		//test
		
		Instructor instructor1 = new Instructor (1,"Engin Demirog", "Isimli Ogretmenin");
		Instructor instructor2 = new Instructor (1,"Engin Demirog", "Isimli Ogretmenin");
		
		//Instructor[] instructors = {instructor1,instructor2};
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1,instructor1);
		courseManager.addCourse(course2,instructor2);
		
		System.out.println("--------------------------------------");
		
		courseManager.deleteCourse(course1, instructor1);
		courseManager.deleteCourse(course2, instructor2);
		

	}

}
