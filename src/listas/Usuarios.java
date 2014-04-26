/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listas;

/**
 *
 * @author provEsol4
 */
public class Usuarios {
    private int cod;
    private String nombre, apellido;    
    private double saldo;
    private int telefono;

/************************CODIGO *******************/
//Obtiene el codigo del nodo
public int getCod(){
    return cod;
}
//Guarda en codigo del usuario en el nodo en el que se encuentra
public void setCod(int cod){
    this.cod = cod;
}


/*********************** NOMBRE ***************************/
public String getNombre(){
    return nombre;
}

public void setNombre(String nombre){
    this.nombre = nombre;
}

/************************** APELLIDO *********************/

public String getApellido(){
    return apellido;
}

public void setApellido(String apellido){
    this.apellido = apellido;
}

/****************************   SALDO **********************/

public double getSaldo(){
    return saldo;
}

public void setSaldo(double saldo ){
    this.saldo = saldo;
}

/****************************   TELEFONO  **********************/

public int getTelefono(){
    return telefono;
}

public void setTelefono(int telefono ){
    this.telefono = telefono;
}
}
