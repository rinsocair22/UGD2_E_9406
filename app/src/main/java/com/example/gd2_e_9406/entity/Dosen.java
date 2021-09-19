package com.example.gd2_e_9406.entity;

import android.widget.ImageView;

public class Dosen {
    //  Attribute Entity Mahasiswa
    private String name;
    private String masa;
    private String noDosen;

    //  Constructor Mahasiswa
    Dosen(String name, String masa, String noDosen){
        this.name = name;
        this.masa = masa;
        this.noDosen = noDosen;
    }

    //  Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String getTnoDosen() {
        return noDosen;
    }

    public void setnoDosen(String noDosen) {
        this.noDosen = noDosen;
    }

    //  Static Class Data Dummy
    public static Dosen[] listOfDosen = {
            new Dosen("Jack","5 Tahun Masa kerja" ,"Dosen no 1"),
            new Dosen("Timothy","3 Tahun Masa kerja","Dosen no 2"),
            new Dosen("Jonathan","14 Tahun Masa kerja","Dosen no 3"),
            new Dosen("Yosep","2 Tahun Masa kerja","Dosen no 4"),
            new Dosen("Yona","1 Tahun Masa kerja","Dosen no 5"),
            new Dosen("Wendy","8 Tahun Masa kerja" ,"Dosen no 6"),
            new Dosen("Yohanes","15 Tahun Masa kerja","Dosen no 7"),
            new Dosen("Julias","25 Tahun Masa kerja","Dosen no 8"),
            new Dosen("Yyna","17 Tahun Masa kerja","Dosen no 9"),
            new Dosen("Vlavia","12 Tahun Masa kerja","Dosen no 10"),
    };
}