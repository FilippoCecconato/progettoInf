/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Costanti;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cecconato Filippo
 */
public class Utenti {
    private Map<String,String>utenti;

    public Utenti() {
        this.utenti = new HashMap<>();
        utenti.put("Treviso", "treviso");
        utenti.put("Oderzo", "oderzo");
        utenti.put("MoglianoVeneto", "moglianoveneto");
        utenti.put("VittorioVeneto", "vittoioveneto");
    }
    
    public boolean controllo (String username,String password){
        if(utenti.containsKey(username)){
            if(utenti.get(username).equals(password)){
                return true;
            }
            return false;
        }
        return false;
    }
    
    
    
    
    
}
