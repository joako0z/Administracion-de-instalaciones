/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Utilidades;

/**
 *
 * @author Joako0z
 */
public class Validaciones {

    public static boolean CodigoPostal(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (!Character.isDigit(texto.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean Telefonos(String telefonos) {
        for (int i = 0; i < telefonos.length(); i++) {
            if (telefonos.charAt(i) == '-' || Character.isDigit(telefonos.charAt(i))) {

            } else {
                return false;
            }

        }
        return true;

    }

}


