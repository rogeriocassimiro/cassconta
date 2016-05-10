package com.cassconta.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cassconta.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{

}
