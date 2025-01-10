package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pelicula", nullable = false, unique = true)
    private Long idPelicula;
    private String titulo;
    private Short ano;

    private transient LocalDate fechaEstreno;

    @ManyToOne
    private Director director;

    public Pelicula() {
    }

    public Pelicula(Long idPelicula, String titulo, Short ano) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.ano = ano;
    }

    public Pelicula(String titulo, Short ano) {
        this.ano = ano;
        this.titulo = titulo;
    }
    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Short getAno() {
        return ano;
    }

    public void setAno(Short ano) {
        this.ano = ano;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "idPelicula=" + idPelicula +
                ", titulo='" + titulo + '\'' +
                ", ano=" + ano +
                '}';
    }
}
