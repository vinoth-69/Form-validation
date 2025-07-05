package com.example.demo;




import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
	@Size(min = 3, max = 50)
	private String name;
	@NotBlank
	@Email(message = "place enter valid e-mail address")
	private String email;
	@NotBlank
	@Size(min = 8, max = 15)
	private String password;
	private String profession;
	@Size(max= 100)
	private String note;
	private boolean married;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", profession=" + profession
				+ ", note=" + note + ", married=" + married + "]";
	}
	
}

