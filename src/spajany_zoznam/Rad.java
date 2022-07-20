/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spajany_zoznam;

/**
 *
 * @author Nikodém Babirád
 */
public class Rad {
    private Atom zaciatok;

    void pridaj(int hodnota){
        if(zaciatok == null){
            zaciatok = new Atom();
            zaciatok.hodnota = hodnota;
        } else{
            Atom list = zaciatok;
            while(list.dalsi != null){
                list = list.dalsi; 
            }
            list.dalsi = new Atom();
            list.dalsi.hodnota = hodnota;          
        }
    }

    void vypis(){
        Atom out = zaciatok;
        while(out != null) {
            System.out.println(out.hodnota);
                out = out.dalsi;
        }
    }
}
