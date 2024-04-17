package com.std.ec.service;

import com.std.ec.model.entity.Cliente;

public interface ICliente {

    //No ponemos el update porque por medio del id el save detecta cuando un objeto ya existe
    Cliente save(Cliente cliente);
    Cliente findById(Integer id);
    void delete(Cliente cliente);
}
