package pe.com.lacabrera.proyecto.Controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.lacabrera.proyecto.entity.Cliente;
import pe.com.lacabrera.proyecto.service.ClienteServie;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    
    @Autowired
    private ClienteServie service;
    
    @GetMapping
    public List<Cliente> findAll(){
        return service.findAll();
    }
    
}
