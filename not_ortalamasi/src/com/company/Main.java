package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;


        Scanner ab = new Scanner(System.in);

        //Kullanıcıdan Veri Alma
        System.out.print("Matematik Notunuzu Giriniz : ");
        matematik = ab.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = ab.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = ab.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = ab.nextInt();

        System.out.print("Tarih Notunuzu Giriniz : ");
        tarih = ab.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = ab.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6;

        System.out.println("Ortalamanız : "+sonuc);

        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(gectiMi);
    }
}
