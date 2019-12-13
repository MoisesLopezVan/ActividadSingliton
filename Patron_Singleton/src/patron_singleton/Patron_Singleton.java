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
public class Patron_Singleton {

   
    public static void main(String[] args) {
        
        Sesion Fotografo = Sesion.getInstance("Erick_Art", "123");
        Sesion Fotografo2 = Sesion.getInstance("Moy_Dar", "321");
        Exclusiva asignada = Exclusiva.getInstance("Moises Dario");
        Exclusiva asignada2 = Exclusiva.getInstance("Erick Diaz");
        
        System.out.println("\nUsuario: " + Fotografo.getUser());
        System.out.println("Contraseña: " + Fotografo.getPassword());
        System.out.println("\nFotografo asignado: " + asignada.getNombre_Fotografo());
    }
    
}
