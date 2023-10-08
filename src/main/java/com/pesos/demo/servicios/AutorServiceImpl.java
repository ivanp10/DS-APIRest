package com.pesos.demo.servicios;

import com.pesos.demo.entidades.Autor;
import com.pesos.demo.repositorios.AutorRepository;
import com.pesos.demo.repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor,Long> baseRepository) {
        super(baseRepository);
    }
}
