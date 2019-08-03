package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSingleton {

    private static FileWriterSingleton instance;

    private FileWriterSingleton() {
    }

    ;

    public  synchronized static FileWriterSingleton getInstance() {

        if (instance == null) {
            System.out.println("JESTEM w IF");
            instance = new FileWriterSingleton();
        }
        return instance;
    }

    public void write (String text, String file)throws IOException {
        FileWriter writer = new FileWriter(new File(file),true);
        writer.write(text);
        writer.close();;
    }
}
