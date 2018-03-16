/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

import java.util.Scanner;

/**
 *
 * @author Docente
 */
public class RH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado []emp;
        Scanner lea = new Scanner(System.in);
        System.out.println("Cuantos empleados");
        int total =lea.nextInt();
        emp = new Empleado[total];
        int contador =0;
        String nombre;
        double sueldo;
        do{
            System.out.println("Nombre del empleado");
            nombre = lea.next();
            System.out.println("Ingrese sueldo");
            sueldo = lea.nextDouble();
            System.out.println("Ingrese 1 si es Gerente o 2 si es operario");
            int opc = lea.nextInt();
            int carro;
            int vacaciones;
            int horasextra;
            int regalias;
            if(opc == 1){
                System.out.println("Ingrese 1 si la empresa paga el carro, caso contrario cualquier otro numero");
                carro = lea.nextInt();
                System.out.println("Ingrese 1 si la empresa paga las vacaciones, caso contrario cualquier otro numero");
                vacaciones = lea.nextInt();
                emp[contador] = new Gerentes(nombre, sueldo,carro == 1,vacaciones == 1);   
            }
            else{
                System.out.print("Cuantas horas extra tiene:");
                horasextra =lea.nextInt();
                System.out.println("Ingrese 1 si el empleado tiene regalias, caso contrario cualquier otro numero");
                regalias = lea.nextInt();
                emp[contador] = new Operario(nombre, sueldo, horasextra, regalias ==1);
            }
            contador++;
        }while(contador != total);
        
        System.out.println("Sueldos");
        
        for(int i = 0; i<=emp.length;i++){
            System.out.println("nombre" + emp[i].getNombre()+ " ----------- Sueldo: " + emp[i].getSueldo());
        }
        
        Operario tmp;
        for (int i= 0; i<emp.length;i++){
            if(emp[i] instanceof Operario){
                tmp = (Operario) emp[i];
                if(tmp.getHoraextra() >=1);
                System.out.println(tmp.getNombre() + "tiene" + tmp.getHoraextra()+ "horas extras");
            }
        }
         
        
        
    }
    
}
