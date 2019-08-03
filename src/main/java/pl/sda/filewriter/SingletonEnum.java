package pl.sda.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public enum SingletonEnum {
    INSTANCE,
    ABRAKDABRA;
    public void write (String text, String file)throws IOException {
        FileWriter writer = new FileWriter(new File(file),true);
        writer.write(text);
        writer.close();
    }
    public void show (String text, String file)throws IOException{

        FileWriter writer = new FileWriter(new File(file),true);
        writer.write(text);
        writer.close();
    }
}
