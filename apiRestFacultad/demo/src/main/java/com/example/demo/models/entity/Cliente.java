package com.example.demo.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String email;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Venta> ventaList;
    private Venta venta;

    @OneToOne
    @JoinColumn(name = "tarjeta_id")
    private TarjetaSocio tarjeta;

    public Cliente(){ }

    @Column(name="fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fecha_nacimiento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha_nacimiento() {return fecha_nacimiento;}

    public void setFecha_nacimiento(Date fecha_nacimiento) {this.fecha_nacimiento = fecha_nacimiento;}

    public Cliente(Long id) { this.id = id; }

    public TarjetaSocio getTarjeta() {return tarjeta;}

    public void setTarjeta(TarjetaSocio tarjeta) {this.tarjeta = tarjeta;}
}
