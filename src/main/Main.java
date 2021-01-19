package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String userHome = System.getProperty("user.name");
        String osName = System.getProperty("os.name");
        String[] lines = new String[] {"a", "b", "c", "Você está usando " + osName};
        String path = "/home/" +  userHome + "/Área de Trabalho/" + "OS.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




