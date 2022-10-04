package fr.iut.flexMorse;

import fr.iut.flexMorse.arbre.NoeudArbre;
import fr.iut.flexMorse.helper.FileHelper;
import fr.iut.flexMorse.liste.NoeudListe;

public class TestRunner {
    public static void main(String[] args) {
        String path = FileHelper.createAbsolutPathToRessources("morse.txt");
        NoeudListe listConversionLettreMorse = FileHelper.getFileRowsToStringNoeudListe(path);
        NoeudArbre arbreConversionMorseLetrre = FileHelper.getFileRowsToStringNoeudArbre(path);

        System.out.println(arbreConversionMorseLetrre);
    }
}
