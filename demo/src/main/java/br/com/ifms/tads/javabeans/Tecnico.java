package br.com.ifms.tads.javabeans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Tecnico {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long tecnicoId;

     private String nameTecnico;

     
}
