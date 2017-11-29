package com.anpjavatech.myrepo.spring_post_liqui.repository;

import com.anpjavatech.myrepo.spring_post_liqui.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
