/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        List<Integer> numeroList= new ArrayList<>();
        String [] valores= s.next().split(",");
        for(int i=0;i<valores.length;i++){
            numeroList.add(Integer.parseInt(valores[i]));
        }
        numeroList.sort(null);
        System.out.println("teste1");
                
        
        System.out.println(numeroList);
        
    }
    //private List<Integer> ordenar(List<Integer> numeroList){
        
    //}
}
