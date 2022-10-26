import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		// Create the Student array and fill it with the student object

		List<Student> students = new ArrayList<>();
		students.add(new Student("Mario", "Rossi", 29));
		students.add(new Student("Francesca", "Di Stefano", 24));
		students.add(new Student("Michael", "Piccirilli", 27));
		students.add(new Student("Francesco","Di Giuseppe", 19));
		
		System.out.println("Original list: ");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println();
		
		
		//With Comparator (decreasing order of GPAs)
		SortableVector sv = new SortableVector();
		students.sort(sv);
		
		System.out.println("Comparator sorting (decreasing order of GPAs): ");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println();
		
		
		//With Comparable (alphabetical order)
		Collections.sort(students);
		System.out.println("Comparable sorting (alphabetical order): ");
		for (Student student : students) {
			System.out.println(student.toString());
		}
		System.out.println();
		
	}

}
