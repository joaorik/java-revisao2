/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author John Doe
 */
public class NotaException extends Exception {
    
    public String message() {
        return "Nota nao pode ser menor que zero";
    }
    
}
