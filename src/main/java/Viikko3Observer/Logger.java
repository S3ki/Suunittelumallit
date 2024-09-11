package Viikko3Observer;

import java.io.FileWriter;

public class Logger {

    private static Logger instance;

    // Tein FileWriterilla, koska se on nopeampi tässä tapauksessa kuin BufferedWriter.
    private FileWriter fw ;

    private Logger() {
        try {
            fw = new FileWriter("log.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String fileName) {
        String basepath = "src/main/java/Viikko3Observer/";
        try {
            fw.close();
            fw = new FileWriter(basepath + fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void write(String message) {
        try {
            fw.write(message + "\n");
            System.out.println("Logged: " + message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void close() {
        try {
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
