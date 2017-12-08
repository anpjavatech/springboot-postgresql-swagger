package com.anpjavatech.myrepo.spring_post_swagger.entity.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

public class PersonDto {

    @JsonProperty(required = true)
    @NotNull
    private String first_name;

    @NotNull
    private String last_name;

    @JsonProperty(required = true)
    @NotNull
    private String gender;

    @JsonProperty(required = true)
    @NotNull
    private int age;

    @JsonProperty(defaultValue = "Single")
    @NotNull
    private String martial_status;

    @JsonProperty(required = true)
    @NotNull
    private String email;

    @JsonProperty(required = true)
    @NotNull
    private String mobile_number;

    @JsonProperty(defaultValue = " ")
    private String address_line_1;

    @JsonProperty(defaultValue = " ")
    private String address_line_2;

    @JsonProperty(defaultValue = " ")
    private String state;

    @JsonProperty(defaultValue = "0")
    private int postal_code;

    public PersonDto(@JsonProperty("first_name") String first_name,
                     @JsonProperty("last_name") String last_name,@JsonProperty("gender") String gender,
                     @JsonProperty("age")int age,@JsonProperty("martial_status")String martial_status,
                     @JsonProperty("email")String email,@JsonProperty("mobile_number") String mobile_number,
                     @JsonProperty("address_line_1")String address_line_1,@JsonProperty("address_line_2")String address_line_2,
                     @JsonProperty("state")String state,@JsonProperty("postal_code")int postal_code) {

        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.age = age;
        this.martial_status = martial_status;
        this.email = email;
        this.mobile_number = mobile_number;
        this.address_line_1 = address_line_1;
        this.address_line_2 = address_line_2;
        this.state = state;
        this.postal_code = postal_code;
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

    @Override
    public String toString() {
        return "PersonDto{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", martial_status='" + martial_status + '\'' +
                ", email='" + email + '\'' +
                ", mobile_number='" + mobile_number + '\'' +
                ", address_line_1='" + address_line_1 + '\'' +
                ", address_line_2='" + address_line_2 + '\'' +
                ", state='" + state + '\'' +
                ", postal_code=" + postal_code +
                '}';
    }
}
