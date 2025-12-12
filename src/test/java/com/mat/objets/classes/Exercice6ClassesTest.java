package com.mat.objets.classes;

import org.junit.jupiter.api.Test;

public class Exercice6ClassesTest {

    @Test void testConstructeur() {
        Personne p = new Personne("Alice", 25);
        assertEquals("Alice", p.getNom());
        assertEquals(25, p.getAge());
    }

    @Test
    void testSetAge() {
        Personne p = new Personne("Bob", 20);
        p.setAge(30);
        assertEquals(30, p.getAge());
    }

    @Test void testMajeur() {
        assertTrue(new Personne("Alice", 18).estMajeur());
        assertFalse(new Personne("Bob", 17).estMajeur());
    }

    @Test void testEquals() {
        Personne p1 = new Personne("Alice", 25);
        Personne p2 = new Personne("Alice", 25);
        assertEquals(p1, p2);
    }
}
