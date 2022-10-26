public class Student implements Comparable<Student>{

	private String name, surname;
	private Integer gpa;

	public Student(String name, String surname, int gpa) {
		this.name = name;
		this.surname = surname;
		this.gpa = gpa;

	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;		
	}
	
	public Integer getGpa() {
		return gpa;
	}
	
	public void setGpa(Integer gpa) {
		this.gpa = gpa;
	}
		
	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Student)) return false;

		Student student = (Student) obj;
		if (this.getName() == student.getName() && 
			this.getSurname() == student.getSurname() && 
			this.getGpa() == student.getGpa()) {
				return true;
		}
		return false;
	}

	@Override 
	public String toString() {
		
		//Mario Rossi - 26
		return this.getName() +" " + this.getSurname() + " - " + this.getGpa();
		
	}

	@Override
	public int compareTo(Student o) {
		
		/* Compares this object with the specified object for order.  Returns a
	     * negative integer, zero, or a positive integer as this object is less
	     * than, equal to, or greater than the specified object.
	     */

		if (this.getName().compareTo(o.getName()) != 0) {
			return this.getName().compareTo(o.getName());
		} else {
			if(this.getSurname().compareTo(o.getSurname())!= 0) {
				return this.getSurname().compareTo(o.getSurname());
			}
			else {
				if(this.getGpa() != o.getGpa()) {
					if(this.getGpa() > o.getGpa()) return 1;
					else return -1;
				} else return 0;
			}
		}
		
	}

	

}
