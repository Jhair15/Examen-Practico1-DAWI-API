package com.cibertec.cl1docente.services;

import com.cibertec.cl1docente.entities.DocenteEntity;
import com.cibertec.cl1docente.repositories.iBaseRepository;
import com.cibertec.cl1docente.repositories.iDocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocenteServicesImpl extends iBaseServicesImpl<DocenteEntity, Long> implements iDocenteServices {

    @Autowired
    private iDocenteRepository docenteRepository;

    public DocenteServicesImpl(iBaseRepository<DocenteEntity, Long> baseRepository) {
        super(baseRepository);
    }

}
