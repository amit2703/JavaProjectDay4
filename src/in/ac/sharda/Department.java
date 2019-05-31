package in.ac.sharda;

import java.util.ArrayList;
import java.util.List;

public class Department implements Comparable<Department>, IResultArrivedListener {
	private final int id;
	private List<Student> students = new ArrayList<>();

	public Department(int id) {
		this.id = id;
	}

	public void addStudent(Student student) {
		this.students.add(student);
	}

	public void printStudents() {
		students.parallelStream().forEach(s -> System.out.println(s.getRollnumber()));
	}

	public int getId() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Department) {
			return ((Department) obj).getId() == id;

		}
		return false;
	}

	@Override
	public int compareTo(Department o) {
		return o.getId() - id;
	}

	@Override
	public void resultArrived() {
		// sequential method, it will use only one cpu core
	//	for (Student s : students) {
		//	s.resultArrived();
	//	}
		
		students.parallelStream().forEach(s -> s.resultArrived());

	}

}
