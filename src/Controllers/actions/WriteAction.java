package Controllers.actions;

import Controllers.ButtonListenerController;
import Models.WriteModelRepository;
import Views.View;

import java.awt.event.ActionEvent;

public class WriteAction implements ButtonListenerController {
    private View view;

    public WriteAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        WriteModelRepository writeModelRepository = new WriteModelRepository(this.view);
        writeModelRepository.writeToFile("test.txt");
    }
}
