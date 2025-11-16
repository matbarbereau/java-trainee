package com.mat.variables;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Exercice1VariablesTests {

    @Test
    void testAge() {
        assertEquals(25, Exercice1Variables.getAge());
    }
    @Test
    void testMoyenne() {
        assertEquals(7.5, Exercice1Variables.calculerMoyenne(7, 8), 0.01);
    }
    @Test
    void testConcatener() {
        assertEquals("Jean Dupont", Exercice1Variables.concatener("Jean", "Dupont"));
    }
}
