package AdminStudent;

import java.io.Serializable;

public class Student implements Serializable{
	private String name,id,email,phn,institute,gender,pass;

	public Student(String name, String id, String email, String phn, String institute, String gender,String pass) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.phn = phn;
		this.institute = institute;
		this.gender = gender;
		this.pass=pass;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", email=" + email + ", phn=" + phn + ", institute=" + institute
				+ ", gender=" + gender + ", pass=" + pass + "]";
	}

	
	

}
