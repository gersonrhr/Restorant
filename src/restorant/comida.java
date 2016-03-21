/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restorant;
import java.io.Serializable;

/**
 *
 * @author Anon
 */
public class comida implements Serializable{
    String comida []=null;
    String ensalada[]=null;
    
    public String[] getComida() {
        return comida;
    }

    public void setComida(String[] comida) {
        this.comida = comida;
    }

    public String[] getEnsalada() {
        return ensalada;
    }

    public void setEnsalada(String[] ensalada) {
        this.ensalada = ensalada;
    }
    
    public void addcomida(String c){
        System.out.println(comida.length);
        comida[comida.length+1]=c;
    }
    public void addensalada(String c){
        ensalada[ensalada.length+1]=c;
    }
    
}
