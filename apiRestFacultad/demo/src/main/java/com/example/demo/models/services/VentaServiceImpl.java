package com.example.demo.models.services;


import com.example.demo.models.dao.IVentaDao;
import com.example.demo.models.entity.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class VentaServiceImpl implements IVentaService{

    @Autowired
    private IVentaDao ventaDao;

    @Override
    public List<Venta> findAll() { return (List<Venta>) ventaDao.findAll();}

    @Override
    public void save(Venta venta) {ventaDao.save(venta);}

    @Override
    public Venta findById(Long id) { return ventaDao.findById(id).orElse(null); }

    @Override
    @Transactional
    public void delete(Venta venta) { ventaDao.delete(venta); }
}
