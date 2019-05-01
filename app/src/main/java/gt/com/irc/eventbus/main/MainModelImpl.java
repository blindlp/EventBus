package gt.com.irc.eventbus.main;

import gt.com.irc.eventbus.Event;
import gt.com.irc.eventbus.lib.base.EventBus;

public class MainModelImpl implements MainModel {

    private EventBus bus;

    public MainModelImpl(EventBus bus) {
        this.bus = bus;
    }

    @Override
    public void toNumber(int number) {
        //bus.post(number);

       // bus.post(new Event(Event.toNumber, null,"Mensaje de error", number));
        bus.post(new Event(Event.toNumber, number));
    }

    @Override
    public void comparativo(int numeroUno, int numeroDos) {

        bus.post(new Event(Event.compare , numeroUno,numeroDos));

    }

    @Override
    public void displayNumbers(int number) {
        bus.post(new Event(Event.display, number));
    }

    @Override
    public void toUpper(String text) {
    bus.post(new Event(Event.toUpper,text));
    }

    @Override
    public void sumaNumeros(int numeros) {
    bus.post(new Event(Event.sumaNumeros,numeros));
    }
}
