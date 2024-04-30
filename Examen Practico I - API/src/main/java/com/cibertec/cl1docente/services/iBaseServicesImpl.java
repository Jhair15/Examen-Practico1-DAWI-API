package com.cibertec.cl1docente.services;

import com.cibertec.cl1docente.entities.BaseEntity;
import com.cibertec.cl1docente.repositories.iBaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;


public abstract class iBaseServicesImpl<E extends BaseEntity, ID extends Serializable> implements iBaseServices<E,ID> {

    protected iBaseRepository<E, ID> baseRepository;

    //inyectando dependencias mediante constructor que recibe el repositorio base lo almacena y luego hacer uso en los metodos
    public iBaseServicesImpl(iBaseRepository<E, ID> baseRepository) { this.baseRepository = baseRepository; }

    @Override
    @Transactional
    public List<E> findAll() throws Exception {
        try{
            List<E> entities = baseRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(ID id) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try{
            entity = baseRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(ID id, E entity) throws Exception {
        try{
            Optional<E> entityOptional = baseRepository.findById(id);
            E entityUpdate = entityOptional.get();
            entityUpdate = baseRepository.save(entity);
            return entityUpdate;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(ID id) throws Exception {
        try{
            if(baseRepository.existsById(id)){
                baseRepository.deleteById(id);
                return true;
            }else {
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
