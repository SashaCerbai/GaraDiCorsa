/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garadicorsa;
import java.util.ArrayList;
/**
 *
 * @author cerba
 */
public class Corridore extends Thread{
    
    public static int METRI=100;
    public static ArrayList<String> CLASSIFICA=new ArrayList<>();
    public static Boolean SEGNA_ARRIVO= false;
    public static int FREQUENZA_STAMPA=1;
    
    public Corridore(String name){
        
        super(name);
    }
    
    @Override
    public void run(){
        
        for (int i = 0; i < METRI; i++) { 
                System.out.println(super.getName() + "-> " + (i+1) + " metri");
        }
        
        assegnaClassifica(super.getName());
    }
    
    public static synchronized void assegnaClassifica(String nome){
        
        if(SEGNA_ARRIVO) stampaArrivo(nome);
        CLASSIFICA.add(nome);
    }
    
    public static void stampaArrivo(String nome){
        
        System.out.println("--------->" + nome + " ha concluso la gara" +"<---------");
    }
    
    public static void stampaClassifica(){
        
        for (int i = 0; i < CLASSIFICA.size(); i++) {
            
            System.out.println("numero " + (i+1) + "----> " + CLASSIFICA.get(i));
        }
    }
}
