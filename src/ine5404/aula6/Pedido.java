/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.aula6;

/**
 *
 * @author 17100518
 */
public class Pedido {
    protected float value;
    protected String description;

    public Pedido(float value, String description) {
        this.value = value;
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
    
    
}
