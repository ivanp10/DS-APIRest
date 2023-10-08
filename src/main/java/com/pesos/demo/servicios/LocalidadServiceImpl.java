package com.pesos.demo.servicios;

import com.pesos.demo.entidades.Localidad;
import com.pesos.demo.repositorios.BaseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
