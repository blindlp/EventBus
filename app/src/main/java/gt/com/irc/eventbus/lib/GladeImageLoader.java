package gt.com.irc.eventbus.lib;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import gt.com.irc.eventbus.R;
import gt.com.irc.eventbus.lib.base.ImageLoader;

public class GladeImageLoader implements ImageLoader {

    private RequestManager requestManager;

    public GladeImageLoader(RequestManager requestManager) {
        this.requestManager = requestManager;
    }

    public GladeImageLoader(Context context) {
        this.requestManager = Glide.with(context);
    }



    @Override
    public void load(ImageView view, String url) {
        this.requestManager
                .load(url)
                .apply(
                        new RequestOptions()
                        .placeholder(R.mipmap.ic_launcher)
                        .diskCacheStrategy(DiskCacheStrategy.DATA)
                )
                .into(view);

    }
}
