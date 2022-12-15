package com.idat.MSPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MSPizza.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
