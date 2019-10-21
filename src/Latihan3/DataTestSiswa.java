/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author ARVINA
 */
public class DataTestSiswa {
   public static void main(String[] args){
       
       EncapSiswa siswa= new EncapSiswa();
       siswa.setName("arfina devi");
       siswa.setAge(15);
       siswa.setAddress("jombang");
       
       System.out.println("Name :"+siswa.getName());
       System.out.println("Age :"+siswa.getAge());
       System.out.println("Address :"+siswa.getAddress());
   }    
}
