package com.tienda.service;

import com.tienda.domain.Estado;
import java.util.List;

public interface EstadoService {
    //se definen los 4 metodos de un CRUD
    //Create Read Update Delete
    
    //Retorna la lista de estados
    public List<Estado> getEstado();
    
    //Dado un estado.id se busca en la tabla y 
    //se retorna todo el objeto Estado
    public Estado getEstado(Estado estado);
    
    //Si el estado.id tiene un valor se busca y se actualiza
    //Su el estado.id NO tiene valor, se inserta el objeto en la tabla
    public void save(Estado estado);
    
    //Elimina el registro que tiene el id igual a estado.id
    public void delete(Estado estado);
    
    
}
