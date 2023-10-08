package com.pesos.demo.controladores;

import com.pesos.demo.entidades.Localidad;
import com.pesos.demo.servicios.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")

public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
