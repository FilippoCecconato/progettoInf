
import Control.ListenerLogin;
import Costanti.Utenti;
import View.Finestra;
import View.FinestraLogin;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cecconato Filippo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FinestraLogin login = new FinestraLogin();
        login.setVisible(true);
        Finestra finestra = new Finestra();
        Utenti utenti = new Utenti();
        ListenerLogin ascoltatoreLogin = new ListenerLogin(login, finestra, utenti);
        
    }
    
}
