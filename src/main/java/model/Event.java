package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Event {

	public Event() {
		
	}
	
	@OneToOne
	private Comment comment;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int event_id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private String date;
	
	@ManyToOne
	@JoinColumn(name="team_id")
	private Team team;
	
	@OneToMany(mappedBy="event")
	private List<Comment> comments;

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
	
	
	
}
