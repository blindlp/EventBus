package gt.com.irc.eventbus.main;

public interface MainPresenter {
    void onCreate();
    void onDestroy();
    void onEvent(int number);
    void number(int number);
}
