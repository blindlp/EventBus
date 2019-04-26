package gt.com.irc.eventbus.main;

import org.greenrobot.eventbus.Subscribe;

import gt.com.irc.eventbus.lib.base.EventBus;

public class MainPresenterImpl implements MainPresenter {

    private MainModel model;
    private MainView view;
    private EventBus bus;

    public MainPresenterImpl(MainModel model, MainView view, EventBus bus) {
        this.model = model;
        this.view = view;
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
    @Subscribe
    public void onEvent(int number) {
        this.view.number(number);
    }

    @Override
    public void number(int number) {
        this.model.number(number);
    }
}
