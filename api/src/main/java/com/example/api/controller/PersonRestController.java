package com.example.api.controller;

import com.example.common.dto.PersonDTO;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
public class PersonRestController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "savePerson",method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE} )
    public @ResponseBody
    PersonDTO savePerson(@RequestBody PersonDTO personDTO){
        return  personService.savePerson(personDTO);
    }
}
