package com.cibertec.cl1docente.repositories;


import com.cibertec.cl1docente.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface iBaseRepository <E extends BaseEntity, ID extends Serializable> extends JpaRepository<E, ID> {
}
