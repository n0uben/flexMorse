package fr.iut.flexMorse.helper;

import fr.iut.flexMorse.arbre.NoeudArbre;
import fr.iut.flexMorse.liste.NoeudListe;

import java.io.*;
import java.nio.file.FileSystems;
import java.util.List;

public class FileHelper {
    public static NoeudListe getFileRowsToStringNoeudListe(String path) {
        NoeudListe fileRows = new NoeudListe();
//        File fileToRead = new File(path);
        InputStream resourceStream = FileHelper.class.getResourceAsStream("/static/morse.txt");

        String row;
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(resourceStream));
            while ((row = bf.readLine()) != null) {
                String[] splittedRow = row.split("=");
                String lettre = splittedRow[0];
                String morse = splittedRow[1];

                fileRows.add(lettre, morse);
            }

            bf.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileRows;
    }

    public static NoeudArbre getFileRowsToStringNoeudArbre(String path) {
        NoeudArbre fileRows = new NoeudArbre();
//        File fileToRead = new File(path);
        InputStream resourceStream = FileHelper.class.getResourceAsStream("/static/morse.txt");
        String row;
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(resourceStream));
            while ((row = bf.readLine()) != null) {
                String[] splittedRow = row.split("=");
                String lettre = splittedRow[0];
                String morse = splittedRow[1];

                fileRows.add(lettre, morse);
            }

            bf.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileRows;
    }

    public static String createAbsolutPathToRessources(String fileName) {
        String separator = FileSystems.getDefault().getSeparator();
        return new File("").getAbsolutePath() + separator + "src" + separator + "main" + separator + "resources" + separator + "static" + separator + fileName;
    }
}
