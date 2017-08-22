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
public class Ine5404Aula6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comanda co = new Comanda();
        Pedido[] ped=new Pedido[5];
        ped[0]=new Pedido(12.98f, "Coca-cola 300ml");
        ped[1]=new Pedido(100.00f, "Kinde Ovo");
        ped[2]=new Pedido(12.98f, "Coca-cola 300ml");
        ped[3]=new Pedido(10f, "Hamburgão");
        ped[4]=new Pedido(5f, "Guaraná pureza");

        co.addPedido(ped[0]);
        co.addPedido(ped[1]);
        co.addPedido(ped[2]);
        co.addPedido(ped[3]);
        co.addPedido(ped[4]);
        
        for(int i=0;i<ped.length;i++){
        System.out.print(ped[i].getDescription()+"\t\t");
            System.out.println("R$"+ped[i].getValue());
        }
        System.out.printf("------*--------\nTotal: \t\t\tR$%.2f\n",co.valorTotal());
        

    }
    
}
