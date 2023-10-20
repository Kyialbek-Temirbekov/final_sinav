package Models;

import Views.View;
import Views.ViewImpl;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteModelRepository {
    private final View myWindow;

    public WriteModelRepository(View view) {
        myWindow = view;
    }
    public void writeToFile(String fileName){

        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + File.separator + "src" + File.separator + fileName;
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(myWindow.getText());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog((Component) myWindow, "File saved successfully.");
    }
}
