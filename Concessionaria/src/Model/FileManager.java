/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.EditedClasses.AppendObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Cecconato Filippo
 */
public class FileManager {
    private File Treviso, Oderzo, VittorioVeneto, Mogliano;
    private File Treviso_sold,Oderzo_sold,VittorioVeneto_sold,Mogliano_sold;
    private FileInputStream inFile; //mi serve per leggere nei file
    private FileOutputStream outFile; //mi serve per scrivere nei file
    private ObjectInputStream inObjet; //mi serve per leggere oggetti dal file
    private ObjectOutputStream outObjet; //mi serve per scrivere oggetti dal file
    
    public FileManager() {
        this.Treviso = new File("File/Treviso.dat");
        this.Oderzo = new File("File/Oderzo.dat");
        this.VittorioVeneto = new File ("File/VittorioVeneto");
        this.Mogliano = new File("File/Mogliano.dat");
        this.Treviso_sold= new File("File/Treviso_sold");
        this.Oderzo_sold= new File("File/Oderzo_sold");
        this.VittorioVeneto_sold= new File("File/VittorioVeneto_sold");
        this.Mogliano_sold= new File("File/Mogliano_sold");
    }
    
    public void scrittura (boolean venduta, String filiale, Auto auto) throws Exception{
        if(!venduta){
            switch(filiale){
                case "Treviso":
                    if(Treviso.exists()){
                        outFile = new FileOutputStream(Treviso,true);
                        outObjet = new AppendObjectOutputStream(outFile);
                    }
                    else{
                         outFile = new FileOutputStream(Treviso);
                         outObjet = new ObjectOutputStream(outFile);
                    }
                    break;
                case "Oderzo":
                     if(Oderzo.exists()){
                        outFile = new FileOutputStream(Oderzo,true);
                        outObjet = new AppendObjectOutputStream(outFile);
                    }
                    else{
                         outFile = new FileOutputStream(Oderzo);
                         outObjet = new ObjectOutputStream(outFile);
                    }
                    break;
                case "VittorioVeneto":
                     if(VittorioVeneto.exists()){
                        outFile = new FileOutputStream(VittorioVeneto,true);
                        outObjet = new AppendObjectOutputStream(outFile);
                    }
                    else{
                         outFile = new FileOutputStream(VittorioVeneto);
                         outObjet = new ObjectOutputStream(outFile);
                    }
                    break;
                case "Mogliano":
                    if(Mogliano.exists()){
                        outFile = new FileOutputStream(Mogliano,true);
                        outObjet = new AppendObjectOutputStream(outFile);
                    }
                    else{
                         outFile = new FileOutputStream(Mogliano);
                         outObjet = new ObjectOutputStream(outFile);
                    }
                    break;
                default:
                    throw new Exception("Nessun caso");
            }
        }
        else{
            switch(filiale){
                case "Treviso":
                    if(Treviso_sold.exists()){
                        outFile = new FileOutputStream(Treviso_sold,true);
                        outObjet = new AppendObjectOutputStream(outFile);
                    }
                    else{
                         outFile = new FileOutputStream(Treviso_sold);
                         outObjet = new ObjectOutputStream(outFile);
                    }
                    break;
                case "Oderzo":
                     if(Oderzo_sold.exists()){
                        outFile = new FileOutputStream(Oderzo_sold,true);
                        outObjet = new AppendObjectOutputStream(outFile);
                    }
                    else{
                         outFile = new FileOutputStream(Oderzo_sold);
                         outObjet = new ObjectOutputStream(outFile);
                    }
                    break;
                case "VittorioVeneto":
                     if(VittorioVeneto_sold.exists()){
                        outFile = new FileOutputStream(VittorioVeneto_sold,true);
                        outObjet = new AppendObjectOutputStream(outFile);
                    }
                    else{
                         outFile = new FileOutputStream(VittorioVeneto_sold);
                         outObjet = new ObjectOutputStream(outFile);
                    }
                    break;
                case "Mogliano":
                    if(Mogliano_sold.exists()){
                        outFile = new FileOutputStream(Mogliano_sold,true);
                        outObjet = new AppendObjectOutputStream(outFile);
                    }
                    else{
                         outFile = new FileOutputStream(Mogliano_sold);
                         outObjet = new ObjectOutputStream(outFile);
                    }
                    break;
                default:
                    throw new Exception("Nessun caso");
            }
            
        }
        outObjet.writeObject(auto);
        outFile.close();
    }
    
    
    
}
