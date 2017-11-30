package com.anpjavatech.myrepo.spring_post_swagger.repository;

import com.anpjavatech.myrepo.spring_post_swagger.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
