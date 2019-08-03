package pl.sda.filewriter;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{

    static class Task1 implements Runnable{
        @Override
        public void run() {
            //SingletonEnum fileWriterSingleton = SingletonEnum.INSTANCE;
           // FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
          //  System.out.println(fileWriterSingleton);
            SingletonEnum fileWriterSingleton = SingletonEnum.ABRAKDABRA;
            try {
                fileWriterSingleton.show("Zapisuje watek 1 i uzywa ABRAKDABRA\n ", "data.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class Task2 implements Runnable{
        @Override
        public void run() {
            SingletonEnum fileWriterSingleton2 = SingletonEnum.INSTANCE;
           // FileWriterSingleton fileWriterSingleton2 = FileWriterSingleton.getInstance();
          //  System.out.println(fileWriterSingleton2);
            try {
                fileWriterSingleton2.write("ZAPISUJE WATEK 2 \n ", "data.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    static class Task3 implements Runnable{
        @Override
        public void run() {

            SingletonEnum fileWriterSingleton3 = SingletonEnum.INSTANCE;
            //FileWriterSingleton fileWriterSingleton3 = FileWriterSingleton.getInstance();
           // System.out.println(fileWriterSingleton3);
            try {
                fileWriterSingleton3.write("Zapisuje watek 3 \n", "data.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static class Task4 implements Runnable{
        @Override
        public void run() {

            SingletonEnum fileWriterSingleton4 = SingletonEnum.INSTANCE;
            //FileWriterSingleton fileWriterSingleton4 = FileWriterSingleton.getInstance();
           // System.out.println(fileWriterSingleton4);
            try {
                fileWriterSingleton4.write("Zapisuje watek 4 \n", "data.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main( String[] args )
    {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread thread4 = new Thread(task4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    // realizacja wzorca singleton - ponizej - pomimo 3 prob odwolania sie do metody get instance wywola sie w oknie konsoli tylko raz String: JESTEM W IF
//        FileWriterSingleton fileWriterSingleton = FileWriterSingleton.getInstance();
//        FileWriterSingleton fileWriterSingleton2 = FileWriterSingleton.getInstance();
//        FileWriterSingleton fileWriterSingleton3 = FileWriterSingleton.getInstance();
    }
}
