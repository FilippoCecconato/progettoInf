/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Costanti.Utenti;
import View.Finestra;
import View.FinestraLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Cecconato Filippo
 */
public class ListenerLogin implements ActionListener{
    FinestraLogin x;
    Finestra y;
    Utenti z;
    String user;

    public ListenerLogin(FinestraLogin x, Finestra y, Utenti z) {
        this.x = x;
        this.y = y;
        this.z = z;
        x.getjButton1().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==x.getjButton1()){
            if(z.controllo(x.getjTextField1().getText(), x.getjTextField2().getText())){
                user=x.getjTextField1().getText();
                x.dispose(); //chiudo la finestra di login
                y.setVisible(true);
            }
            
        }
    }

    public String getUser() {
        return user;
    }
    
    
    
    
    
}
