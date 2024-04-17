package com.std.ec.service.impl;

import com.std.ec.model.dao.ClienteDao;
import com.std.ec.model.entity.Cliente;
import com.std.ec.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service //Se usa para crear una clase de servicio (Estereotipo)
public class ClienteImpl implements ICliente {

    //Haremos match con ClienteDao
    //Con el AutoWired hacemos una inyección de dependencias


    //Todo_ trabaja como transaccion
    //En Spring Boot, el manejo transaccional con @Transactional asegura que las operaciones de base de datos se ejecuten de forma segura y coherente, evitando cambios incompletos o inconsistentes. Esto es esencial para garantizar la integridad de los datos en aplicaciones empresariales
    @Autowired
    private ClienteDao clienteDao;

    @Transactional
    @Override
    public Cliente save(Cliente cliente) {
        return clienteDao.save(cliente);
}


    /*    La anotación `@Transactional` en Spring Boot se usa comúnmente para indicar que un método de servicio realiza operaciones de lectura en la base de datos dentro de una transacción. Aunque por defecto las operaciones de lectura en Spring no requieren una transacción, puede ser útil anotarlas con `@Transactional(readOnly = true)` para indicar que solo se están realizando operaciones de lectura y no se modificarán los datos. Esto puede ayudar a mejorar el rendimiento y aclarar la intención del código.*/


    @Transactional(readOnly = true)
    @Override
    //Nos obliga a que en caso de que no retorne nada, darle un valor, ya que no lo podemos retornar como vacio, podemos hacerlo con el orElse
    public Cliente findById(Integer id) {
        return clienteDao.findById(id).orElse(null);
    }


    @Transactional
    @Override
    public void delete(Cliente cliente) {
         clienteDao.delete(cliente);
    }
}
