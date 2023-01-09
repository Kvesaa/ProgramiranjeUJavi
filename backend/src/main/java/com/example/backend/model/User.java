package com.example.backend.model;


import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(nullable = false)
    private String Ime;

    @Column(nullable = false)
    private String Prezime;

    @Column(unique = true, nullable = false)
    private String JMBG;

    @Column(nullable = false)
    private String Spol;

    @Column(nullable = false)
    private String BrTelefona;

    @Column(unique = true, nullable = false)
    private String Mail;

    @Column(nullable = false)
    private String Slika;

    @Column(nullable = false)
    private String Opis;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return Ime;
    }

    public void setName(String ime) {
        Ime = ime;
    }

    public String getPrezime() {
        return Prezime;
    }

    public void setPrezime(String prezime) {
        Prezime = prezime;
    }

    public String getJMBG() {
        return JMBG;
    }

    public void setJMBG(String JMBG) {
        this.JMBG = JMBG;
    }

    public String getSpol() {
        return Spol;
    }

    public void setSpol(String spol) {
        Spol = spol;
    }

    public String getBrTelefona() {
        return BrTelefona;
    }

    public void setBrTelefona(String brTelefona) {
        BrTelefona = brTelefona;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getSlika() {
        return Slika;
    }

    public void setSlika(String slika) {
        Slika = slika;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }

    public User(Long id, String ime, String prezime, String JMBG, String spol, String brTelefona, String mail, String slika, String opis) {
        Id = id;
        Ime = ime;
        Prezime = prezime;
        this.JMBG = JMBG;
        Spol = spol;
        BrTelefona = brTelefona;
        Mail = mail;
        Slika = slika;
        Opis = opis;
    }
    public  User(){

    }

}
