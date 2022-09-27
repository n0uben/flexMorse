package fr.iut.flexMorse.helper;

public class OsHelper {

    private static String OS = null;

    public static String getOsName()
    {
        if(OS == null) { OS = System.getProperty("os.name"); }
        return OS;
    }
}
