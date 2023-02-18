package com.dev2prod.springdatajpamappings.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.springdatajpamappings.entity.Venta;


@Repository
public interface VentaInterface extends JpaRepository<Venta, Long>{

}
