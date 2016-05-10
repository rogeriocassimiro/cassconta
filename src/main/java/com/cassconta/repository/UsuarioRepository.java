package com.cassconta.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cassconta.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
