package fr.iut.flexMorse.helper;

import fr.iut.flexMorse.liste.NoeudListe;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static NoeudListe getFileRowsToStringList(String path) {
        NoeudListe fileRows = new NoeudListe();
        File fileToRead = new File(path);
        String row;
        try {
            BufferedReader bf = new BufferedReader(new FileReader(fileToRead));
            while ((row = bf.readLine()) != null) {
                System.out.println(row);
            }

            bf.close();
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileRows;
    }

    public static String createRelativePath(String relativePath) {
        
    }
}
