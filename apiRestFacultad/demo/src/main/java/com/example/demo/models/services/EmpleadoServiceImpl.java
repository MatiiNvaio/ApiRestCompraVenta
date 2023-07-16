package com.example.demo.models.services;
import com.example.demo.models.dao.IEmpleadoDao;
import com.example.demo.models.entity.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class EmpleadoServiceImpl implements IEmpleadoServices {

    @Autowired
    private IEmpleadoDao empleadoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Empleado> findAll() {
        return (List<Empleado>) empleadoDao.findAll();
    }

    @Override
    public void save(Empleado empleado) {

    }

    @Override
    public Empleado findById(Long id) {
        return empleadoDao.findById(id).orElse(null);
    }

    @Override
    public void delete(Empleado empleado) {

    }
}
