package gt.com.irc.eventbus.Login;

import java.util.ArrayList;

import gt.com.irc.eventbus.Event;
import gt.com.irc.eventbus.lib.base.EventBus;

public class LoginPresenterImpl implements LoginPresenter {

    private LoginModel loginModel;
    private LoginView loginView;
    private EventBus bus;

    public LoginPresenterImpl(LoginModel loginModel, LoginView loginView, EventBus bus) {
        this.loginModel = loginModel;
        this.loginView = loginView;
        this.bus = bus;
    }

    @Override
    public void onCreate() {
        this.bus.register(this);
    }

    @Override
    public void onDestroy() {
        this.bus.unRegister(this);
    }


    @Override
    public void onEvent(Event event) {
        if (event.getError() != null && !event.getError().isEmpty()) {
            // TODO: mostrar error en la visa
            this.loginView.showError(event.getError());


        } else {
            //TODO: falta implementar toda la parte del else
        }

    }

    @Override
    public void showList(ArrayList<Object> obj) {

    }
}
