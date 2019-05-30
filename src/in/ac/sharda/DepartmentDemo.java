package in.ac.sharda;

public class DepartmentDemo {

	public static void main(String[] args) {
		Department d = new Department(1);
		for (int i = 1; i < 26; i++) {
			d.addStudent(new Student(1, "Amit"));
		}

		d.printStudents();
	}

}
