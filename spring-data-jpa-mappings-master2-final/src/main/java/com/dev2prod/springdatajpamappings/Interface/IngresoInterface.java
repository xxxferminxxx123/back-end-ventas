package com.dev2prod.springdatajpamappings.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.springdatajpamappings.entity.Ingreso;

@Repository
public interface IngresoInterface extends JpaRepository<Ingreso, Long>{

}
