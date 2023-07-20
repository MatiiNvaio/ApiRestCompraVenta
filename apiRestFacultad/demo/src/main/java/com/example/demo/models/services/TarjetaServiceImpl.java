package com.example.demo.models.services;

import com.example.demo.models.dao.ITarjetaDao;
import com.example.demo.models.entity.TarjetaSocio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TarjetaServiceImpl implements ITarjetaService{

    @Autowired
    private ITarjetaDao tarjetaDao;

    @Override
    @Transactional(readOnly = true)
    public List<TarjetaSocio> findAll() {return (List<TarjetaSocio>) tarjetaDao.findAll();}

    @Override
    @Transactional
    public void save(TarjetaSocio tarjetaSocio) {tarjetaDao.save(tarjetaSocio);}

    @Override
    @Transactional(readOnly = true)
    public TarjetaSocio findById(Long id) {return tarjetaDao.findById(id).orElse(null);}

    @Override
    @Transactional
    public void delete(TarjetaSocio tarjetaSocio) {tarjetaDao.delete(tarjetaSocio);}
}
