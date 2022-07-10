package api.web.firebase.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import api.web.firebase.model.User;
import api.web.firebase.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/user")
    public String savePerson(@RequestBody User user) throws InterruptedException, ExecutionException {
        return personService.savePerson(user);
    }
    
}
