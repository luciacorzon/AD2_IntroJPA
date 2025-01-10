package org.example.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDirector;

    @OneToMany(mappedBy = "director")
    private List<Pelicula> peliculas;

    public Director() {
    }
}
