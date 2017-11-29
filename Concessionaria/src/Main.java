
import Control.ListenerAggiunta;
import Control.ListenerLogin;
import Costanti.Accessori;
import Costanti.Utenti;
import Model.FileManager;
import View.Finestra;
import View.FinestraLogin;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

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
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            Accessori accessori = new Accessori();
            FileManager fm = new FileManager();
            FinestraLogin login = new FinestraLogin();
            login.setVisible(true);
            login.setResizable(false);
            Finestra finestra = new Finestra(accessori);
            finestra.setResizable(false);
            Utenti utenti = new Utenti();
            ListenerLogin ascoltatoreLogin = new ListenerLogin(login, finestra, utenti);
            ListenerAggiunta ascoltatoreAggiunta = new ListenerAggiunta(fm, finestra, accessori, ascoltatoreLogin);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
