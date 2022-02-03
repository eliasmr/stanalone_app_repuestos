/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profile;

import Modelo.TBLSession;

/**
 *
 * @author Elias
 */
public class Ambientes {
    
    
    
    public static TBLSession getEnviromentDba( String ambiente){
    TBLSession session = new TBLSession();
        switch(ambiente){
            case "desa":
                session.setNombreDba("partesleon");
                session.setNombreUsuarioDba("admin");
                session.setContraseniaDba("Root2022");
                session.setHostDba("192.168.1.8");
                session.setPuertoDba("3307");
                break;
            case "prod":
                session.setNombreDba("autopart_leon");
                session.setNombreUsuarioDba("autopart_root");
                session.setContraseniaDba("autopartesleon");
                session.setHostDba("190.8.176.90");
                session.setPuertoDba("3306");
                break;
        }
        return session;
    }
}
