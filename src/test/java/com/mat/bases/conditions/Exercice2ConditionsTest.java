package com.mat.bases.conditions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exercice2ConditionsTest {

    @Test void testNote() {
        assertEquals("Excellent", Exercice2Conditions.evaluerNote(18));
        assertEquals("Bien", Exercice2Conditions.evaluerNote(15));
        assertEquals("Passable", Exercice2Conditions.evaluerNote(11));
        assertEquals("Insuffisant", Exercice2Conditions.evaluerNote(8));
    }
    @Test void testMajeur() {
        assertTrue(Exercice2Conditions.estMajeur(18));
        assertFalse(Exercice2Conditions.estMajeur(17));
    }
    @Test
    void testJourType() {
        assertEquals("Weekend", Exercice2Conditions.getJourType("Samedi"));
        assertEquals("Semaine", Exercice2Conditions.getJourType("Lundi"));
    }
}
