/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import javax.persistence.*;

/**
 *
 * @author Diegolas
 */

@Entity
@Table(name = "mesa")
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMesa;

    @Column(nullable = false, unique = true)
    private int numeroMesa;

    @Column(nullable = false)
    private int capacidad;

    @Column(nullable = false)
    private boolean ocupada;

    public Mesa() {
    }

    public Mesa(int numero, int capacidad) {
        this.numeroMesa = numero;
        this.capacidad = capacidad;
        this.ocupada = false;
    }

    public Long getId() {
        return idMesa;
    }

    public void setId(Long id) {
        this.idMesa = id;
    }

    public int getNumero() {
        return numeroMesa;
    }

    public void setNumero(int numero) {
        this.numeroMesa = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad < 1) {
            throw new IllegalArgumentException("La capacidad debe ser al menos 1");
        }
        if (capacidad > 20) {
            throw new IllegalArgumentException("La capacidad máxima es 20");
        }
        this.capacidad = capacidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
}