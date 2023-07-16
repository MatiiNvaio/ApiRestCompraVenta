package com.example.demo.models.services;

import com.example.demo.models.dao.IProductoDao;
import com.example.demo.models.entity.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private IProductoDao productoDao;

    @Override
    public List<Producto> findAll() { return (List<Producto>) productoDao.findAll();}

    @Override
    public void save(Producto producto) {productoDao.save(producto);}

    @Override
    public Producto findById(Long id) { return productoDao.findById(id).orElse(null); }

    @Override
    @Transactional
    public void delete(Producto producto) { productoDao.delete(producto); }
}
