package api.web.firebase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import api.web.firebase.model.User;
import api.web.firebase.service.UserApi;


@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserApi userApi;

    @PostMapping(value = "/save/{id}")
	public ResponseEntity<String> save(@RequestBody User user, @PathVariable String id) throws Exception {
		if (id == null || id.length() == 0 || id.equals("null")) {
			id = userApi.save(user);
		} else {
			userApi.save(user, id);
		}
		return new ResponseEntity<String>(id, HttpStatus.OK);
	}
    
}
