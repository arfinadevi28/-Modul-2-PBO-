/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan_4;

/**
 *
 * @author ARVINA
 */
public class UjiBus3 {
     public static void main(String[] abc){
          Bus3 Bus = new Bus3(5);
          Bus.getpenumpang(17);
          Bus.getpenumpang(24);
          Bus.cetakpenumpang();
          // penambahan penumpang   
          Bus.addpenumpang (2); // tambah 2 penumpang
          Bus.cetakpenumpang();
          // penambahan penumpang
          Bus.addpenumpang (1); //tambah 1 penumpang
          Bus.cetakpenumpang();
          // penambahan penumpang
          Bus.addpenumpang (2); //tambah 2 penumpang
          Bus.cetakpenumpang();
          //penambahan peumpang
          Bus.addpenumpang (2); //tambah 2 penumpang
          Bus.cetakpenumpang();
   }
}