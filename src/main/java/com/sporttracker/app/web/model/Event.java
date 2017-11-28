package com.sporttracker.app.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Event {

	public Event() {
		
	}
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int event_id;
	
	@Column
	@NotEmpty
	private String name;
	
	@Column
	private String description;
	
	/*
	 * cas konani ve formatu HH:mm (17:45)
	 */
	@NotEmpty
	@DateTimeFormat(pattern="HH:mm")
	private Date time;
	
	/*
	 *datum konani ve formatu dd/MM/yyyy (12/6/2017) 
	 */
	@NotEmpty	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private Date date;
	
	
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

	

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	

	public List<Member> getLoggedUsers() {
		return loggedUsers;
	}

	public void setLoggedUsers(List<Member> loggedUsers) {
		this.loggedUsers = loggedUsers;
	}
	
	
	
}
