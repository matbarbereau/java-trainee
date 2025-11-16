package com.mat.bases.conditions;

public class Exercice2Conditions {

    public static String evaluerNote(int note) {
        if (note > 16) return "Excellent";
        if (note > 14) return "Bien";
        if (note > 12) return "Assez bien";
        if (note > 10) return "Passable";
        return "";
    }

    public static boolean estMajeur(int age) {
        return false;
    }

    public static String getJourType(String jour) {
       return "";
    }
}
