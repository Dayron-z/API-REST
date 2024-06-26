package com.std.ec.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

/*
Al trabajar con JPA definimos nuestra clase como un entity
*/
/*La asocioacion de la table(name = "") es en referencia al nombre de nuestra tabla*/
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCliente;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "correo")
    private String correo;
    @Column(name = "fecha_registro")
    private Date fecha;
}
