package fr.iut.flexMorse;

import fr.iut.flexMorse.helper.FileHelper;

import java.io.File;
import java.nio.file.Files;

public class TestRunner {
    public static void main(String[] args) {
        String filePath = new File("").getAbsolutePath() + "\\" + "src\\main\\resources\\static\\morse.txt";
        System.out.println(filePath);
        FileHelper.getFileRowsToStringList(filePath);
    }
}
