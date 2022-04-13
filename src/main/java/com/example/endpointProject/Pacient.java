package com.example.endpointProject;

public class Pacient {
    int id;
    String nume;
    String prenume;
    Long nr_telefon;

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public Long getNr_telefon() {
        return nr_telefon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public void setNr_telefon(Long nr_telefon) {
        this.nr_telefon = nr_telefon;
    }
}
