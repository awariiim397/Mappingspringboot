package mapping.onetoOne.OTOmapdemo;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user/api")
public class UserController {
	
	@Autowired
	
	UserService userService;

//	public UserController(UserService userService) {
//		this.userService = userService;
//	}

	@GetMapping("/alluser")
	public List<User> getAllusers() {
		return userService.getAllUsers();

	}

	
	@PostMapping("/createUser")
	public User createUser(@RequestBody User user) {
		
		return userService.createUser(user);
		

	}

	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id);

	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);

	}
	
	
	
	// Endpoint to get all profiles by user ID
    @GetMapping("/user/{userId}")
    public List<Profile> getProfilesByUserId(@PathVariable Long userId) {
        return userService.getProfilesByUserId(userId);
    }
	

}
