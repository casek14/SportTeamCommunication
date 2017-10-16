package model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * This class represents a teams
 * @author casek
 *
 */
@Entity
@Table
public class Team {

	
	public Team () {
		
	}
	
	@Column
	@NotEmpty
	private String name;
	
	@Column
	private String description;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int team_id;

	
	@OneToMany(mappedBy="message_id")
	private List<Message> messages;
	
	@OneToMany(mappedBy="event_id")
	private List<Event> events;
	
	@ManyToMany
	@JoinColumn()
	private List<Member> members;
	// TODO list of members + contructors
	
	
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

	public int getTeam_id() {
		return team_id;
	}

	public void setTeam_id(int team_id) {
		this.team_id = team_id;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public List<Member> getMembers() {
		return members;
	}

	public void setMembers(List<Member> members) {
		this.members = members;
	}
	
	
	
	
	
	
	
}
