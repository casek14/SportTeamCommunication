package model;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Event {

	public Event() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int event_id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	@DateTimeFormat(pattern="HH:mm-dd/MM/yyyy")
	private String date;
	
	
	@OneToMany
	private List<Comment> comments = new ArrayList<Comment>();

	
	/**
	 * uzivatele kteri se prihlasili na danou udalost
	 * neboli odklikli ze se dane udalosti zucastni
	 */
	@ManyToMany(mappedBy="events")
	private List<Member> loggedUsers = new ArrayList<Member>();
	
	
	public int getEvent_id() {
		return event_id;
	}

	public void setEvent_id(int event_id) {
		this.event_id = event_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	
	
}
