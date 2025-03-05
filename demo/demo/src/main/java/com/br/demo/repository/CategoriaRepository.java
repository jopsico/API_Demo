package com.br.demo.repository;
import com.br.demo.model.Categoria;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository {


    private List<Categoria> categorias = new ArrayList<>();
    private Long proximoId = 1L;

    public Categoria adicionar(@NotNull Categoria categoria) {
        categoria.setId(proximoId++);
        categorias.add(categoria);
        return categoria;
    }

    public Optional<Categoria> buscarPorId(Long id) {
        return categorias.stream().filter(c -> c.getId().equals(id)).findFirst();
    }

    public List<Categoria> listarTodas() {
        return new ArrayList<>(categorias);
    }

    public Optional<Categoria> atualizar(Long id, Categoria categoriaAtualizada) {
        for (int i = 0; i < categorias.size(); i++) {
            if (categorias.get(i).getId().equals(id)) {
                categoriaAtualizada.setId(id);
                categorias.set(i, categoriaAtualizada);
                return Optional.of(categoriaAtualizada);
            }
        }
        return Optional.empty();
    }

    public boolean remover(Long id) {
        boolean removido = categorias.removeIf(c -> c.getId().equals(id));
        if (!removido) {
            System.out.println("Categoria com ID " + id + " não encontrada para remoção.");
        }
        return removido;
    }

}

