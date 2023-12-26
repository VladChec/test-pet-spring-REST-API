package com.example.petrestapi.services;

import com.example.petrestapi.models.Person;
import com.example.petrestapi.repositories.PeopleRepository;

import com.example.petrestapi.util.PersonNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
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
        return foundPerson.orElseThrow(PersonNotFoundException::new);
    }
@Transactional
    public void save(Person person){

    enrichPerson(person);
    peopleRepository.save(person);
}


    private void enrichPerson(Person person) {
        person.setCreatedAt(LocalDateTime.now());
        person.setUpdateAt(LocalDateTime.now());
        person.setCreatedWho("ADMIN");
    }
//    @Transactional
//    public void register(Person person) {
////        person.setPassword(bCryptPasswordEncoder.encode(person.getPassword()));
////        person.setRole("ROLE_USER");
//        peopleRepository.save(person);
//    }
}
