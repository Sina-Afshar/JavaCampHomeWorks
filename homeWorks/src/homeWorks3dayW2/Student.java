package homeWorks3dayW2;

public class Student extends User {
	private int studentNo;

	public Student(int id, String firstName, String lastName, String eMail, int studentNo) {
		super(id, firstName, lastName, eMail);
		this.studentNo = studentNo;
	}
	
	public Student(){}
	
	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	
}
