package gt.com.irc.eventbus;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private App app;

    public AppModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    Application providesApplication() {
        return this.app;
    }


    // aqui trasladamos la funcionalaidad del activity para que sea utilizado en cualquier lugar
    @Provides
    @Singleton
    Context providesContext(Application application) {
        return application.getApplicationContext();
    }
}
