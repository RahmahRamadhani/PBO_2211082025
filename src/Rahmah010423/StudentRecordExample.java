/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rahmah010423;

/**
 *
 * @author LABP1KOMP
 */
public class StudentRecordExample {
     public static void main(String[] args){
        StudentRecord nini = new StudentRecord();
        StudentRecord rara = new StudentRecord();
        StudentRecord wati = new StudentRecord("Wati");
        
        //isi data
        nini.setName ("nini");
        nini.setAddress("Padang");
        nini.setAge(18);
        nini.setMathGrade(90);
        nini.setEnglishGrade(93);
        nini.setScienceGrade(91);
        
        rara.setName ("Rara");
        rara.setAddress("Bukittinggi");
        rara.setAge(20);
        rara.setMathGrade(89);
        rara.setEnglishGrade(91);
        rara.setScienceGrade(90);
        
        //menampilkan data sasa
        System.out.println("Data Objek Sasa");
        System.out.println("Nama        :" + nini.getName());
        System.out.println("Alamat      :" + nini.getAddress());
        System.out.println("Umur        :" + nini.getAge());
        System.out.println("Rata Rata   :" + nini.getAverage());    //menampilkan rata rata
        System.out.println("Nilai Huruf :" + nini.nilaiHuruf());    //menampilkan nilai huruf
        
        
        //memanggil method print
        System.out.println("\nData Objek Rara");
        rara.print("");
        rara.print(70, 80, 90);
        
        //menampilkan data rara
        System.out.println("Data Objek Rara");
        System.out.println("Nama        :" + rara.getName());
        System.out.println("Alamat      :" + rara.getAddress());
        System.out.println("Umur        :" + rara.getAge());
        System.out.println("Rata Rata   :" + rara.getAverage());    //menampilkan rata rata
        System.out.println("Nilai Huruf :" + rara.nilaiHuruf());    //menampilkan nilai huruf
        
        
        System.out.println("\nData Objek Wati");
        wati.print("");
        
        System.out.println("Data Objek Rara");
        System.out.println("Nama        :" + wati.getName());
        System.out.println("Alamat      :" + wati.getAddress());
        System.out.println("Umur        :" + wati.getAge());
        System.out.println("Rata Rata   :" + wati.getAverage());    //menampilkan rata rata
        System.out.println("Nilai Huruf :" + wati.nilaiHuruf());    //menampilkan nilai huruf
        
        //menampilkan jumlah mahsiswa
        System.out.println("Count="+ StudentRecord.getStudentCount());
       
    }
}
