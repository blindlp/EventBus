package gt.com.irc.eventbus.Login;

import java.util.ArrayList;

public interface LoginView {

    void showError(String error);
    void showMessage(String message);
    void showList(ArrayList<Object> obj);
}
