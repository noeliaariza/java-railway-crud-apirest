package com.noeliaariza.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noeliaariza.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
