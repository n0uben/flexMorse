package fr.iut.flexMorse;

import fr.iut.flexMorse.arbre.NoeudArbre;
import fr.iut.flexMorse.helper.FileHelper;
import fr.iut.flexMorse.liste.NoeudListe;
import fr.iut.flexMorse.traduction.TraductionService;

public class TestRunner {
    public static void main(String[] args) {
        String path = FileHelper.createAbsolutPathToRessources("morse.txt");
        NoeudListe listConversionLettreMorse = FileHelper.getFileRowsToStringNoeudListe(path);
        NoeudArbre arbreConversionMorseLetrre = FileHelper.getFileRowsToStringNoeudArbre(path);

        String test = "...";

        System.out.println(arbreConversionMorseLetrre.getLettreByCode(test));
        System.out.println(listConversionLettreMorse.getCodeByLettre("S"));
        TraductionService trad = new TraductionService();
        System.out.println(trad.alphabetVersMorse("blabla et tata"));
        System.out.println(trad.morseVersAlphabet("... .-."));
    }
}
