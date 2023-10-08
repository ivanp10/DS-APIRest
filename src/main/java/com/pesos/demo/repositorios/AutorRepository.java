package com.pesos.demo.repositorios;

import com.pesos.demo.entidades.Autor;
import com.pesos.demo.entidades.Base;
import org.springframework.stereotype.Repository;

@Repository

public interface AutorRepository extends BaseRepository<Autor, Long> {
}
