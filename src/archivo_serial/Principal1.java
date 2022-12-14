package archivo_serial;

import java.io.File;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        String nra = "data/objeto.ser";

        File f = new File(nra);

        System.out.println("CREAR ARCHIVO");

        if (!f.exists()) {
            if (MetodoArchivoSerial.crear(nra)) {
                System.out.println("OK: CREAR");
            } else {
                System.out.println("ERROR: CREAR");
            }
        }else {
            System.out.println("EL ARCHIVO YA ESTA CREADO");
        }

        System.out.println("ESCRIBIR OBJETOS ARCHIVO");

        Rectangulo r1 = new Rectangulo("R1", 4, 5);
        Rectangulo r2 = new Rectangulo("R2", 6, 7);

        if (MetodoArchivoSerial.escribir(nra, r1)) {
            System.out.println("OK: ESCRIBIR");
        } else {
            System.out.println("ERROR: ESCRIBIR");
        }

        if (MetodoArchivoSerial.escribir(nra, r2)) {
            System.out.println("OK: ESCRIBIR");
        } else {
            System.out.println("ERROR: ESCRIBIR");
        }

        System.out.println("LEER OBJETOS ARCHIVO");

        List<Object> objetos_al = MetodoArchivoSerial.leer(nra);
        Rectangulo.cabecera();
        for (Object objeto : objetos_al) {
            Rectangulo r = (Rectangulo) objeto;
            r.cuerpo();
        }
    }

}
