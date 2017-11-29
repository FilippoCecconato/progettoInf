/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Costanti;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author filippocecconato
 */
class Accessori {
    //Array Associativo
    private Map <String,Double> accessori;

    public Accessori(Map<String, Double> accessori) {
        this.accessori = new HashMap<>();
        this.accessori.put("Radio Bluetooth MP3", 400.0);
        this.accessori.put("App Connect", 250.0);
        this.accessori.put("Cruise Control", 480.0);
        this.accessori.put("Clima", 120.0);
        this.accessori.put("Cerchi Lega", 1200.0);
    }

    public ArrayList<String> getAccessori() {
        ArrayList<String>ack = new ArrayList<>();
        Iterator<String> iter = accessori.keySet().iterator();
        while(iter.hasNext()){
            String s = iter.next();
            ack.add(s);
        }
        return ack;
    }
    
    public Double getPrezzo(String key){
        return this.accessori.get(key);
    }
    
    
    
}
