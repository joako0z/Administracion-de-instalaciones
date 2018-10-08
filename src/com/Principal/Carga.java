/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Principal;

import javax.swing.JProgressBar;

/**
 *
 * @author Joako0z
 */
public class Carga extends Thread {

    JProgressBar barra;

    public Carga(JProgressBar progreso) {
        super();
        this.barra = progreso;
    }

    @Override
    public void run() {
        for (int i = 1; i <=100; i++) {
            barra.setValue(i);
            pausa(30);

        }

    }

    public void pausa(int tiempo) {
        try {
            Thread.sleep(tiempo);
        } catch (Exception e) {

        }
    }

}
