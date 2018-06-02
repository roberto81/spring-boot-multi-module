package com.example.service;

import com.example.common.dto.PersonDTO;
import com.example.configuration.ServiceBean;
import com.example.jpa.entity.Person;
import com.example.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private ServiceBean serviceBean;

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonDTO savePerson(PersonDTO personDTO) {
        Person saveEntity = serviceBean.dozerMapper().map(personDTO,Person.class);
        Person savedEntity = personRepository.save(saveEntity);
        return serviceBean.dozerMapper().map(savedEntity,PersonDTO.class);
    }

}
