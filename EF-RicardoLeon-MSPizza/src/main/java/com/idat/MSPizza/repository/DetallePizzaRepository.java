package com.idat.MSPizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MSPizza.model.PizzaDetalle;

@Repository
public interface DetallePizzaRepository extends JpaRepository<PizzaDetalle, Integer>{

}
