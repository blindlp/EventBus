package gt.com.irc.eventbus.lib.DI;


import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import gt.com.irc.eventbus.AppModule;

@Singleton
@Component(modules = {AppModule.class, LibModule.class})

public interface LibComponent {
}
