package com.tienda.dao;

import com.tienda.domain.Estado;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoDao extends JpaRepository<Estado,Long> {
    public List<Estado> findByPais(String nombre);
}
