package com.example.demo.controllers;


import com.example.demo.models.entity.Producto;
import com.example.demo.models.services.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductoRestController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> index() {

        return productoService.findAll();
    }

    @GetMapping("/productos/{id}")
    public Producto show(@PathVariable Long id) {
        return this.productoService.findById(id);
    }

    @PostMapping("/productos")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto create(@RequestBody Producto producto) {
        this.productoService.save(producto);
        return producto;
    }

    @PutMapping("/productos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
        Producto currentProducto = this.productoService.findById(id);
        currentProducto.setMarca(producto.getMarca());
        currentProducto.setTipo(producto.getTipo());
        currentProducto.setPrecio(producto.getPrecio());
        this.productoService.save(currentProducto);
        return currentProducto;
    }

    @DeleteMapping("/productos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        Producto currentProducto = this.productoService.findById(id);
        this.productoService.delete(currentProducto);
    }

}
