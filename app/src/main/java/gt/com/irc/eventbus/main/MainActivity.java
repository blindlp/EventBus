package gt.com.irc.eventbus.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import gt.com.irc.eventbus.R;
import gt.com.irc.eventbus.lib.GreenRobotEventBus;
import gt.com.irc.eventbus.lib.base.EventBus;

public class MainActivity extends AppCompatActivity implements MainView{

    MainPresenter presenter;

    @BindView(R.id.text)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        init();
        presenter.onCreate();
        presenter.number(10);
    }


    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    private void init() {
        EventBus bus = new GreenRobotEventBus(org.greenrobot.eventbus.EventBus.getDefault());
        MainModel model = new MainModelImpl(bus);
        presenter = new MainPresenterImpl(model, this, bus);
    }

    @Override
    public void number(int number) {
        text.setText(number);
    }


}
