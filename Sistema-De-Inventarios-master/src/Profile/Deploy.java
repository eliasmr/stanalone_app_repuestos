/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profile;

/**
 *
 * @author Elias
 */
public class Deploy extends ProfileDeploy{
    
    
    public static Deploy instance;
    
    public static Deploy profile;
    
    
    public static Deploy getInstaceProfile(){
     if(instance==null){
      instance = new Deploy();
     }
     return instance;
    }
    
    public Deploy getProfile(){
     if(profile == null ){
        NAME_DBA = "hola";
     }
     
     return profile;
    }
    
    
}
