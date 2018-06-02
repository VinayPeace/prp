package basics;

public class StudentReport {
	private int studentid;
	private String firstName;
	private String secondName;
	private String gender;
	private String branch;
	private String dept;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBranch() {
		
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	 
	@Override
	public String toString() {
		return "StudentReport [studentid=" + studentid + ", firstName=" + firstName + ", secondName=" + secondName
				+ ", gender=" + gender + ", branch=" + branch + ", dept=" + dept + "]";
	}


}
