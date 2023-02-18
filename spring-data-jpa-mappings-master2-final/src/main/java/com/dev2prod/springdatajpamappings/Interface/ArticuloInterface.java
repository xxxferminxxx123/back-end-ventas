package com.dev2prod.springdatajpamappings.Interface;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dev2prod.springdatajpamappings.entity.Articulo;

@Repository
public interface ArticuloInterface extends JpaRepository<Articulo, Long>{



}
