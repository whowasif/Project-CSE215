package AdminCourse;

import java.io.Serializable;

public class Course implements Serializable {
	private String name,intial,credit,faculty;

	public Course(String name, String intial, String credit, String faculty) {
		super();
		this.name = name;
		this.intial = intial;
		this.credit = credit;
		this.faculty = faculty;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntial() {
		return intial;
	}

	public void setIntial(String intial) {
		this.intial = intial;
	}

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", intial=" + intial + ", credit=" + credit + ", faculty=" + faculty + "]";
	}
	

}
