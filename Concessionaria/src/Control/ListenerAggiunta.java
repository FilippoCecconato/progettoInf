/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Costanti.Accessori;
import Model.Accessorio;
import Model.Auto;
import Model.FileManager;
import View.Finestra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cecconato Filippo
 */
public class ListenerAggiunta implements ActionListener {

    FileManager fm;
    Finestra finestra;
    Accessori accessori;
    ListenerLogin listenerLogin;

    public ListenerAggiunta(FileManager fm, Finestra finestra, Accessori accessori, ListenerLogin listenerLogin) {
        this.fm = fm;
        this.finestra = finestra;
        this.accessori = accessori;
        this.listenerLogin = listenerLogin;
        this.finestra.getjButton1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.finestra.getjButton1()){
           Auto a;
           if(this.finestra.getjRadioButton5().isSelected()){
               a = new Auto(this.finestra.getjTextField1().getText(), this.finestra.getjTextField2().getText(), (this.finestra.getjRadioButton1().isSelected())? "Benzina":(this.finestra.getjRadioButton2().isSelected())? "Diesel":"GPL" , this.finestra.getjTextField3().getText(), Integer.parseInt((String)this.finestra.getjTextField4().getText()));           
           }
           else{
               a = new Auto(this.finestra.getjTextField1().getText(), this.finestra.getjTextField2().getText(), (this.finestra.getjRadioButton1().isSelected())? "Benzina":(this.finestra.getjRadioButton2().isSelected())? "Diesel":"GPL" , this.finestra.getjTextField3().getText(), Integer.parseInt((String)this.finestra.getjComboBox2().getSelectedItem()) , Integer.parseInt((String)this.finestra.getjComboBox3().getSelectedItem()), Integer.parseInt((String)this.finestra.getjTextField4().getText()));           
           }
           a.addAccessorio(new Accessorio((String)this.finestra.getjComboBox1().getSelectedItem(), this.accessori.getPrezzo((String)this.finestra.getjComboBox1().getSelectedItem())));
            try {
                this.fm.scrittura(false, this.listenerLogin.getUser(), a);
            } catch (Exception ex) {
                Logger.getLogger(ListenerAggiunta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
