import java.text.DecimalFormat;
import java.util.ArrayList;

public class SmartWatch {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Debe ingresar algún dato");
            return;
        }

        ArrayList<Integer> pasos = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            int datos = Integer.parseInt(args[i]);
            pasos.add(datos);
            System.out.println(pasos);

        }

        ClearSteps(pasos);
        System.out.println(pasos);
        double suma = 0;
        for (int elementoP : pasos){
            suma += elementoP;
        }

        double promedio = suma/pasos.size();
        System.out.println("el promedio de pasos es de :" + promedio);
    }

    public static  void ClearSteps(ArrayList <Integer> pasos) {

        for (int i = 0; i < pasos.size(); i++) {
            int datoPaso = pasos.get(i);
            if (datoPaso < 200 || datoPaso > 100000) {
                pasos.remove(i);
                i--;
            }


        }
        System.out.println(pasos);
    }
}

