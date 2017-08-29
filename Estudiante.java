public class Estudiante{
    private String nombre;  
    public int clave;
    
    public Estudiante(int ClaveIni, String NombreIni){
        nombre=NombreIni;
        clave=ClaveIni;
    }
    
    public String dimeDetalles(){
        return "Clave: " + clave + ", Nombre: " + nombre;
    }
    
    public int dimeClave(){
        return clave;
    }
}