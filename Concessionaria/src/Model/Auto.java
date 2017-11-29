/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author filippocecconato
 */
public class Auto implements Serializable{
    private String marca;
    private String tipo;
    private String alimentazione;
    private String cilindrata;
    private String stato;
    private int mese,anno;
    private double prezzo;
    
    ArrayList<Accessorio> accessori;

    public Auto(String marca, String tipo, String alimentazione, String cilindrata, String stato, int mese, int anno, double prezzo) {
        this.marca = marca;
        this.tipo = tipo;
        this.alimentazione = alimentazione;
        this.cilindrata = cilindrata;
        this.stato = stato;
        this.mese = mese;
        this.anno = anno;
        this.prezzo = prezzo;
        accessori = new ArrayList<>();
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public String getAlimentazione() {
        return alimentazione;
    }

    public String getCilindrata() {
        return cilindrata;
    }

    public String getStato() {
        return stato;
    }

    public int getMese() {
        return mese;
    }

    public int getAnno() {
        return anno;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public ArrayList<Accessorio> getAccessori() {
        return accessori;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAlimentazione(String alimentazione) {
        this.alimentazione = alimentazione;
    }

    public void setCilindrata(String cilindrata) {
        this.cilindrata = cilindrata;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public void setMese(int mese) {
        this.mese = mese;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", tipo=" + tipo + ", alimentazione=" + alimentazione + ", cilindrata=" + cilindrata + ", stato=" + stato + ", mese=" + mese + ", anno=" + anno + ", prezzo=" + prezzo + ", accessori=" + accessori + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Auto other = (Auto) obj;
        if (this.mese != other.mese) {
            return false;
        }
        if (this.anno != other.anno) {
            return false;
        }
        if (Double.doubleToLongBits(this.prezzo) != Double.doubleToLongBits(other.prezzo)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.alimentazione, other.alimentazione)) {
            return false;
        }
        if (!Objects.equals(this.cilindrata, other.cilindrata)) {
            return false;
        }
        if (!Objects.equals(this.stato, other.stato)) {
            return false;
        }
        if (!Objects.equals(this.accessori, other.accessori)) {
            return false;
        }
        return true;
    }
    
    public void addAccessorio (Accessorio a){
        accessori.add(a);
    }
    
    
    
    
    
}
