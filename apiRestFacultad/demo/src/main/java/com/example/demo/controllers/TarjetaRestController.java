package com.example.demo.controllers;

import com.example.demo.models.entity.TarjetaSocio;
import com.example.demo.models.services.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TarjetaRestController {

    @Autowired
    private ITarjetaService tarjetaService;

    @GetMapping("/tarjetas")
    public List<TarjetaSocio> index() {

        return tarjetaService.findAll();
    }

    @GetMapping("/tarjetas/{id}")
    public TarjetaSocio show(@PathVariable Long id) {
        return this.tarjetaService.findById(id);
    }

    @PostMapping("/tarjetas")
    @ResponseStatus(HttpStatus.CREATED)
    public TarjetaSocio create(@RequestBody TarjetaSocio tarjetaSocio) {
        tarjetaSocio.setFecha_vencimiento(new Date());
        this.tarjetaService.save(tarjetaSocio);
        return tarjetaSocio;
    }

    @PutMapping("/tarjetas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public TarjetaSocio update(@RequestBody TarjetaSocio tarjetaSocio, @PathVariable Long id) {
        TarjetaSocio currentTarjeta = this.tarjetaService.findById(id);
        currentTarjeta.setNum_tarjeta(tarjetaSocio.getNum_tarjeta());
        this.tarjetaService.save(currentTarjeta);
        return currentTarjeta;
    }

    @DeleteMapping("/tarjetas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        TarjetaSocio currentTarjeta = this.tarjetaService.findById(id);
        this.tarjetaService.delete(currentTarjeta);
    }
}
