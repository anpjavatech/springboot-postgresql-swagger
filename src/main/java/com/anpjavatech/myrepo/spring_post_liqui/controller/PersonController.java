package com.anpjavatech.myrepo.spring_post_liqui.controller;

import com.anpjavatech.myrepo.spring_post_liqui.entity.Person;
import com.anpjavatech.myrepo.spring_post_liqui.entity.dto.PersonDto;
import com.anpjavatech.myrepo.spring_post_liqui.entity.embeddable.PersonAddress;
import com.anpjavatech.myrepo.spring_post_liqui.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PersonController {

    @Autowired
    PersonServiceImpl personService;

    @GetMapping("/")
    public String getMessage(){
        return "Service Running Successfully";
    }

    @PostMapping("/save")
    public Person savePersonDetails(@Valid @RequestBody PersonDto personDto){
        System.out.println("person dto :: "+personDto);
        return personService.savePerson(generatePersonFromDto(personDto));
    }

    private Person generatePersonFromDto(PersonDto personDto) {
        System.out.println("To create the Person Entity.");
        PersonAddress personAddress = new PersonAddress(personDto.getAddress_line_1(),personDto.getAddress_line_2(),
                                                        personDto.getState(),personDto.getPostal_code());

        return new Person(personDto.getPerson_id(), personDto.getFirst_name(), personDto.getLast_name(),
                                    personDto.getGender(), personDto.getAge(), personDto.getMartial_status(),
                                    personDto.getEmail(),personDto.getMobile_number(),personAddress);
    }


}
