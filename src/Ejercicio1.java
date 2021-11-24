import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       float num1;
        float num2;
        int suma, resta, mult, div,obcion,respuesta;

        Scanner datos = new Scanner(System.in);
        System.out.println("SELECCIONE: \n1: SUMA, 2: RESTA, 3: MULTIPLICACION, 4 PARA DIVICION. ");
        obcion = datos.nextInt();

         if (obcion==1){
         System.out.println("Ingrese le numero 1: ");
                num1= datos.nextFloat();
                System.out.println("Ingrese le numero 2: ");
                num2= datos.nextFloat();
                respuesta= (int) (num1+num2);
          System.out.println("La suma es "+respuesta+"");
   }
        if (obcion==2){
        System.out.println("Ingrese le numero 1: ");
            num1= datos.nextFloat();
            System.out.println("Ingrese le numero 2: ");
            num2= datos.nextFloat();
            respuesta= (int) (num1-num2);
        System.out.println("La resta es "+respuesta+"");
}

    }
}
