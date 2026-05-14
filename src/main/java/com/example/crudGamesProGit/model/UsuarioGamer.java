package com.example.crudGamesProGit.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "jogador")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsuarioGamer {
    @Id
    private Long id;
    private String nickname;
    private String email;
    private String jogoFavorito;
    private Integer nivel;
}
