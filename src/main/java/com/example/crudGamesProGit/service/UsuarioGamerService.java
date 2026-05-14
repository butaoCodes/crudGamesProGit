package com.example.crudGamesProGit.service;

import com.example.crudGamesProGit.model.UsuarioGamer;
import com.example.crudGamesProGit.repository.UsuarioGamerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class UsuarioGamerService {

    private final UsuarioGamerRepository repository;

    public List<UsuarioGamer> listar() { return repository.findAll();
    }
    public UsuarioGamer buscarPorId (long id) {
        return repository.findById(id).orElseThrow(()-> new RuntimeException("Jogador não encontrado."));

    }

    public UsuarioGamer salvar (UsuarioGamer jogador) {
        return repository.save(jogador);

    }

    public UsuarioGamer atualizar (Long id, UsuarioGamer dados) {

        UsuarioGamer aluno = buscarPorId(id);
        UsuarioGamer jogador = buscarPorId(id);
        jogador.setNickname(dados.getNickname());
        jogador.setEmail(dados.getEmail());
        jogador.setJogoFavorito(dados.getJogoFavorito());
        jogador.setNivel(dados.getNivel());
        return repository.save(aluno);
    }

    public void excluir(Long id){
        repository.deleteById(id);
    }
}

