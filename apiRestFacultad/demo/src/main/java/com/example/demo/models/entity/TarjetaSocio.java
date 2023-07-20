package com.example.demo.models.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tarjetas")
public class TarjetaSocio implements Serializable {


    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String num_tarjeta;


    @OneToOne(mappedBy = "tarjeta")
    private Cliente cliente;

    public TarjetaSocio(){ }

    @Column(name="fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fecha_vencimiento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNum_tarjeta() {return num_tarjeta;}

    public void setNum_tarjeta(String num_tarjeta) {this.num_tarjeta = num_tarjeta;}

    public Date getFecha_vencimiento() {return fecha_vencimiento;}

    public void setFecha_vencimiento(Date fecha_vencimiento) {this.fecha_vencimiento = fecha_vencimiento;}

}
