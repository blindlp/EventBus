package gt.com.irc.eventbus.main;

import com.raizlabs.android.dbflow.sql.language.Condition;

import org.greenrobot.eventbus.Subscribe;

import gt.com.irc.eventbus.Event;
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
    public void onEvent(Event event) {
        if (event.getError() != null && !event.getError().isEmpty()) {
            // TODO: mostrar error en la visa
            this.view.showError(event.getError());


        } else {
            if (event.getMensaje() != null && !event.getMensaje().isEmpty()) {
                // TODO: Mostrar mensaje en la vida.
                this.view.showMessage(event.getMensaje());
            }
            switch (event.getTipo()) {
                case Event.toNumber:
                    this.view.toNumber(Integer.parseInt(event.getObj().toString()));
                    break;
                case Event.compare:
                    this.view.comparativo(Integer.parseInt(event.getObj().toString()), Integer.parseInt(event.getObj2().toString()));
                    break;
                case Event.display:
                    this.view.displayNumber(Integer.parseInt(event.getObj().toString()));
                    break;
                case Event.toUpper:
                    this.view.toUpper(event.getObj().toString());
                    break;
                case Event.sumaNumeros:
                    this.view.sumaNumeros(Integer.parseInt(event.getObj().toString()));
                    break;
                default:
                    //TODO: Mostrar mensaje de evento invalido en la vista
                    break;

            }
        }


    }

    @Override
    public void toNumber(int number) {
        this.model.toNumber(number);
    }


    @Override
    public void comparativo(int numeroUno, int numeroDos) {

        this.model.comparativo(numeroUno, numeroDos);
    }

    @Override
    public void displayNumber(int number) {
        this.model.displayNumbers(number);
    }

    @Override
    public void toUpper(String text) {
        this.model.toUpper(text);
    }

    @Override
    public void sumaNumeros(int numeros) {
        this.model.sumaNumeros(numeros);
    }
}
