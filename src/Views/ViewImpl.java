package Views;

import Controllers.ButtonListenerController;

import javax.swing.*;
import java.util.List;

public class ViewImpl extends JFrame implements View {
    public ViewImpl(String title){
        super(title);
    }

    private JTextArea textArea;

    @Override
    public void initialiseWindow(List<ButtonListenerController> buttonListener){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,700,300);
        this.setLayout(null);

        this.textArea = new JTextArea();
        textArea.setBounds(190, 30, 450, 200);
        this.add(textArea);

        JButton readFromFile = new JButton("Read from file");
        readFromFile.setBounds(30,30, 150, 30);
        readFromFile.addActionListener(buttonListener.get(0));
        this.add(readFromFile);

        JButton mainAction = new JButton("Do action");
        mainAction.setBounds(30,70,150,30);
        mainAction.addActionListener(buttonListener.get(1));
        this.add(mainAction);

        JButton writeToFile = new JButton("Write to file");
        writeToFile.setBounds(30,110,150,30);
        writeToFile.addActionListener(buttonListener.get(2));
        this.add(writeToFile);

        this.setVisible(true);
    }

    @Override
    public void setText(String text) {
        this.textArea.setText(text);
    }

    @Override
    public String getText() {
        return this.textArea.getText();
    }
}
