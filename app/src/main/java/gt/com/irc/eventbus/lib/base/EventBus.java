package gt.com.irc.eventbus.lib.base;

public interface EventBus {
    void register(Object sub);
    void unRegister(Object sub);
    void post(Object obj);
}
