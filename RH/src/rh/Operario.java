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
public class Operario extends Empleado{
    private int horaextra;
    private boolean regalias;

    public Operario(String nombre, double sueldo, int horaextra, boolean regalias) {
        super(nombre, sueldo);
        this.horaextra = horaextra;
        this.regalias = regalias;
    }

    public int getHoraextra() {
        return horaextra;
    }

    public boolean isRegalias() {
        return regalias;
    }
    
    
}
