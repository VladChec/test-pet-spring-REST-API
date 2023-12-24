package com.example.petrestapi.services;

import com.example.petrestapi.models.Person;
import com.example.petrestapi.repositories.PeopleRepository;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class PeopleService {

    private final PeopleRepository peopleRepository;
//    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository){
//            , PasswordEncoder passwordEncoder, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.peopleRepository = peopleRepository;
//        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    public List<Person> findAll(){
        return peopleRepository.findAll();
    }

    public Person findOne(int id){
        Optional<Person> foundPerson =peopleRepository.findById(id);
        return foundPerson.orElse(null);
    }
//    @Transactional
//    public void register(Person person) {
////        person.setPassword(bCryptPasswordEncoder.encode(person.getPassword()));
////        person.setRole("ROLE_USER");
//        peopleRepository.save(person);
//    }
}
