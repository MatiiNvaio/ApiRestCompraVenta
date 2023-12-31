package com.example.demo.models.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="productos")
public class Producto {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String marca;
    private double precio;
    private String tipo;


    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<Venta> ventaList;
    private Venta venta;

    public Producto() { }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getMarca() { return marca; }

    public void setMarca(String marca) { this.marca = marca; }

    public double getPrecio() { return precio; }

    public void setPrecio(double precio) { this.precio = precio; }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

}
