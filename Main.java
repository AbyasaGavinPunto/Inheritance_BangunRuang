package pewarisan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
                // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        // membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi ();
        persegi.sisi = 2;
        
        // membuat objek lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.r = 22;
        
        // membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang Persegipanjang = new PersegiPanjang ();
        Persegipanjang.panjang = 8;
        Persegipanjang.lebar = 4;
        
        // membuat objek segitiga dan mengisi nilai properti
        Segitiga segitiga = new Segitiga ();
        segitiga.alas = 12;
        segitiga.alas = 8;
        
        // memanggil method luas dan keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        lingkaran.luas();
        lingkaran.keliling();
        
        Persegipanjang.luas();
        Persegipanjang.keliling();
        
        segitiga.luas();
        segitiga.keliling();
    }
    
}
