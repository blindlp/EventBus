package gt.com.irc.eventbus.main.DI;

import javax.inject.Singleton;

import dagger.Component;
import gt.com.irc.eventbus.AppModule;
import gt.com.irc.eventbus.lib.DI.LibModule;
import gt.com.irc.eventbus.main.MainActivity;

@Singleton
@Component(modules = {AppModule.class, LibModule.class, MainModule.class})
public interface MainComponent {
    void inject(MainActivity activity);

}
