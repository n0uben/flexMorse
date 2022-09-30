package fr.iut.flexMorse;

import fr.iut.flexMorse.helper.FileHelper;
import fr.iut.flexMorse.liste.NoeudListe;

public class TestRunner {
    public static void main(String[] args) {
        String path = FileHelper.createAbsolutPathToRessources("morse.txt");
        NoeudListe conversionLettreMorse = FileHelper.getFileRowsToStringNoeudListe(path);
        System.out.println(conversionLettreMorse);
    }
}
