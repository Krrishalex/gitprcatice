package student;

public class Student {

	private String name;
	private String phone;
	private int roll;
	private String college;
	private String branch;
	public Student(String name, String phone, int roll, String college, String branch) {
		
		this.name = name;
		this.phone = phone;
		this.roll = roll;
		this.college = college;
		this.branch = branch;
		
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
