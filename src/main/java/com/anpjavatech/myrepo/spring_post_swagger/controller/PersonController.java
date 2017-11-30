package com.anpjavatech.myrepo.spring_post_swagger.controller;

import com.anpjavatech.myrepo.spring_post_swagger.entity.Person;
import com.anpjavatech.myrepo.spring_post_swagger.entity.dto.PersonDto;
import com.anpjavatech.myrepo.spring_post_swagger.entity.embeddable.PersonAddress;
import com.anpjavatech.myrepo.spring_post_swagger.service.impl.PersonServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import javax.validation.Valid;

@RestController
@RequestMapping("/person")
@Api(value = "Person Details",description = "This is to save the Person details in postgreSQL db")
public class PersonController {

    @Autowired
    PersonServiceImpl personService;


    @ApiOperation(value = "Check Service Availability",
            notes = "This is to check the service availability",
            response = String.class,
            httpMethod = "GET")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Response success", response = String.class),
            @ApiResponse(code = 404,message = "Service Not Available"),
            @ApiResponse(code=500,message = "Service Not Available")
    })
    @GetMapping(value = "/")
    public String getMessage(){
        return "Service Running Successfully";
    }

    @ApiOperation(value = "To save Person details",
            notes = "This is to save the person details in to postgreSQL database",
            response = Person.class,
            httpMethod = "POST",
            produces = "application/json")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Person object is saved successfully", response = Person.class),
            @ApiResponse(code = 404,message = "Service Not Available"),
            @ApiResponse(code=500,message = "Service Not Available")
    })
    @PostMapping(value = "/save",produces = "application/json")
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
