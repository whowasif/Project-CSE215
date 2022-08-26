package AdminAdmin;

import java.io.Serializable;

public class Admin implements Serializable {
	
	private String name,id,email,phn,gender,pass;

	@Override
	public String toString() {
		return "Admin [name=" + name + ", id=" + id + ", email=" + email + ", phn=" + phn + ", gender=" + gender
				+ ", pass=" + pass + "]";
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

	public Admin(String name, String id, String email, String phn, String gender, String pass) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.phn = phn;
		this.gender = gender;
		this.pass = pass;
	}
	
	

}
