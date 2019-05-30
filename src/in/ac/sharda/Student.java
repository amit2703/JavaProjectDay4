package in.ac.sharda;

public class Student {

	private final int rollnumber;
	private final String name;
	private String email;

	public Student(int rn, String n) {
		this.rollnumber = rn;
		this.name = n;
	}

	public Student(int rn, String n, String email) {
		this.rollnumber = rn;
		this.name = n;
		this.email = email;
	}

	public void attendance() {
		System.out.println("The student is present");
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			return ((Student) obj).getRollnumber() == rollnumber;

		}

		return false;
	}

}
