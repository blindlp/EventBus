package gt.com.irc.eventbus.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import gt.com.irc.eventbus.App;
import gt.com.irc.eventbus.R;
import gt.com.irc.eventbus.lib.GreenRobotEventBus;
import gt.com.irc.eventbus.lib.base.EventBus;
import gt.com.irc.eventbus.lib.base.ImageLoader;

public class MainActivity extends AppCompatActivity implements MainView {


    @Inject
    MainPresenter presenter;

    @Inject
    ImageLoader loader;


    @BindView(R.id.container)
    RelativeLayout relativeLayout;


    @BindView(R.id.toNumber)
    TextView text;

    @BindView(R.id.textOne)
    TextView textOne;

    @BindView(R.id.textTwo)
    TextView textTwo;

    @BindView(R.id.toText)
    TextView toText;

    @BindView(R.id.textTree)
    TextView textTree;

    @BindView(R.id.image)
    ImageView image;


    private App app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        app = (App) getApplication();

        init();
        presenter.onCreate();
        presenter.toNumber(10);
        presenter.comparativo(10,20);
        presenter.displayNumber(10);
        presenter.toUpper("demo");
        presenter.sumaNumeros(3);

        loader.load(image,"https://sites.google.com/site/kangarooz3d/home/Logos-partenaires-Google.png");
    }


    @Override
    protected void onDestroy() {
        presenter.onDestroy();
        super.onDestroy();
    }

    private void init() {
       // EventBus bus = new GreenRobotEventBus(org.greenrobot.eventbus.EventBus.getDefault());
       // MainModel model = new MainModelImpl(bus);
       //  presenter = new MainPresenterImpl(model, this, bus);
        app.mainComponent(this).inject(this);

    }

    @Override
    public void toNumber(int number) {
        Log.v("Numero", Integer.toString(number));
        text.setText(Integer.toString(number));
    }


    @Override
    public void comparativo(int numeroUno, int numeroDos) {

        String comparativo = "";
        // TODO: Implementacion de comparativo
        Log.e("Numero uno", Integer.toString(numeroUno));
        Log.e("Numero Dos", Integer.toString(numeroDos));

        // realizamos comparativo de que numero es mayor
        if (numeroUno > numeroDos) {
            comparativo = "El numero " + Integer.toString(numeroUno) + " es mayor que " + Integer.toString(numeroDos);
        } else {
            comparativo = "El numero " + Integer.toString(numeroDos) + " es mayor que " + Integer.toString(numeroUno);
        }
        textOne.setText(comparativo);

    }

    @Override
    public void displayNumber(int number) {
        String mensaje = "";
        for (int i=0; i<number;i++) {
            mensaje += i + " " + "\n";
        }
        textTwo.setText(mensaje);
    }

    @Override
    public void toUpper(String text) {
        toText.setText(text.toUpperCase());
    }

    @Override
    public void sumaNumeros(int numero) {
        int i=1;
        int total =0;

        while(i<numero) {
            total = total + numero;
            i++;
        }
        textTree.setText(Integer.toString(total));
    }

    @Override
    public void showError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String message) {
        // TODO: falta implementar el metodo de shackBar
    }


}
