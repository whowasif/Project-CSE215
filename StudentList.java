package Login;

public class StudentList {
	private String name,gender,pass,email,phone,institute,id;

	public StudentList(String name, String gender, String pass, String email, String phone, String institute,
			String id) {
		super();
		this.name = name;
		this.gender = gender;
		this.pass = pass;
		this.email = email;
		this.phone = phone;
		this.institute = institute;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "StudentList [name=" + name + ", gender=" + gender + ", pass=" + pass + ", email=" + email + ", phone="
				+ phone + ", institute=" + institute + ", id=" + id + "]";
	}
	

}
