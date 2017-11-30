package com.anpjavatech.myrepo.spring_post_swagger.service.impl;

import com.anpjavatech.myrepo.spring_post_swagger.entity.Person;
import com.anpjavatech.myrepo.spring_post_swagger.repository.PersonRepository;
import com.anpjavatech.myrepo.spring_post_swagger.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
