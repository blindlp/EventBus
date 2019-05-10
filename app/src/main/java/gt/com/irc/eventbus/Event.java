package gt.com.irc.eventbus;

import java.io.Serializable;
import java.util.ArrayList;

public class Event implements Serializable {

    public static final int toNumber = 1;
    public static final int compare = 2;
    public static final int display =3;
    public static final int toUpper =4;
    public static final int sumaNumeros =5;
    public static final int arrayList =6;

    private int tipo; // tipo
    private String mensaje; // notificar algo
    private String error; // notificacion de mensaje de error
    private Object obj; // es una variable para poder manejar cualquier objeto
    private Object obj2; // es una variable para manejar otro bojeto

    public Event(int tipo, String mensaje, String error, Object obj) {
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.error = error;
        this.obj = obj;
    }

    public Event(int tipo, String mensaje, String error, Object obj, Object obj2) {
        this.tipo = tipo;
        this.mensaje = mensaje;
        this.error = error;
        this.obj = obj;
        this.obj2 = obj2;
    }

    public Event(int tipo, Object obj) {
        this.tipo = tipo;
        this.obj = obj;
    }

    public Event(int tipo, Object obj, Object obj2) {
        this.tipo = tipo;
        this.obj = obj;
        this.obj2 = obj2;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getObj2() {
        return obj2;
    }

    public void setObj2(Object obj2) {
        this.obj2 = obj2;
    }
}
