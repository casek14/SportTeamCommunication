package model;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.transaction.annotation.Transactional;


@Entity
@Table
public class Member {
    
	
	
	public Member() {

	}
	
	@ManyToMany(mappedBy="members")
	private List<Team> teams = new ArrayList<Team>();
	
	/**
	 * udalosti na ktere se dany user prihlasil
	 */
	@ManyToMany(mappedBy="loggedUsers")
	private List<Event> events = new ArrayList<Event>();
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int member_id;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@Column
	private List<Integer> administrator; // this value say if the member is an administrator of the given team
	
	@Column
	@NotEmpty
	private String firstName;
	
	@Column
	@NotEmpty
	private String lastName;
	
	@Column(unique=true)
	@NotEmpty
	@Email
	private String email;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date dateOfBirth;
	
	@Column
	private String phoneNumber;
	
	@Column
	@NotEmpty
	private String password;
	
	@Column
	private String favouriteSports;
	
	@Embedded
	private Address address;
	

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



	public List<Integer> getAdministrator() {
		return administrator;
	}

	public void setAdministrator(List<Integer> administrator) {
		this.administrator = administrator;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}



	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	 
	
	
	
}