package api.web.firebase.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import api.web.firebase.model.User;
import api.web.firebase.model.UserDTO;
import api.web.firebase.service.UserApi;


@RestController
@RequestMapping("api/user")
@CrossOrigin("*")
public class UserController {

    private final UserApi userApi;

	public UserController(UserApi userApi) {
		this.userApi = userApi;
	}

	@PostMapping(value = "/save/{id}")
	public ResponseEntity<String> save(@RequestBody User user, @PathVariable String id) throws Exception {
		if (id == null || id.length() == 0 || id.equals("null")) {
			id = userApi.save(user);
		} else {
			userApi.save(user, id);
		}
		return new ResponseEntity<>(id, HttpStatus.OK);
	}

	@GetMapping(value = "/find")
	public List<UserDTO> getAll() throws Exception {
		return userApi.getAll();
	}

	@GetMapping(value = "/find/{username}")
	public UserDTO find(@PathVariable String username) throws Exception {
		List<UserDTO> users = userApi.getAll();
		for (UserDTO user : users) {
			if (user.getUsername().equals(username)) {
				System.out.println(user);
				return user;
			}
		}
		return null;
	}

	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<UserDTO> delete(@PathVariable String id) throws Exception {
		UserDTO user = userApi.get(id);
		if (user != null) {
			userApi.delete(id);
		} else {
			return new ResponseEntity<UserDTO>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
	}
	
}