package fr.iut.flexMorse.traduction;

import fr.iut.flexMorse.arbre.NoeudArbre;
import fr.iut.flexMorse.helper.FileHelper;
import fr.iut.flexMorse.liste.NoeudListe;

import java.util.ArrayList;
import java.util.List;

public class TraductionService {

    public String morseVersAlphabet(String texteATraduire) {
        String path = FileHelper.createAbsolutPathToRessources("morse.txt");
        NoeudArbre arbreConversionMorseLetrre = FileHelper.getFileRowsToStringNoeudArbre(path);

        StringBuilder messageTraduit = new StringBuilder();
        String[] texteATraduireList = texteATraduire.trim().split(" ");

        for (String code : texteATraduireList) {
            messageTraduit.append(arbreConversionMorseLetrre.getLettreByCode(code));
        }

        return messageTraduit.toString();
    }

    public String alphabetVersMorse(String texteATraduire) {
        String path = FileHelper.createAbsolutPathToRessources("morse.txt");
        NoeudListe listConversionLettreMorse = FileHelper.getFileRowsToStringNoeudListe(path);

        StringBuilder messageTraduit = new StringBuilder();
        String[] texteATraduireList = texteATraduire.trim().split(" ");

        for (String lettre : texteATraduireList) {
            messageTraduit.append(listConversionLettreMorse.getCodeByLettre(lettre)).append(" ");
        }

        return messageTraduit.toString();
    }
}
