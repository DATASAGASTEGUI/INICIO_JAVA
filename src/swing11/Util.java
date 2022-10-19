package swing11;

import java.util.ArrayList;
import java.util.List;

public class Util {

    public static boolean existe(String idObrero) {
        boolean existe = false;
        for (Obrero o : Ventana.obreros_al) {
            if (o.getIdObrero().equalsIgnoreCase(idObrero)) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            return false;
        } else {
            return true;
        }

    }

    public Obrero getObreroMayorSueldo1() {
        double mayorSueldo = -99999;
        Obrero o1 = null;
        for (Obrero o : Ventana.obreros_al) {
            if (o.getSueldo() > mayorSueldo) {
                mayorSueldo = o.getSueldo();
                o1 = o;
            }
        }
        return o1;
    }

    public static List<Obrero> getObreroMayorSueldo2() {
        List<Obrero> obreros_al = new ArrayList<Obrero>();
        double mayorSueldo = -99999;
        Obrero o1 = null;
        for (Obrero o : Ventana.obreros_al) {
            if (o.getSueldo() > mayorSueldo) {
                mayorSueldo = o.getSueldo();
            }
        }
        for (Obrero o : Ventana.obreros_al) {
            if (o.getSueldo() == mayorSueldo) {
                obreros_al.add(o);
            }
        }
        return obreros_al;
    }

}
