package com.seucabelo.seucabelo.repositories;

import com.seucabelo.seucabelo.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    Cliente findByPrimeiroNome(String primeiroNome);
}
