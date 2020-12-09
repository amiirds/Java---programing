import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class CreatFile {
    File file1 = new File("/Users/amirrezadelavaran/Desktop/file/txt1.txt");
    File file2 = new File("/Users/amirrezadelavaran/Desktop/file/txt2.txt");
    public void write() {
        try {
            FileWriter fileWriter = new FileWriter(file2);
            fileWriter.write(content);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("writing is processing...");
    }
    String content="";
    public void read(){
        try {
            FileReader fileReader = new FileReader(file1);
            int ascii = fileReader.read();

            while (ascii != -1)
            {
                content += (char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}