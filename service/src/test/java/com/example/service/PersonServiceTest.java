package com.example.service;

import com.example.common.dto.PersonDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    public void userSave(){

        PersonDTO user = new PersonDTO();
        user.setUsername("roberto");
        user.setPasswrd("pallotta");

        personService.savePerson(user);

    }

}
