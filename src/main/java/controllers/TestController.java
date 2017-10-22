package controllers;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.MemberDao;
import model.Address;
import model.Comment;
import model.Event;
import model.Member;
import model.Message;
import model.Team;
import services.CommentService;
import services.EventService;
import services.MemberService;
import services.MessageService;
import services.TeamService;

/**
 * Test class for testing hibernate saving and selecting from database
 * @author casek
 *
 */
@Controller
public class TestController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private MemberService memberService;
	
	@Autowired
	private CommentService commentService;
	
	@Autowired
	private EventService eventService;
	
	@Autowired
	private MessageService messageService;
	
	@Autowired
	private TeamService teamService;
	
	
	Address address = new Address();
	Comment comment = new Comment();
	Comment comment1 = new Comment();
	Event event = new Event();
	Member member = new Member();
	Message  message = new Message();
	Team team = new Team();


	Address address1 = new Address();
	Comment comment2 = new Comment();
	Comment comment3 = new Comment();
	Event event1 = new Event();
	Member member1 = new Member();
	Message  message1 = new Message();
	Team team1 = new Team();

	
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() {
		address.setCity("Praha");
		address.setCp("16");
		address.setPostCode("714 20");
		address.setStreet("Thamova");
		
		address1.setCity("New York");
		address1.setCp("16");
		address1.setPostCode("714 20");
		address1.setStreet("green street");
		
		comment.setDate("23:03/9/3/2017");
		comment.setText("Cauko !!");
		comment1.setDate("8:50/8/6/2017");
		comment1.setText("kdjalfjsdkfjlksdj fsdkjf kjsdfk jsdkfjls");
		
		comment2.setDate("23:03/9/3/2017");
		comment2.setText("Zdarec karle.");
		comment3.setDate("8:50/8/6/2017");
		comment3.setText("Nein");
		
		
		event.setDate("15:00/7/10/2017");
		event.setDescription("Football match with Czech Republic");
		event.setName("INTERNATIONAL FOOTBALL MATCH");
	    event.getComments().add(comment);
	    event.getComments().add(comment1);
	    event1.setDate("15:00/7/8/2017");
		event1.setDescription("Prague Marathon");
		event1.setName("Long run");
	    event1.getComments().add(comment2);
	    event1.getComments().add(comment3);
		
	    
		
	    member.setAdministrator(false);
		member.setEmail("jura-cach@gmail.com");
		member.setFavouriteSports("Fotbal, hokej, ping-pong");
		member.setFirstName("Pepa");
		member.setLastName("Vomacka");
		member.setPassword("workshop");
		member.setPhoneNumber("111-222-333");
		member.setAddress(address);
		
		member1.setAdministrator(false);
		member1.setEmail("dwarf007@gmail.com");
		member1.setFavouriteSports("Posilovna, gaucing");
		member1.setFirstName("Jana");
		member1.setLastName("Novakova");
		member1.setPassword("workshop");
		member1.setPhoneNumber("987-654-321");
		member1.setAddress(address1);
		
		message.setAuthor(member.getLastName());
		message.setDate("5/10/2017");
		message.setText("Cauko !");
		
		team.setDescription("This is the best sport team group !");
		team.setName("FC Slavoj Houslice");
		team.getEvents().add(event);
        team.getMessages().add(message);		
		team.getMembers().add(member);
		team.getMembers().add(member1);
		
		member.getTeams().add(team);
        member1.getTeams().add(team);
        
        /*
		Uncoment kdyz chces ukladat
		memberService.saveMember(member);
		commentService.saveComment(comment);
		commentService.saveComment(comment1);
		eventService.saveEvent(event);
		messageService.saveMessage(message);
		
		memberService.saveMember(member1);
		commentService.saveComment(comment2);
		commentService.saveComment(comment3);
		eventService.saveEvent(event1);
		messageService.saveMessage(message1);
		
		teamService.saveTeam(team);	
		*/
         
        
        
		return "test";
	}
	
	
}
