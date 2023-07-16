package com.example.demo.models.services;
import com.example.demo.models.entity.Venta;

import java.util.List;

public interface IVentaService {

    public List<Venta> findAll();

    public void save(Venta venta);

    public Venta findById(Long id);

    public void delete(Venta venta);
}
