package comm;

import java.io.Serializable;
import java.lang.String;
import java.time.LocalDate;

import javax.persistence.*;
import static javax.persistence.EnumType.STRING;


@Entity

public class Student implements Serializable {

	@Id
	private int id;
	@Column(length = 40, nullable = true)
	private String studentName;
	
	@Column(unique = true, nullable = true)
	private String email;
	private int age;
	
	@Enumerated(STRING)
	private Year year;
	private String address;
	private LocalDate dob;
	private String profile;
	private static final long serialVersionUID = 1L;

	private enum Year{
		First,Second,Third,Fouth,Fifth
	}
	public Student() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}   
	public LocalDate getDob() {
		return this.dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}   
	public String getProfile() {
		return this.profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}
   
}
