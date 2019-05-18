package gt.com.irc.eventbus;

import android.app.Application;

import gt.com.irc.eventbus.lib.DI.LibModule;
import gt.com.irc.eventbus.main.DI.DaggerMainComponent;
import gt.com.irc.eventbus.main.DI.MainComponent;
import gt.com.irc.eventbus.main.DI.MainModule;
import gt.com.irc.eventbus.main.MainView;

public class  App extends Application {


    AppModule appModule = new AppModule(this);
    LibModule libModule = new LibModule();

    public MainComponent mainComponent(MainView view) {
        return DaggerMainComponent.builder()
            .libModule(libModule)
                .appModule(appModule)
            .mainModule(new MainModule((view)))
            .build();
    }
}
