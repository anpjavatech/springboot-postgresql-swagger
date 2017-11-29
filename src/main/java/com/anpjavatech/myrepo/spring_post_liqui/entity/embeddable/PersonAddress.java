package com.anpjavatech.myrepo.spring_post_liqui.entity.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PersonAddress {

    @Column(name = "address_line_1")
    private String address_line_1;

    @Column(name = "address_line_2")
    private String address_line_2;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code")
    private int postal_code;

    public PersonAddress() {
        System.out.printf("Default constructor for Person Address");
    }

    public PersonAddress(String address_line_1, String address_line_2, String state, int postal_code) {
        this.address_line_1 = address_line_1;
        this.address_line_2 = address_line_2;
        this.state = state;
        this.postal_code = postal_code;
    }

    public String getAddress_line_1() {
        return address_line_1;
    }

    public String getAddress_line_2() {
        return address_line_2;
    }

    public String getState() {
        return state;
    }

    public int getPostal_code() {
        return postal_code;
    }
}
