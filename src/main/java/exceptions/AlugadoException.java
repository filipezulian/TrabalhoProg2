/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptions;

/**
 *
 * @author Filipe Zulian
 */
public class AlugadoException extends Exception {
    public AlugadoException() {
        super("O veículo já está alugado.");
    }
}
