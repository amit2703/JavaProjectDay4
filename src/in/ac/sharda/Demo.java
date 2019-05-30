package in.ac.sharda;

public class Demo {

	public static void main(String[] args) {
		Student s = new Student(1, "Amit","amit@gmail.com");
		Student s2 = new  Student(2, "Amit","amit@gmail.com");
		System.out.println(s.equals(s2));
		System.out.println(s2.getName());
		System.out.println(s2.getEmail());
	}

}
