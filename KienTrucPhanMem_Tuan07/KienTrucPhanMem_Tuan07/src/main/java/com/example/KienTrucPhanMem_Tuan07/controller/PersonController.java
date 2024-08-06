/*
 * @ (#) PersonController.java     1.0     3/24/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved
 */
package com.example.KienTrucPhanMem_Tuan07.controller;

import com.example.KienTrucPhanMem_Tuan07.model.Person;
import com.example.KienTrucPhanMem_Tuan07.repositories.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 * @description:
 * @author: Huynh Minh Thu
 * @date: 2:19 PM 3/24/2024
 * @version: 1.0
 */
@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class PersonController {
    private final PersonRepository personRepository;

    @GetMapping("/getPerson")
    public ResponseEntity<List<Person>> getAllPerson(){
        return ResponseEntity.ok(personRepository.findAll());
    }
    @GetMapping("/getPerson/{id}")
    public ResponseEntity<Person> getPersonById(long id){
        return ResponseEntity.ok(personRepository.findById(id).orElse(null));
    }
    @GetMapping("/addPerson")
    public ResponseEntity<Person> addPerson(Person person){
        return ResponseEntity.ok(personRepository.save(person));
    }


}
