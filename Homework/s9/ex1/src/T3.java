import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class T3 extends Thread {
    @Override
    public void run() {
        String s = "";
        try {
            File file = new File("src/test.txt");
            FileReader fileReader = new FileReader(file);
            int i = fileReader.read();
            while (i != -1) {
                s += (char)i;
                i = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}