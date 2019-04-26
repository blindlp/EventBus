package gt.com.irc.eventbus.lib;

import gt.com.irc.eventbus.lib.base.EventBus;

public class GreenRobotEventBus implements EventBus {


    private org.greenrobot.eventbus.EventBus bus;

    public GreenRobotEventBus(org.greenrobot.eventbus.EventBus bus) {
        this.bus = bus;
    }

    @Override
    public void register(Object sub) {
        bus.register(sub);

    }

    @Override
    public void unRegister(Object sub) {
        bus.unregister(sub);

    }

    @Override
    public void post(Object obj) {
        bus.post(obj);

    }
}
