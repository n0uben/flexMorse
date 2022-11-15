package fr.iut.flexMorse;

import fr.iut.flexMorse.arbre.NoeudArbre;
import fr.iut.flexMorse.helper.FileHelper;
import fr.iut.flexMorse.liste.NoeudListe;
import fr.iut.flexMorse.traduction.TraductionService;

public class TestRunner {
    public static void main(String[] args) {
        TraductionService trad = new TraductionService();
//        System.out.println(trad.alphabetVersMorse("blabla et tata"));
//        System.out.println(trad.morseVersAlphabet("-... .-.. .- -... .-.. .- /. -/- .- - .-"));
        System.out.println("Test Alphabet vers Morse");
        System.out.println("Test : SOS!");
        System.out.println(trad.alphabetVersMorse("SOS!"));
        System.out.println("Test : SOS et sos");
        System.out.println(trad.alphabetVersMorse("SOS"));
        System.out.println(trad.alphabetVersMorse("sos"));
        System.out.println("Test Morse vers Alphabet");
        System.out.println("Test : ... ---...");
        System.out.println(trad.morseVersAlphabet("... ---..."));
        System.out.println("Test : ... --- ... /");
        System.out.println(trad.morseVersAlphabet("... --- ... /"));
        System.out.println("Test evec des moins : ... --- ...");
        System.out.println(trad.morseVersAlphabet("... --- ..."));

    }
}
