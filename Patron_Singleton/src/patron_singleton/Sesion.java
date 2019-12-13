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
public class Sesion {
    
    private String User;
    private String Password;
    private static Sesion sesion;
    
    private Sesion(String User, String Password){
        this.User = User;
        this.Password = Password;
    }
    
    public static  Sesion getInstance(String User, String Password){
        if (sesion == null){
            sesion = new Sesion(User, Password);
        } else {
            System.out.println("Sesion ya iniciada");
        }
        return sesion;
    }
    
    public String getUser(){
        return User;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setUser(String User){
        this.User = User;
    }
    
    public void setPassword(String Password){
        this.Password = Password;
    }
}
