import java.util.Comparator;

public class SortableVector implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		//Decreasing order of GPAs
		if(o1.getGpa() == o2.getGpa()) return 0;
		if(o1.getGpa() > o2.getGpa()) return -1;
		else return 1;
	}

}
