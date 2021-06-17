package com.coursespring.cursomc.services;

import com.coursespring.cursomc.domain.Cliente;
import com.coursespring.cursomc.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = clienteRepository.findById(id);

        return obj.orElseThrow(() -> new IllegalStateException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()
        ));
    }

}
