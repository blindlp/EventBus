package gt.com.irc.eventbus.been;

public class Mascota {

    private String nombre;

    private static Mascota instance;

    public static Mascota getInstance() {
        if(instance == null) {
            instance = new Mascota();
        }
        return instance;
    }

    private Mascota() {
    }


    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public static void setInstance(Mascota instance) {
        Mascota.instance = instance;
    }
}
