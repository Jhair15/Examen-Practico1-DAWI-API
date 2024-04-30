package com.cibertec.cl1docente.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "docente")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DocenteEntity extends BaseEntity {

    @Column(columnDefinition = "CHAR(8)")
    private String dni;

    private Date fechaNacimiento;
    private Double sueldo;

    @Column(length = 45)
    private String email;

    @Column(length = 45)
    private String sexo;

    @ManyToOne
    @JoinColumn(name = "fkcategoria")
    private CategoriaEntity categoria;
}
