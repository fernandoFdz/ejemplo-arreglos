public class Estudiante{
    private String nombre;  
    public int clave;
    
    /*
     * constructor del objeto estudiante
     */
    public Estudiante(int ClaveIni, String NombreIni){
        nombre=NombreIni;
        clave=ClaveIni;
    }
    
    /*
     * metodo que te da los detalles del objeto estudiante
     */
    public String dimeDetalles(){
        return "Clave: " + clave + ", Nombre: " + nombre;
    }
    
    /*
     * metodo que te regresa cual es la clave del alumno
     */
    public int dimeClave(){
        return clave;
    }
}