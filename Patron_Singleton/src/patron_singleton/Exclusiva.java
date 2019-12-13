/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_singleton;

/**
 *
 * @author Moises Dario
 */
public class Exclusiva {
    
    private String Nombre_Fotografo;
    private static Exclusiva exclusiva;
    
    private Exclusiva(String Nombre_Fotografo){
        this.Nombre_Fotografo = Nombre_Fotografo;
    }
    
    public static  Exclusiva getInstance(String Nombre_Fotografo){
        if (exclusiva == null){
            exclusiva = new Exclusiva(Nombre_Fotografo);
        } else {
            System.out.println("Exclusiva ha sido asignada");
        }
        return exclusiva;
    }
    
    public String getNombre_Fotografo(){
        return Nombre_Fotografo;
    }
    
    public void setNombre_Fotografo(String Nombre_Fotografo){
        this.Nombre_Fotografo = Nombre_Fotografo;
    }
}
