package com.udea.persona.model;


import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString


@Entity
public class Persona implements Serializable {

    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private @NonNull String nombre;

    @Column(name = "apellido", nullable = false, length = 50)
    private @NonNull String apellido;

    @Column(name = "email", nullable = false, length = 50)
    private @NonNull int email;

    @Column(name = "telefono", nullable = false, length = 50)
    private @NonNull int telefono;

    @Column(name = "direccion", nullable = false, length = 50)
    private @NonNull String direccion;

    @Column(name = "salario", nullable = false, length = 50)
    private @NonNull int salario;

    @Column(name = "cargo", nullable = false, length = 50)
    private @NonNull String cargo;

    @Column(name = "oficina", nullable = false, length = 50)
    private @NonNull String oficina;

    @Column(name = "departamento", nullable = false, length = 50)
    private @NonNull String departamento;

    @Column (name = "fechaIngreso", nullable = false, length = 50)
    private @NonNull Date fechaIngreso;
}
