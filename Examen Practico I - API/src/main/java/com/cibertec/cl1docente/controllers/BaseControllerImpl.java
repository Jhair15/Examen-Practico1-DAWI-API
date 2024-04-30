package com.cibertec.cl1docente.controllers;

import com.cibertec.cl1docente.entities.BaseEntity;
import com.cibertec.cl1docente.services.iBaseServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseControllerImpl<E extends BaseEntity, S extends iBaseServicesImpl<E,Long>> implements iBaseController<E, Long> {

    @Autowired
    protected S servicio;

    @GetMapping("")
    public ResponseEntity<?> getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente mas tarde. \"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente mas tarde. \"}");
        }
    }

    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.save(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente mas tarde. \"}");
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody E entity) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.update(id, entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente mas tarde. \"}");
        }
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente mas tarde. \"}");
        }
    }
}
