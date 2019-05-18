package gt.com.irc.eventbus.main.DI;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import gt.com.irc.eventbus.Event;
import gt.com.irc.eventbus.lib.base.EventBus;
import gt.com.irc.eventbus.main.MainModel;
import gt.com.irc.eventbus.main.MainModelImpl;
import gt.com.irc.eventbus.main.MainPresenter;
import gt.com.irc.eventbus.main.MainPresenterImpl;
import gt.com.irc.eventbus.main.MainView;

@Module
public class MainModule {

    private MainView view;

    public MainModule(MainView view) {
        this.view = view;
    }

    @Provides
    @Singleton
    MainView providerMainView() {
        return this.view;
    }

    @Provides
    @Singleton
    MainModel providesMainModel(EventBus bus) {
        return new MainModelImpl(bus);
    }


    @Provides
    @Singleton
    MainPresenter providesMainPresenter(MainModel model, MainView view, EventBus bus) {
        return new MainPresenterImpl(model, view, bus);
    }
}
