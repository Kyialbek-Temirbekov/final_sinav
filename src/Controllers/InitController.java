package Controllers;

import Views.*;
import java.util.List;

public class InitController {
    View window;
    public InitController(View someWindow){
        this.window = someWindow;
    }
    public void init(List<ButtonListenerController> buttonListener){
        this.window.initialiseWindow(buttonListener);
    }
}
