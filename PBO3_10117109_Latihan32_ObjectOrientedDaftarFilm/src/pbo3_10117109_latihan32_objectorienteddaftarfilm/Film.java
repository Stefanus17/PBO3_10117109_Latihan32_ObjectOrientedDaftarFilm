/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan32_objectorienteddaftarfilm;

/**
 * Nama  : Stefanus Saputra
 * NIM   : 10117109
 * Kelas : IF 3
 * Deskripsi : Menampilkan daftar film dengan genre, durasi, dan rating yang
 * sudah ada/sudah ditentukan
 */
public class Film {
    public  String filmName;
     public  String filmGenre;
     public  double filmRating;
     public  int filmDuration;
     public void nowPlaying (String filmName,String filmGenre,double filmRating,
             int filmDuration){
       
        System.out.println("Judul Film\t: "+filmName);
        System.out.println("Genre Film\t: "+filmGenre);
        System.out.println("Rating Film\t: "+filmRating);
        System.out.println("Durasi Film\t: "+filmDuration+" Menit ");
         System.out.println("");
    
}
}
