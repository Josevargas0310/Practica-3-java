package practica3;

import static practica3.Practica3.scanner;
public class Clase2 {
    
    //atributos
    int dia;
    int suma;
    int[] datos =new int[10];
    
    //constructor 
    public Clase2(){
        
    }
    //metodos 
    
    public void paresImpares(int desicion){
        for (int i=1; i<10; i++){
        System.out.println("ingrese un numero "+ (i+1));
        datos[i]=scanner.nextInt();
        suma= suma+ datos[i];
        
    }
        System.out.println("los numeros pares ingresados son ");
        for (int i=0; i<10; i++)
            if (datos[i]%2==0)
            
        System.out.println(datos[i]);   
        System.out.println("la suma de todos los numeros es "+ suma);
    }
    
    
    
    
    
    
    public int diaSemana(int dia){
        switch(dia)
        {
            case 1 -> {
                System.out.println("Hoy es lunes, dia de laboral");
            }
            case 2 -> {
                System.out.println("Hoy es martes, dia de laboral");
            }
            case 3 -> {
                System.out.println("Hoy es miercoles, dia de laboral");
            }
            case 4 -> {
                System.out.println("Hoy es Jueves, dia de laboral");
            }
            case 5 -> {
                System.out.println("Hoy es vienes, dia de laboral");
            }
            case 6 -> {
                System.out.println("Hoy es sabado, dia de estudiar");
            }
            case 7 -> {
                System.out.println("Hoy es Domingo, dia de descanso");
            }
        }
     return dia;   
    }
    
}
