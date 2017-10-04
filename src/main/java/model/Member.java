package model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table
public class Member {
    
	
	//TODO list of teams which a member belongs to + constructors
	
	public Member() {
	
	}
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int member_id;
	
	@Column
	private boolean administrator; // this value say if the member is an administrator of the given team
	
	@Column
	@NotEmpty
	private String firstName;
	
	@Column
	@NotEmpty
	private String lastName;
	
	@Column
	@NotEmpty
	private String email;
	
	@Column
	private String phoneNumber;
	
	@Column
	@NotEmpty
	private String password;
	
	@Column
	private String favouriteSports;
	
	@Embedded
	private Address address;
	
	@ManyToMany
	private List<Team> teams;

	public int getMember_id() {
		return member_id;
	}

	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFavouriteSports() {
		return favouriteSports;
	}

	public void setFavouriteSports(String favouriteSports) {
		this.favouriteSports = favouriteSports;
	}

	public boolean isAdministrator() {
		return administrator;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}
	
	
	 
	
	
	
}