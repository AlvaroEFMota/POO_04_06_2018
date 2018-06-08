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
public class ClasseA implements InterfaceTeste{
    private Integer id;
    
    public Integer getId()
    {
        return id;
    }
    
    public void setId(Integer id)
    {
        this.id = id;
    }
    
    public final void metodoParaTeste()
    {
        
    }

    @Override
    public void metodoInterface() {
       
    }
}
