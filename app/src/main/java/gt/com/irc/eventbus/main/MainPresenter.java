package gt.com.irc.eventbus.main;

import gt.com.irc.eventbus.Event;

public interface MainPresenter {
    void onCreate();
    void onDestroy();
    void onEvent(Event event);
    void toNumber(int number);
    void comparativo(int numeroUno, int numeroDos);
    void displayNumber(int number); // despliega los numeros hasta
}
