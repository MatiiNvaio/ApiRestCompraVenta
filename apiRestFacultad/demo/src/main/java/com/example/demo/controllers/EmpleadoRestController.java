package com.example.demo.controllers;


import com.example.demo.models.entity.Empleado;
import com.example.demo.models.services.IEmpleadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {


    @Autowired
    private IEmpleadoServices empleadoServices;

    @GetMapping("/empleados")
    public List<Empleado> index() {

        return empleadoServices.findAll();
    }

    @GetMapping("/empleados/{id}")
    public Empleado show(@PathVariable Long id) {
        return this.empleadoServices.findById(id);
    }

    @PostMapping("/empleados")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado create(@RequestBody Empleado empleado) {
        this.empleadoServices.save(empleado);
        return empleado;
    }

    @PutMapping("/empleados/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Empleado update(@RequestBody Empleado empleado, @PathVariable Long id) {
        Empleado currentEmpleados = this.empleadoServices.findById(id);
        currentEmpleados.setNombre(empleado.getNombre());
        currentEmpleados.setApellido(empleado.getApellido());
        currentEmpleados.setEmail(empleado.getEmail());
        this.empleadoServices.save(currentEmpleados);
        return currentEmpleados;
    }

    @DeleteMapping("/empleados/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Empleado currentEmpleados = this.empleadoServices.findById(id);
        this.empleadoServices.delete(currentEmpleados);
    }
}
