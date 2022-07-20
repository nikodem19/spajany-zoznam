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
public class Hlavna {

    public static void main(String[] args) {
        Rad zoznam = new Rad();
        zoznam.pridaj(1);
        zoznam.pridaj(2);
        zoznam.pridaj(3);
        zoznam.pridaj(4);
        zoznam.pridaj(3);
        zoznam.pridaj(2);
        zoznam.pridaj(1);

        zoznam.vypis();
    }
}
