/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author filippocecconato
 */
public class Auto {
    private String marca;
    private String tipo;
    private String alimentazione;
    private String cilindrata;
    private String stato;
    private int mese,anno;
    private double prezzo;
    
    ArrayList<Accessori> accessori;

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

    public ArrayList<Accessori> getAccessori() {
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
    
    
    
    
    
    
}
