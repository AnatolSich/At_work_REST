package app.controller;


import app.model.Contact;
import app.repository.ContactsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by TEMAPROF on 11.06.2017.
 */

@RestController
@RequestMapping(value = "/")
public class UserController {

    private ContactsRepository repository;

    @Autowired
    public UserController(ContactsRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }

    @GetMapping(value = "/hello/contacts", produces = APPLICATION_JSON_VALUE)
    public Collection<Contact> findAllContactsByRegExp(@RequestParam(value = "nameFilter", required = true) String nameFilter){
        return repository.findContactsByRegExp(nameFilter);
    }
}
