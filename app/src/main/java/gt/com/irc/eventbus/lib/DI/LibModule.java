package gt.com.irc.eventbus.lib.DI;


import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import org.greenrobot.eventbus.EventBus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import gt.com.irc.eventbus.lib.GladeImageLoader;
import gt.com.irc.eventbus.lib.GreenRobotEventBus;
import gt.com.irc.eventbus.lib.base.ImageLoader;

@Module
public class LibModule {


    @Provides
    @Singleton
    EventBus provideGreenRobotEventBus() {
        return EventBus.getDefault();
    }


    @Provides
    @Singleton
    gt.com.irc.eventbus.lib.base.EventBus providesEventBus(EventBus bus) {
        return new GreenRobotEventBus(bus);
    }

    @Provides
    @Singleton
    RequestManager providesRequeseManager(Context context) {
        return Glide.with(context);
    }

    @Provides
    @Singleton
    ImageLoader providesImageLoader(RequestManager requestManager) {
        return new GladeImageLoader(requestManager);
    }

}
