package user.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import user.model.User;
import user.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping(method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String create(@RequestBody User user) {
		try {
			userRepository.save(user);
			return "User " + user.getLogin() + " created!";
		}
		catch(IllegalArgumentException ex) {
			return "Error: " + ex;
		}
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Optional<User> read(@PathVariable String id) {
		return userRepository.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String update(@RequestBody User user) {
		try {
			userRepository.save(user);
			return "User " + user.getLogin() + " updated!";
		}
		catch(IllegalArgumentException ex) {
			return "Error: " + ex;
		}
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable String id) {
		try {
			userRepository.deleteById(id);
			return "User with " + id + " deleted!";
		}
		catch(IllegalArgumentException ex) {
			return "Error: " + ex;
		}
	}
}
