package InputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class fileInputStream {

    public static void main(String[] args) {
        File file = new File("data");
        FileInputStream fis = null;


        try {
            fis = new FileInputStream(file);
            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {

                }
            }
        }
    }
}
