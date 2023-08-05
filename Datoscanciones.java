/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso4progra;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea Cecilia
 */
public class Datoscanciones {
    
    public int idcanción = 0;
    public String nombcanción = "";
    public String autorcancion = "";
    public Double duracanción = 0.0;
    public int añocancion = 0;
    Datoscanciones[] arrcanciones = new Datoscanciones[10];

    public Datoscanciones(int idcanción, String nombcanción, String autorcancion, Double duracancion,int añocancion){
        this.idcanción = idcanción;
        this.nombcanción = nombcanción;
        this.autorcancion = autorcancion;
        this.duracanción = duracancion;
        this.añocancion = añocancion;
    }

    public void setidcanción(){
        Random random = new Random();
        idcanción = random.nextInt(10000);
    }
    public int getidcanción(){
        return idcanción;
    }

    public void setnombcanción(){
        nombcanción = JOptionPane.showInputDialog("escriba el nombre de la canción: ");
    }
    public String getnombcanción(){
        return nombcanción;
    }

    public void setautorcancion(){
        autorcancion = JOptionPane.showInputDialog("escriba quién escribió la canción: ");
    }
    public String getautorcancion(){
        return autorcancion;
    }

    public void setduracanción(){
        duracanción = Double.valueOf(JOptionPane.showInputDialog("escriba la duración de la canción con numero minutos un punto y segundos"));
    }
    public double getduracanción(){
        return duracanción; 
    }

    public void setañocancion(){
        añocancion = Integer.parseInt(JOptionPane.showInputDialog("escriba el año de creación de la canción"));
    }
    public int getañocancion(){
        return añocancion;
    }

    public void setalmacenar(){
        for(int i = 0;i<10;i++){
            setidcanción();
            setnombcanción();
            setautorcancion();
            setduracanción();
            setañocancion();
            arrcanciones[i] = new Datoscanciones(idcanción, nombcanción, autorcancion, duracanción, añocancion);
        }
    }
    
    public String toString(){
        return "Cancion ID: " + idcanción + "\n Nombre canción: " + nombcanción + "\n Autor de la canción: " + autorcancion
        + "\n Duración: " + duracanción + "\n Año de la canción: " + añocancion;
    }
   
    public void mostrar(){
        for(int i = 0;i<10;i++){
            JOptionPane.showMessageDialog(null,arrcanciones[i].toString());
            }
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getañocancion()<2023){
                JOptionPane.showMessageDialog(null,"lista de canciones anteriores al 2023: "+arrcanciones[i]);
            }
        }
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getañocancion()==2023){
                JOptionPane.showMessageDialog(null,"lista de canciones del 2023: "+arrcanciones[i]);
            }
        }
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getañocancion()>2023){
                JOptionPane.showMessageDialog(null,"lista canciones posteriores al 2023: "+arrcanciones[i]);
            }
        }
        Double dura = 0.0;
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getduracanción()>dura){
            dura = arrcanciones[i].getduracanción();
            }
        }
        for(int i = 0;i<10;i++){
            if(arrcanciones[i].getduracanción()==dura){
            JOptionPane.showMessageDialog(null,"la cancion con mayor duracion: "+arrcanciones[i]);
            }
        }
        
        JOptionPane.showMessageDialog(null,"el autor de la canción de tu top 1 es: "+arrcanciones[0]);
        
        
            
    
        
    }
}

    
    
    
    

