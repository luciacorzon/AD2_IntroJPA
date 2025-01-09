package org.example.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idEstudiante", nullable = false, unique = true)
    private Long idEstudiante;
    @Column(length = 255)
    private String nombre;
    private String apellidos;
    private LocalDate fechaDeNacimiento;
    private String direccion;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellidos, LocalDate fechaDeNacimiento, String direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
    }

    public Estudiante(Long idEstudiante, String nombre, String apellidos, LocalDate fechaDeNacimiento, String direccion) {
        this.idEstudiante = idEstudiante;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "idEstudiante=" + idEstudiante +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
