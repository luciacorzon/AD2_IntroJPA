package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import org.example.entities.Pelicula;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("El Padrino", (short) 1972);
        Pelicula pelicula2 = new Pelicula("El Padrino II", (short) 1974);
        Pelicula pelicula3 = new Pelicula("El Padrino III", (short) 1990);

        var enf = Persistence.createEntityManagerFactory("jpa-hibernate-h2");
        EntityManager em = enf.createEntityManager();

        em.getTransaction().begin();

        em.persist(pelicula1);
        em.persist(pelicula2);
        em.persist(pelicula3);

        em.getTransaction().commit();
    }
}