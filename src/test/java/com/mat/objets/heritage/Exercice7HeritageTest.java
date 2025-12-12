package com.mat.objets.heritage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercice7HeritageTest {

    @Test
    void testChien() {
        Chien chien = new Chien("Rex");
        assertEquals("Rex", chien.nom);
        assertEquals("Woof!", chien.crier());
    }

    @Test void testChat() {
        Chat chat = new Chat("Minou");
        assertEquals("Minou", chat.nom);
        assertEquals("Meow!", chat.crier());
        assertEquals(9, chat.getVies());
    }

    @Test void testPolymorphisme() {
        Animal a1 = new Chien("Rex");
        Animal a2 = new Chat("Minou");
        assertEquals("Woof!", a1.crier());
        assertEquals("Meow!", a2.crier());
    }
}
