package com.std.ec.model.dao;

import com.std.ec.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;


// De manera implícita nos proporciona todos los métodos habituales de un CRUD. Para revisar los métodos disponibles,
// podemos situarnos sobre CrudRepository y ver qué métodos nos proporciona.


// En esta declaración, el primer parámetro genérico indica el tipo de entidad con el que trabajaremos,
// mientras que el segundo parámetro genérico especifica el tipo de dato de su clave primaria.
// En este caso, al definir la entidad Cliente con una clave primaria de tipo Integer, pasamos Integer como segundo parámetro.
// Si la clave primaria fuera de tipo String, utilizaríamos String en su lugar.
public interface ClienteDao extends CrudRepository<Cliente, Integer> {

}
