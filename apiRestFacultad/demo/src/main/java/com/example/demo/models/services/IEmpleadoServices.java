package com.example.demo.models.services;
import com.example.demo.models.entity.Empleado;

import java.util.List;

public interface IEmpleadoServices {

    public List<Empleado> findAll();

    public void save(Empleado empleado);

    public Empleado findById(Long id);

    public void delete(Empleado empleado);
}
