/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh;

/**
 *
 * @author Docente
 */
public class Gerentes extends Empleado{
    private boolean tienecarro;
    private boolean vacacionespagadas; 

    public Gerentes(String nombre, double sueldo, boolean tienecarro, boolean vacacionespagadas) {
        super(nombre, sueldo);
        this.tienecarro = tienecarro;
        this.vacacionespagadas = vacacionespagadas;
    }
}
