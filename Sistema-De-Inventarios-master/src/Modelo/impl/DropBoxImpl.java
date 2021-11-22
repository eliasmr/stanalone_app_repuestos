package Modelo.impl;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.FileMetadata;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.users.FullAccount;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author elias
 */
public class DropBoxImpl {
    
    private static final String ACCESS_TOKEN ="sl.A8z3ldLVTjMGVYiKYwKhOTULS7N0aAb4wMDF0LUdDAGnQTuH_d_09FROdNN4eJdxezu159S";
    
    public void dropbox(){
    DbxRequestConfig config = new DbxRequestConfig("dropbox/repuestos","en_US");
    DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        try {
            FullAccount acount =  client.users().getCurrentAccount();
            ListFolderResult result = client.files().listFolder("");
            while(true){
            for(Metadata metada : result.getEntries()){
                System.out.println(metada.getPathLower());
            }
            if(!result.getHasMore()){
                break;
            }
            result = client.files().listFolderContinue(result.getCursor());
            
            }
            InputStream in = new FileInputStream("prueba.txt");
            client.files().uploadBuilder("C:\\Users\\c71192a\\OneDrive - EXPERIAN SERVICES CORP\\Documents\\otros\\prueba.txt").uploadAndFinish(in);
        } catch (Exception e) {
            System.err.println("error "+e);
        }
    
    }
}
