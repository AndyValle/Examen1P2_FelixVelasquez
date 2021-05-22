
package examen1p2_felixvelasquez;

import java.util.ArrayList;


public class Login {
    ArrayList<Libreria> Libros= new ArrayList<>();
     ArrayList<Libreria> Prestados = new ArrayList<>();
     String Nombre;
     String Apellido;
     String Edad;
     int Codigo;
     String Contraseña;
     int Rol_Usuario; 
    
     
     
    public Login() {
    }

    public Login(String Nombre, String Apellido, String Edad, int Codigo, String Contraseña, int Rol_Usuario) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Codigo = Codigo;
        this.Contraseña = Contraseña;
        this.Rol_Usuario = Rol_Usuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getRol_Usuario() {
        return Rol_Usuario;
    }

    public void setRol_Usuario(int Rol_Usuario) {
        this.Rol_Usuario = Rol_Usuario;
    }

    public ArrayList<Libreria> getLibrosPrestados() {
        return Libros;
    }

    public void setLibrosPrestados(ArrayList<Libreria> LibrosPrestados) {
        this.Libros = LibrosPrestados;
    }

    public ArrayList<Libreria> getHistoriallibrosPrestados() {
        return Prestados;
    }

    public void setHistoriallibrosPrestados(ArrayList<Libreria> HistoriallibrosPrestados) {
        this.Prestados = HistoriallibrosPrestados;
    }
    
}
