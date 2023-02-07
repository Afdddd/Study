package InputOutput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileOutputStream {

    public static void main(String[] args){
        File file = new File("data");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            fos.write(65);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {}
            }
        }

    }
}
