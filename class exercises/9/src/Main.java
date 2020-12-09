public class Main {
    public static void main(String[] args) {
        CreatFile creatFile =new CreatFile();

        Thread thread1 = new Thread()
        {
            @Override
            public void run() {
                creatFile.read();
            }
        };
        Thread thread2 = new Thread()
         {
            @Override
            public void run() {
                creatFile.write();
            }
        };
        thread1.start();
        thread2.start();
    }
}
