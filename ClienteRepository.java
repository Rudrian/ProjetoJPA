package com.examplojpa.projetoJpa2.Repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import com.examplojpa.projetoJpa2.Entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
