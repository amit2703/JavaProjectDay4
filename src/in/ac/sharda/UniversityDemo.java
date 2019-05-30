package in.ac.sharda;

public class UniversityDemo {

	public static void main(String[] args) {
		University u = new University();
		for (int i = 1; i < 21; i++) {
			boolean added = u.addDepartment(new Department(i));
			if (added) {
				System.out.println("Department added");
			} else {
				System.out.println("Not added");
			}
		}
		u.printDepartment();

	}

}
