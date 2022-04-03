
package practica3;

import java.util.Scanner;

public class Practica3 {
    static Scanner scanner = new Scanner (System.in);

    
    public static void main(String[] args) {
        
        System.out.println("a continuacion se le presenta un menu, seleccione la opcion deseada, segun su numero");
        System.out.println("1.factorial, 2.tabla de multiplicar, 3.pares e impares, 4.dia de la semana");
        int opcion;
        opcion = scanner.nextInt();
        
        switch(opcion){
            case 1:
                Clase1 resultadoFactorial = new Clase1();
                System.out.print("ingrese el numero al que le quiere sacar el factorial ");
                int numero= scanner.nextInt();
                System.out.println("el resultado del factorial del numero "+ numero+" es " + resultadoFactorial.resultadoF(numero, opcion));
                break;
                
            case 2:
                Clase1 resultadoTa = new Clase1( );
                System.out.println("ingrese el numero del que quiere saber la tabla de multi`plicar ");
                int numeroMulti=scanner.nextInt();
               resultadoTa.resultadoM(numeroMulti);
                break;

             
            case 3:
                Clase2 pares = new Clase2();
                System.out.println("ingrasa el numero ");
                int desicion=scanner.nextInt();
                pares.paresImpares(desicion);
                break;
                
            case 4:
                Clase2 diaDelaSemana = new Clase2();
                System.out.println("ingrasa un numero dependiendo el dia que quiera saber. ");
                System.out.println("1.Lunes, 2.Martes, 3.Miercoles, 4.Jueves, 5.Viernes, 6.Sabado, 7.Domingo");
                int dia=scanner.nextInt();
                diaDelaSemana.diaSemana(dia);
                break;
                
             
                
        }
    }
    
}
