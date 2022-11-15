package fr.iut.flexMorse.traduction;

import fr.iut.flexMorse.arbre.NoeudArbre;
import fr.iut.flexMorse.helper.FileHelper;
import fr.iut.flexMorse.liste.NoeudListe;

import java.util.ArrayList;
import java.util.List;

public class TraductionService {
    private final String path = FileHelper.createAbsolutPathToRessources("morse.txt");
    NoeudArbre arbreConversionMorseLetrre;
    NoeudListe listConversionLettreMorse;

    public TraductionService() {
        this.arbreConversionMorseLetrre = FileHelper.getFileRowsToStringNoeudArbre(path);
        this.listConversionLettreMorse = FileHelper.getFileRowsToStringNoeudListe(path);
    }

    public String morseVersAlphabet(String texteATraduire) {
        StringBuilder messageTraduit = new StringBuilder();
        String[] texteATraduireList = texteATraduire.trim().split(" ");

        for (String code : texteATraduireList) {
            messageTraduit.append(arbreConversionMorseLetrre.getLettreByCode(code));
        }

        return messageTraduit.toString();
    }

    public String alphabetVersMorse(String texteATraduire) {
        StringBuilder messageTraduit = new StringBuilder();
        String[] texteATraduireList = texteATraduire.trim().split(" ");

        for (String lettre : texteATraduireList) {
            messageTraduit.append(listConversionLettreMorse.getCodeByLettre(lettre)).append(" ");
        }

        return messageTraduit.toString();
    }
}
