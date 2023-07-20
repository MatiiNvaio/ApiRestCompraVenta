package com.example.demo.models.services;
import com.example.demo.models.entity.TarjetaSocio;

import java.util.List;

public interface ITarjetaService {

    public List<TarjetaSocio> findAll();

    public void save(TarjetaSocio tarjetaSocio);

    public TarjetaSocio findById(Long id);

    public void delete(TarjetaSocio tarjetaSocio);
}
