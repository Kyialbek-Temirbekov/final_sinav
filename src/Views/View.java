package Views;

import Controllers.ButtonListenerController;

import java.util.List;

public interface View extends TextArea {
    public void initialiseWindow(List<ButtonListenerController> buttonListener);
}
