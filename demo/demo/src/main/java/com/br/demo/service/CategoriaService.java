package com.br.demo.service;

import com.br.demo.dto.CategoriaDTO;
import com.br.demo.model.Categoria;
import com.br.demo.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }


    public CategoriaDTO criarCategoria(CategoriaDTO dto) {
        Categoria categoria = new Categoria();
        categoria.setName(dto.getName());
        categoria.setDescricao(dto.getDescricao());

        categoria = repository.adicionar(categoria);

        return new CategoriaDTO(categoria.getId(), categoria.getName(), categoria.getDescricao());
    }

    public Optional<CategoriaDTO> buscarCategoriaPorId(Long id) {
        Optional<Categoria> categoria = repository.buscarPorId(id);
        return categoria.map(c -> new CategoriaDTO(c.getId(), c.getName(), c.getDescricao()));
    }

    public List<CategoriaDTO> listarTodas() {
        return repository.listarTodas().stream()
                .map(c -> new CategoriaDTO(c.getId(), c.getName(), c.getDescricao()))
                .collect(Collectors.toList());
    }

    public Optional<CategoriaDTO> atualizarCategoria(Long id, CategoriaDTO dto) {
        Categoria categoriaAtualizada = new Categoria();
        categoriaAtualizada.setId(id);
        categoriaAtualizada.setName(dto.getName());
        categoriaAtualizada.setDescricao(dto.getDescricao());

        Optional<Categoria> categoriaAtualizadaOptional = repository.atualizar(id, categoriaAtualizada);

        return categoriaAtualizadaOptional.map(c -> new CategoriaDTO(c.getId(), c.getName(), c.getDescricao()));
    }

    public boolean deletarCategoria(Long id) {
        return repository.remover(id);
    }
}
