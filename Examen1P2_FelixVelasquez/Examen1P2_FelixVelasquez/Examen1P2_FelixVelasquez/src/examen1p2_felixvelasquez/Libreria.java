/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_felixvelasquez;

/**
 *
 * @author PERSONAL
 */
public class Libreria {
    String autores; 
    String titulo; 
    String genero; 
    String Edi; 
    String idioma; 
    int Ano;
    String isb;
    int ano2;
    String Estado;
    String libro;
    int Persona;

    public Libreria() {
    }

    public Libreria(String autores, String titulo, String genero, String Edi,  int Ano, String isb,  String Estado, String libro, int Persona) {
        this.autores = autores;
        this.titulo = titulo;
        this.genero = genero;
        this.Edi = Edi;
        this.idioma = idioma;
        this.Ano = Ano;
        this.isb = isb;
        this.ano2 = ano2;
        this.Estado = Estado;
        this.libro = libro;
        this.Persona = Persona;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEdi() {
        return Edi;
    }

    public void setEdi(String Edi) {
        this.Edi = Edi;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public String getIsb() {
        return isb;
    }

    public void setIsb(String isb) {
        this.isb = isb;
    }

    public int getAno2() {
        return ano2;
    }

    public void setAno2(int ano2) {
        this.ano2 = ano2;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public int getPersona() {
        return Persona;
    }

    public void setPersona(int Persona) {
        this.Persona = Persona;
    }
    

}