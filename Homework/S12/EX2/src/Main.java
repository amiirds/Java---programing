
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        final String oxford="دانشگاه آکسفورد\nرتبه اول در جهان\t واقع در : انگستان\tسال تاسیس :1906";
        final String elmos ="دانشگاه علم و صنعت \nدر رده ۵۰۰ دانشگاه برتر جهان قرار دارد\t واقع در :  ایران\tسال تاسیس :1313";
        final String tehran = "دانشگاه تهران \nدر رده ۵۰۰ دانشگاه برتر جهان قرار دارد\t واقع در : ایران\tسال تاسیس :1209";
        final String usc="دانشگاه علم و فرهنگ \nدر رده ۵۰۰ دانشگاه برتر جهان قرار دارد\t واقع در :ایران\tسال تاسیس :1372 ";


        University university = new University() {
            @Override
            public void universityInfo() {
                File file = new File("src/uni.txt");
                try {
                    FileWriter fileWriter = new FileWriter(file);
                    fileWriter.write(oxford+"\n"+elmos+"\n"+tehran+"\n"+usc);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace ();
                }
            }
        };university.universityInfo();
        System.out.println("Go to source file to Uni.txt to see result");




    }
}
