package com.example.demo.controllers;


import com.example.demo.models.entity.Venta;
import com.example.demo.models.services.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VentaRestController {

    @Autowired
    private IVentaService ventaService;

    @GetMapping("/ventas")
    public List<Venta> index() {

        return ventaService.findAll();
    }

    @GetMapping("/ventas/{id}")
    public Venta show(@PathVariable Long id) {
        return this.ventaService.findById(id);
    }

    @PostMapping("/ventas")
    @ResponseStatus(HttpStatus.CREATED)
    public Venta create(@RequestBody Venta venta) {
        this.ventaService.save(venta);
        return venta;
    }

    @PutMapping("/ventas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Venta update(@RequestBody Venta venta, @PathVariable Long id) {
        Venta currentVenta = this.ventaService.findById(id);
        currentVenta.setMonto(venta.getMonto());
        currentVenta.setTipo_pago(venta.getTipo_pago());
        this.ventaService.save(currentVenta);
        return currentVenta;
    }

    @DeleteMapping("/ventas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Venta currentVenta = this.ventaService.findById(id);
        this.ventaService.delete(currentVenta);
    }
}
