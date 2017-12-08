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
        return personRepository.save(person);
    }

    @Override
    public Person getPerson(Integer id) {
        return personRepository.findOne(id);
    }
}
