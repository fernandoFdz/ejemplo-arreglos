public class Grupo{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria){
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria =nomMateria;
    }
    // terminar este metodo de tarea 
    public void inscribir(Estudiante unEstudiante){
        if(estudiantes [0]== null){
        estudiantes[0] = unEstudiante;
        }
    }
    
    //terminar este metodo de tarea
    public Estudiante darBaja(int claveEstudiante){
        int i=0;
        Estudiante Aux=null;
        //buscar el estudiante con la clave dada
        //y asignarle un null
        while(estudiantes[i].clave!=claveEstudiante){
            i++;
            Aux=estudiantes[i];
            estudiantes[i] = null;
        }
        return Aux;

    }
}