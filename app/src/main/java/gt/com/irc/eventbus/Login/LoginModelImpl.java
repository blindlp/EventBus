package gt.com.irc.eventbus.Login;

import java.util.ArrayList;

import gt.com.irc.eventbus.Event;
import gt.com.irc.eventbus.lib.base.EventBus;

public class LoginModelImpl implements LoginModel {

    private EventBus bus;


    public LoginModelImpl(EventBus bus) {
        this.bus = bus;
    }


    @Override
    public void showList(ArrayList<Object> obj) {
        bus.post(new Event(Event.arrayList, obj));
    }
}
