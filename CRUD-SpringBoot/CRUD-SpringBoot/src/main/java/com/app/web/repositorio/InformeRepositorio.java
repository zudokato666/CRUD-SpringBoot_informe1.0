package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.web.entidad.Informe;

@Repository
public interface InformeRepositorio extends JpaRepository<Informe, Long>{

}
