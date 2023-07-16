package com.example.demo.models.dao;

import com.example.demo.models.entity.Venta;
import org.springframework.data.repository.CrudRepository;

public interface IVentaDao extends CrudRepository<Venta, Long> {
}
