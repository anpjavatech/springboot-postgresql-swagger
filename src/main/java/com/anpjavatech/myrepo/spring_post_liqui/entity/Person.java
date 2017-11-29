package com.anpjavatech.myrepo.spring_post_liqui.entity;

import com.anpjavatech.myrepo.spring_post_liqui.entity.embeddable.PersonAddress;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    private int person_id;

    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "gender")
    private String gender;

    @Column(name = "age")
    private int age;

    @Column(name = "martial_status")
    private String martial_status;

    @Column(name = "email")
    private String email;

    @Column(name = "mobile_number")
    private String mobile_number;

    @Embedded
    private PersonAddress personAddress;

    public Person() {
        System.out.println("Default constructor is called");
    }

    public Person(int person_id, String first_name, String last_name, String gender, int age, String martial_status,
                  String email, String mobile_number, PersonAddress personAddress) {

        this.person_id = person_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.martial_status = martial_status;
        this.email = email;
        this.mobile_number = mobile_number;
        this.personAddress = personAddress;
    }

    public int getPerson_id() {
        return person_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getMartial_status() {
        return martial_status;
    }

    public String getEmail() {
        return email;
    }

    public String getMobile_number() {
        return mobile_number;
    }

    public PersonAddress getPersonAddress() {
        return personAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return person_id == person.person_id;
    }

    @Override
    public int hashCode() {
        return person_id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", martial_status='" + martial_status + '\'' +
                ", email='" + email + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", personAddress=" + personAddress +
                '}';
    }
}
