import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       float num1;
        float num2;
        int obcion,respuesta,salir;

        //suma=1, resta=2, multiplicacion=3 y divicion=4

        Scanner datos = new Scanner(System.in);
        System.out.println("SELECCIONE: \n1: SUMA, 2: RESTA, 3: MULTIPLICACION, 4 PARA DIVICION, 5: Salir. ");
        obcion = datos.nextInt();

        if (obcion==5){
            System.out.println("fin");}

                      while (obcion<=4){

                          if (obcion==1){
                          System.out.println("Ingrese el numero 1: ");
                          num1= datos.nextFloat();
                          System.out.println("Ingrese el numero 2: ");
                          num2= datos.nextFloat();
                          respuesta= (int) (num1+num2);
                          System.out.println("La suma es "+respuesta+"");}



                          if (obcion==2){
                              System.out.println("Ingrese el numero 1: ");
                              num1= datos.nextFloat();
                              System.out.println("Ingrese el numero 2: ");
                              num2= datos.nextFloat();
                              respuesta= (int) (num1-num2);
                              System.out.println("La resta es "+respuesta+"");}


                          if (obcion==3){
                              System.out.println("Ingrese el numero 1: ");
                              num1= datos.nextFloat();
                              System.out.println("Ingrese el numero 2: ");
                              num2= datos.nextFloat();
                              respuesta= (int) (num1*num2);
                              System.out.println("La Multiplicacion es "+respuesta+"");}

                          if (obcion==4){
                              System.out.println("Ingrese el numero 1: ");
                              num1= datos.nextFloat();
                              System.out.println("Ingrese el numero 2: ");
                              num2= datos.nextFloat();
                              respuesta= (int) (num1/num2);
                              System.out.println("La Divicion es "+respuesta+"");}

                          else {System.out.println("\nSELECCIONE: \n1: SUMA, 2: RESTA, 3: MULTIPLICACION, 4 PARA DIVICION, 5:Salir. ");
                                obcion = datos.nextInt();}



                      }



}
}
