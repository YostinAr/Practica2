
package com.tienda.service;

import com.tienda.domain.Estado;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.tienda.dao.EstadoDao;

@Service
public class EstadoServiceImpl implements EstadoService {
    //Se implementan los 4 metodos de un CRUD
    //Create Read Update Delete mediante EstadoDao
    
    //Se utiliza una anotación Autowired para que el objeto estadoDao
    //Si ya está en memoria se use ese... sino se crea (Patrón singleton)
    @Autowired
    private EstadoDao estadoDao;
    
    //Se utiliza una anotación Autowired para que el objeto creditoDao
    //Si ya está en memoria se use ese... sino se crea (Patrón singleton)

    //Retorna la lista de estados
    @Override
    @Transactional(readOnly = true)
    public List<Estado> getEstado() {
        return (List<Estado>)estadoDao.findAll();
    }
    //Si el estado.id tiene un valor se busca y se actualiza
    //Si el estado.id NO tiene valor, se inserta el objeto en la tabla
    @Override
    @Transactional
    public void save(Estado estado){
         estadoDao.save(estado);
    }
    
    //Elimina el registro que tiene el id igual a estado.id
    @Override
    @Transactional
    public void delete(Estado estado){
        estadoDao.delete(estado);
    }
    
     //Dado un estado.id se busca en la tabla y 
    //se retorna todo el objeto Estado

    @Override
    @Transactional(readOnly = true)    
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getId_estado()).orElse(null);
    }
    
}


