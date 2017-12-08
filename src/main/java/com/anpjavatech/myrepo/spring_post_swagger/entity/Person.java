package com.anpjavatech.myrepo.spring_post_swagger.entity;

import com.anpjavatech.myrepo.spring_post_swagger.entity.embeddable.PersonAddress;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "person_id")
    @ApiModelProperty(required = true, notes = "Id for the person")
    private int person_id;

    @Column(name = "first_name")
    @ApiModelProperty(required = true, notes = "FirstName of the person")
    private String first_name;

    @Column(name = "last_name")
    @ApiModelProperty(notes = "LastName of the person")
    private String last_name;

    @Column(name = "gender")
    @ApiModelProperty(required = true, notes = "Gender - Male or Female")
    private String gender;

    @Column(name = "age")
    @ApiModelProperty(required = true, notes = "Age of the person")
    private int age;

    @Column(name = "martial_status")
    @ApiModelProperty(required = true, notes = "Martial Status - Single or Married")
    private String martial_status;

    @Column(name = "email")
    @ApiModelProperty(required = true, notes = "Email of the person")
    private String email;

    @Column(name = "mobile_number")
    @ApiModelProperty(required = true, notes = "Mobile Number of the person")
    private String mobile_number;

    @Embedded
    private PersonAddress personAddress;

    public Person() {
    }

    public Person(String first_name, String last_name, String gender, int age, String martial_status,
                  String email, String mobile_number, PersonAddress personAddress) {

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

        return first_name == person.first_name;
    }

    @Override
    public int hashCode() {
        return first_name.hashCode();
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
