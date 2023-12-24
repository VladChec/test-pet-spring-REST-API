package com.example.petrestapi.repositories;

import com.example.petrestapi.models.Person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PeopleRepository extends JpaRepository<Person,Integer> {
//    Optional<Person> findByUsername(String username);

    }
