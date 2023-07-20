package com.example.demo.models.dao;

import com.example.demo.models.entity.TarjetaSocio;
import org.springframework.data.repository.CrudRepository;

public interface ITarjetaDao extends CrudRepository<TarjetaSocio, Long> {
}
