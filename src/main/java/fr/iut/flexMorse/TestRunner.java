package fr.iut.flexMorse;

import fr.iut.flexMorse.arbre.NoeudArbre;
import fr.iut.flexMorse.helper.FileHelper;
import fr.iut.flexMorse.liste.NoeudListe;
import fr.iut.flexMorse.traduction.TraductionService;

public class TestRunner {
    public static void main(String[] args) {
        TraductionService trad = new TraductionService();
        System.out.println(trad.alphabetVersMorse("blabla et tata"));
        System.out.println(trad.morseVersAlphabet("-... .-.. .- -... .-.. .- /. -/- .- - .-"));
    }
}
