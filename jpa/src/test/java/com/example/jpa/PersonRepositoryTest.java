package com.example.jpa;

import com.example.jpa.entity.Person;
import com.example.jpa.repository.PersonRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {

	@Autowired
	private PersonRepository personRepository;


	@Test
	public void userSave() {

		Person person = new Person();
		person.setUsername("roberto");
		person.setPasswrd("pallotta");

		personRepository.save(person);
	}

}
