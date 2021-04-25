package homeWorks2dayW1;

public class CourseManager {
	public void addCourse(Course course, Instructor instructor) {
		System.out.println(instructor.name +"  "+ instructor.instructorAdd +" , "+ course.name + " isimli kursu baþarýyla eklendi.");
	}
	
		public void deleteCourse(Course course, Instructor instructor) {
			System.out.println(instructor.name +"  "+ instructor.instructorAdd +" , "+ course.name + " isimli kursu baþarýyla silindi.");
	} 
}
