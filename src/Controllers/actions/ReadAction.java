package Controllers.actions;

import Controllers.ButtonListenerController;
import Models.ReadModelRepository;
import Views.View;

import java.awt.event.ActionEvent;

public class ReadAction implements ButtonListenerController {
    private View view;

    public ReadAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ReadModelRepository readModelRepository = ReadModelRepository.getInstance(this.view);
        readModelRepository.readFromFile("input.txt");
    }
}
