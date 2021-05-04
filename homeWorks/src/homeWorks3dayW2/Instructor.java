package homeWorks3dayW2;

public class Instructor extends User {
	private String branch;

	public Instructor() {}
	
	public Instructor(int id, String firstName, String lastName, String eMail, String branch) {
		super(id, firstName, lastName, eMail);
		this.branch = branch;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
}