/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas11;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

class Buku {
    private String judul;
    private Pengarang pengarang; 
    
    public Buku(String judul, Pengarang pengarang) {
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    public void infoBuku() {
        System.out.println("Judul Buku: " + judul);
        pengarang.infoPengarang(); 
    }
}

class Perpustakaan {
    private List<Buku> bukuList;
    
    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }
    
    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }
    
    public void infoPerpustakaan() {
        System.out.println("Informasi Perpustakaan:");
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}

class Pengarang {
    private String namaPengarang;
    
    public Pengarang(String namaPengarang) {
        this.namaPengarang = namaPengarang;
    }
    
    public void infoPengarang() {
        System.out.println("Nama Pengarang: " + namaPengarang);
    }
}

public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Pengarang A");
        Pengarang pengarang2 = new Pengarang("Pengarang B");

        Buku buku1 = new Buku("Java Programming", pengarang1);
        Buku buku2 = new Buku("Data Structures", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.infoPerpustakaan();
    }
}

