package com.cibertec.cl1docente.repositories;

import com.cibertec.cl1docente.entities.DocenteEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface iDocenteRepository extends iBaseRepository<DocenteEntity, Long> {
}
