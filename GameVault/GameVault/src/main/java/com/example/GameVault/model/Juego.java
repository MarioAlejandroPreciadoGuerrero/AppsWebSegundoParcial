package com.example.GameVault.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="Juegos")
public class Juego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String titulo;
    @Column(length = 1000)
    private String descripcion;
    @Column(name="portadaURL",nullable = false, unique = true)
    private String portadaURL;
    @Column()
    private String categoria;
    @Column()
    private Double precio;
    @ManyToOne()
    @JoinColumn(name = "idUsuario")
    private Usuario idUsuario;
}
