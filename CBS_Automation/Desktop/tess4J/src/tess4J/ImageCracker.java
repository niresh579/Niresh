package tess4J;
import java.io.File;
import net.sourceforge.tess4j.*;
public class ImageCracker {
    public static String crackImage(String filePath) {
        File imageFile = new File("C:\\Users\\Jyothi\\.eclipse\\tess4J\\Screen\\mailer1.png");
        ITesseract instance = new Tesseract();
        try {
            String result = instance.doOCR(imageFile);
            return result;
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "Error while reading image";
        }
    }
}
