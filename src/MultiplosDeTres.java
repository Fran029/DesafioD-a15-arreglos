import java.util.ArrayList;


public class MultiplosDeTres {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Ingrese un multiplo de 3");
            return;
        }

        int sum = 0;
        int total = 0;
        int count = 0;
        ArrayList<Integer> numeros = new ArrayList<>();

        for (String arg : args) {
            try {
                int num = Integer.parseInt(arg);
                numeros.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Error: ingrese un dato valido " + arg);
            }
        }
//  Calcula la suma de los múltiplos de 3
        for (int num : numeros) {
            if (num % 3 == 0) {
                sum += num;
            }
            total += num;
            count++;
        }

        System.out.println("La suma de los múltiplos de 3 es: " + sum);
        if (count > 0) {
            double promedio = (double) total / count;// calcula el promedio
            System.out.println("El promedio de los números es: " + promedio);
        } else {
            System.out.println("No hay números para calcular el promedio");
        }
    }
}








