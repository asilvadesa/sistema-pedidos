package br.com.asilvadesa.pedidos.services;

import br.com.asilvadesa.pedidos.domain.Categoria;
import br.com.asilvadesa.pedidos.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    CategoriaRepository repository;

    public Categoria buscar(Integer id){
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElse(null);
    }

}
