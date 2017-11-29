package com.anpjavatech.myrepo.spring_post_liqui.service.impl;

import com.anpjavatech.myrepo.spring_post_liqui.entity.Person;
import com.anpjavatech.myrepo.spring_post_liqui.repository.PersonRepository;
import com.anpjavatech.myrepo.spring_post_liqui.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sound.midi.Soundbank;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    PersonRepository personRepository;

    @Override
    public Person savePerson(Person person) {
        System.out.println("In Service repo to save the entity");
        return personRepository.save(person);
    }
}
