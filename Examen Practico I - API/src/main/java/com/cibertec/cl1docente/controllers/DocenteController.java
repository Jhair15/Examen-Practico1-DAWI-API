package com.cibertec.cl1docente.controllers;

import com.cibertec.cl1docente.entities.DocenteEntity;
import com.cibertec.cl1docente.services.DocenteServicesImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/docentes")
public class DocenteController extends BaseControllerImpl<DocenteEntity, DocenteServicesImpl>{
}
