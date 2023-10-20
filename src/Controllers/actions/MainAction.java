package Controllers.actions;

import Controllers.ButtonListenerController;
import Models.DoActionModelRepository;
import Views.View;

import java.awt.event.ActionEvent;

public class MainAction implements ButtonListenerController {
    private View view;

    public MainAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DoActionModelRepository doActionModelRepository = new DoActionModelRepository(this.view);
        doActionModelRepository.doAction();
    }
}
