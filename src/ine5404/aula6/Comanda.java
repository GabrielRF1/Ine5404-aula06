/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5404.aula6;

import java.util.LinkedList;
import java.util.List;



/**
 *
 * @author 17100518
 */
public class Comanda {
   protected List<Pedido> pedidos;

    public Comanda() {
        pedidos= new LinkedList<>();
    }
    
    public void addPedido(Pedido pe){
    pedidos.add(pe);
    }
    
    public float valorTotal(){
    float total=0;
        for(Pedido pd : pedidos){
        total+=pd.getValue();
    }
        return total;
    }
}
