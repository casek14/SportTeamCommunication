package controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Address;
import model.Comment;
import model.Event;
import model.Member;
import model.Message;
import model.Team;

/**
 * Test class for testing hibernate saving and selecting from database
 * @author casek
 *
 */
@Controller
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	Address address = new Address();
	Comment comment = new Comment();
	Comment comment1 = new Comment();
	Event event = new Event();
	Member member = new Member();
	Message  message = new Message();
	Team team = new Team();
	List<Comment> comments = new ArrayList<Comment>();
	List<Message> messages = new ArrayList<Message>();
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() {
		address.setCity("Praha");
		address.setCp("16");
		address.setPostCode("714 20");
		address.setStreet("Thamova");
		
		comment.setDate("23:03/9/10/2017");
		comment.setText("Bla Bla Bla Bla");
		comment1.setDate("8:50/8/10/2017");
		comment1.setText("LJJSAKLFJSKAJ KJSAFKJ KSAJF LJS AKJFK");
		comments.add(comment);
		comments.add(comment1);
		
		
		event.setDate("15:00/7/10/2017");
		event.setDescription("Football match with Czech Republic");
		event.setName("INTERNATIONAL FOOTBALL MATCH");
	    event.setComments(comments);
	    
	    member.setAdministrator(false);
		member.setEmail("jura-cach@gmail.com");
		member.setFavouriteSports("Fotbal, hokej, ping-pong");
		member.setFirstName("Pepa");
		member.setLastName("Vomacka");
		member.setPassword("workshop");
		member.setPhoneNumber("111-222-333");
		member.setAddress(address);
		
		message.setAuthor(member.getLastName());
		message.setDate("5/10/2017");
		message.setText("Cauko !");
		messages.add(message);
		
		team.setDescription("This is the best sport team group !");
		team.setMessages(messages);
		team.setName("FC Slavoj Houslice");
		
		
		return "test";
	}
	
	
}
