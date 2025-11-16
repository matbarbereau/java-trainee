package com.mat.bases.boucles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercice3BouclesTest {

    @Test
    void testSomme() {
        assertEquals(15, Exercice3Boucles.somme(5)); } // 1+2+3+4+5
    @Test
    void testRepeter() {
        assertEquals("Hi!Hi!Hi!", Exercice3Boucles.repeter("Hi!", 3));
    }
    @Test
    void testCompterPairs() {
        assertEquals(3, Exercice3Boucles.compterPairs(new int[] { 2, 3, 4, 5, 6 }));
    }
}
