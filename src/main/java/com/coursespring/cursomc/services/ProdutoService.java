package com.coursespring.cursomc.services;

import com.coursespring.cursomc.domain.Categoria;
import com.coursespring.cursomc.domain.Produto;
import com.coursespring.cursomc.repositories.CategoriaRepository;
import com.coursespring.cursomc.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Produto find(Integer id) {
        Optional<Produto> obj = produtoRepository.findById(id);

        return obj.orElseThrow(() -> new IllegalStateException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()
        ));
    }

    public Page<Produto> search(String nome, List<Integer> ids, Integer page, Integer linesPerPage, String orderBy, String direction) {
        PageRequest pageRequest = PageRequest.of(page, linesPerPage, Sort.Direction.valueOf(direction), orderBy);
        List<Categoria> categorias = categoriaRepository.findAllById(ids);
        return produtoRepository.findDistinctByNomeContainingAndAndCategoriasIn(nome, categorias, pageRequest);
    }
}
