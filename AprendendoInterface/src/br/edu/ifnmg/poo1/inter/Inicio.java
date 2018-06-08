/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.poo1.inter;

/**
 *
 * @author alvaro
 */
public class Inicio {
    public static void main(String[] args) {
     ClasseA obj = new ClasseA();
        System.out.println(obj.COD);
        //obj.COD = new Integer(2);  //não pode ser alterado
        
        InterfaceTeste obj2 = new ClasseA();
        
        
    }
}
