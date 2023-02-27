package com.tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_estado;
    private String nombre_est;
    private String pais;
    private String capital;
    private String idioma;
    private Long cantidad_Pob;
    private String codigo_postal;

    public Estado() {
    }

    public Estado(Long id_estado, String nombre_est, String apellidos, String correo, Long cantidadPob,String telefono) {
        this.id_estado = id_estado;
        this.nombre_est = nombre_est;
         this.pais = pais;
          this.capital = capital;
           this.idioma = idioma;
           this.cantidad_Pob = cantidad_Pob;
            this.codigo_postal = codigo_postal;
    }
}
