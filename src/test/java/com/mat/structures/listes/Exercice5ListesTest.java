package com.mat.structures.listes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercice5ListesTest {

    @Test
    void testFiltrer() {
        assertEquals(Arrays.asList("Bonjour", "Monde"),
                Exercice5Listes.filtrerPlusLongsQueTroisCaracteres(Arrays.asList("Hi", "Bonjour", "Monde", "Hey")));
    }
    @Test void testSupprimer() {
        List<Integer> nums = new ArrayList<>(Arrays.asList(-1, 2, -3, 4));
        Exercice5Listes.supprimerNegatifs(nums);
        assertEquals(Arrays.asList(2, 4), nums);
    }
    @Test void testCompter() {
        Map<String, Integer> result = Exercice5Listes.compterOccurrences(Arrays.asList("a", "b", "a", "c", "a"));
        assertEquals(3, result.get("a"));
        assertEquals(1, result.get("b"));
    }
}
