package fr.iut.flexMorse;

import fr.iut.flexMorse.helper.FileHelper;

import java.io.File;
import java.nio.file.Files;

public class TestRunner {
    public static void main(String[] args) {
        String path = FileHelper.createAbsolutPathToRessources("morse.txt");
        FileHelper.getFileRowsToStringList(path);
    }
}
