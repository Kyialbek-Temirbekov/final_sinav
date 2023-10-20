import Controllers.*;
import Controllers.actions.MainAction;
import Controllers.actions.ReadAction;
import Controllers.actions.WriteAction;
import Views.View;
import Views.ViewImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){
        View myWindow = new ViewImpl("Final sinav");
        InitController initController = new InitController(myWindow);

        List<ButtonListenerController> buttonListener = new ArrayList<>();
        buttonListener.add(new ReadAction(myWindow));
        buttonListener.add(new MainAction(myWindow));
        buttonListener.add(new WriteAction(myWindow));

        initController.init(buttonListener);
    }

}
