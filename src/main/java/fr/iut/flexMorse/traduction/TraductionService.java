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

        String[] texteATraduireList = texteATraduire.split("/");
        for (String code : texteATraduireList) {
            String[] motATraduireList = code.trim().split(" ");
            for (String lettre : motATraduireList) {
                try {
                    messageTraduit.append(arbreConversionMorseLetrre.getLettreByCode(lettre));
                } catch(IllegalArgumentException iae) {
                    messageTraduit.append(lettre);
                }
            }
            messageTraduit.append(" ");
        }

        return messageTraduit.toString();
    }

    public String alphabetVersMorse(String texteATraduire) {
        StringBuilder messageTraduit = new StringBuilder();
        String[] texteATraduireList = texteATraduire.trim().split(" ");
        int nombreDeMots = texteATraduireList.length;
        int compteur = 0;
        for (String mot : texteATraduireList) {
            compteur += 1;
            String[] motATraduireList = mot.trim().split("");
            for (String lettre : motATraduireList) {
                try {
                    messageTraduit.append(listConversionLettreMorse.getCodeByLettre(lettre.toUpperCase())).append(" ");
                } catch(IllegalArgumentException iae) {
                    messageTraduit.append(lettre);
                }
            }
            if (compteur < nombreDeMots)
                messageTraduit.append("/ ");
        }

        return messageTraduit.toString();
    }


}
