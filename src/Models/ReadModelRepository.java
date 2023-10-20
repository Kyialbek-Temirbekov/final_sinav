package Models;

import Views.View;
import Views.ViewImpl;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadModelRepository {

    private final List<String> people;

    private static ReadModelRepository readModelRepository;

    private final View myWindow;

    private ReadModelRepository(View view) {
        this.people = new ArrayList<>();
        myWindow = view;
    }

    public static ReadModelRepository getInstance(View view) {
        if(readModelRepository == null)
            readModelRepository = new ReadModelRepository(view);
        return readModelRepository;
    }
    public void readFromFile(String fileName){
        this.people.clear();
        String currentDirectory = System.getProperty("user.dir");
        String filePath = currentDirectory + File.separator + "src" + File.separator + fileName;
        File file = new File(filePath);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                this.people.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JOptionPane.showMessageDialog((Component) myWindow, "File read successfully.");
    }

    public List<String> getPeople() {
        return people;
    }

}
