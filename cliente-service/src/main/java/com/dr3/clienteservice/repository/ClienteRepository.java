package com.dr3.clienteservice.repository;

import com.dr3.clienteservice.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
