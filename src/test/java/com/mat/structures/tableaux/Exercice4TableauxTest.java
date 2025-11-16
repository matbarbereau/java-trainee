package com.mat.structures.tableaux;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice4TableauxTest {

    @Test
    void testMax() {
        assertEquals(9, Exercice4Tableaux.trouverMax(new int[]{-5, 3, 9, -2}));
    }
    @Test
    void testInverser() {
        assertArrayEquals(new int[]{3,2,1}, Exercice4Tableaux.inverser(new int[]{1,2,3}));
    }
    @Test
    void testContient() {
        assertTrue(Exercice4Tableaux.contient(new int[]{1,2,3}, 2));
        assertFalse(Exercice4Tableaux.contient(new int[]{1,2,3}, 5));
    }
}
