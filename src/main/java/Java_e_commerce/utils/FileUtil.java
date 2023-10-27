package Java_e_commerce.utils;

import java.io.File;

public class FileUtil {

    private static File credentailsFile;

    public static File getCredentialsFile() {
        if (credentailsFile == null)
            credentailsFile = new File("src/main/java/Java_e_commerce/assests/credentials.csv");
        return credentailsFile;
    }
}
