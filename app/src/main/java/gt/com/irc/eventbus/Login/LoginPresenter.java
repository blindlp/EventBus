package gt.com.irc.eventbus.Login;

import java.util.ArrayList;

import gt.com.irc.eventbus.Event;

public interface LoginPresenter {
    void onCreate();
    void onDestroy();
    void onEvent(Event event);
    void showList(ArrayList<Object> obj);
}
