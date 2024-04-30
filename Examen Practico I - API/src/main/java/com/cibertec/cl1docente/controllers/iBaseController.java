package com.cibertec.cl1docente.controllers;

import com.cibertec.cl1docente.entities.BaseEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface iBaseController <E extends BaseEntity, ID extends Serializable>{
    public ResponseEntity<?> getAll();
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@RequestBody ID id, @RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
