package gt.com.irc.eventbus.main;

import gt.com.irc.eventbus.lib.base.EventBus;

public class MainModelImpl implements MainModel {

    private EventBus bus;

    public MainModelImpl(EventBus bus) {
        this.bus = bus;
    }

    @Override
    public void number(int number) {

    }
}
