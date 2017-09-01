public class Grupo{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    /*
     * constructo de un grupo
     */
    public Grupo(int totalEstudiantes, String nomMateria){
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria =nomMateria;
    }
    // terminar este metodo de tarea
    /**
     * busca un espacio disponible en el arreglo 
     * @return Regresa la primer posicion nula dentro del arreglo.
     */
    private int buscaEspacioDisponible(){
        for(int i=0; i < estudiantes.length; i++){
            if(estudiantes[i]==null)
                return 1;
        }
        return -1;
    }
        
    /**
     * Inscribe un estudiante nuevo en el grupo 
     * @param unEstudiante es el objeto estudiante a inscribir en el grupo
     * @return regresa verdadero si el estudiante fue inscrito o falso en caso
     * de que no se pudiera escribir
     */
    public boolean inscribir(Estudiante unEstudiante){
        int  existe = this.buscarEstudiante(unEstudiante.dimeClave());
        if(existe == -1){
            return false; //el estudiante esta inscrito
        }
        int posDisponible =this.buscaEspacioDisponible();
        if (posDisponible== -1){
            return false; // el estudiante ya esta inscrito
        }
        estudiantes[0] = unEstudiante;      //inscribe al alumno :v
        return true; //el estudiante fue inscrito 
        
    
    }
    //terminar este metodo de tarea
    /*
     * metodo que da de baja a un alumno de un grupo
     */
    public boolean darBaja(int claveEstudiante){
        //buscar el estudiante con la clave dada
        //y asignarle un null
        int  existe = this.buscarEstudianteBorrar(claveEstudiante);
        if(existe == -1){
            return false; //el estudiante esta inscrito y fue eliminado
        }
        
        return true;// no fue eliminado 

    }
    
    /**
     * busca un estudiante por medio de su clave.
     * @param claveEstudiante parametro que representa la clave del estudiante a buscar
     * @return Regresa la posicion del estudiante n el arreglo o -1 si no existe
     */
    private int buscarEstudiante(int claveEstudiante){
        for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i] != null){
                if(estudiantes[i].dimeClave() == claveEstudiante){
                      return 1;   
                }
            }
        }
        return -1;
    }
    
    /*
     * metodo que busca a un estudiante en el grupo para borrarlo
     */
    private int buscarEstudianteBorrar(int claveEstudiante){
        for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i] != null){
                if(estudiantes[i].dimeClave() == claveEstudiante){
                estudiantes[i]=null;
                return 1;
                }
            }
        }
        return -1;
    }
}