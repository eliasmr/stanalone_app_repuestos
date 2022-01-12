package Modelo.impl;

import com.dropbox.core.DbxException;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.UploadBuilder;
import com.dropbox.core.v2.files.WriteMode;
import com.dropbox.core.v2.users.FullAccount;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.logging.Logger;
import util.TraceInfoSistem;

/**
 *
 * @author elias
 */
public class DropBoxImpl {
    
    private static final Logger LOGGER = Logger.getLogger("DropBoxImpl");
    private static final String ACCESS_TOKEN = "swkM0HVqszEAAAAAAAAAAWVwOFLsvDmP5C-zQxl7vkEM5hSMrSVLNLhGlOFRiRqN";
    DbxClientV2 client = null;
    public DropBoxImpl(){
     DbxRequestConfig config = new DbxRequestConfig("dropbox/AutopartesLeon","en_US");
     client = new DbxClientV2(config, ACCESS_TOKEN); 
    }
    
    public String uploadFIleDropbox(final String directorio,final String paramFile){
    LOGGER.info(TraceInfoSistem.getTraceInfo("Inicia cargue archivo al dropbox "));
        try {
            FullAccount acount =  client.users().getCurrentAccount(); 
            File file =new File(paramFile);
            InputStream in = new FileInputStream(file);
            String rutaFile = "/AutopartesLeon/"+directorio+"/"+file.getName();
            UploadBuilder upload = client.files().uploadBuilder(rutaFile);
            upload.withClientModified(new Date(file.lastModified()));
            upload.withMode(WriteMode.ADD);
            upload.withAutorename(Boolean.TRUE);
            upload.uploadAndFinish(in);
            return rutaFile;
        } catch (DbxException | IOException e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("Cargando archivo al dropbox", e));
        }
        return "se presentan problemas al cargar la imagen";
    }
    
        public String getFileDrobox(String path){
            try {
             String dropbox = System.getenv("dropbox");
             dropbox = dropbox.concat(path);
             return dropbox;
            } catch ( Exception e) {
                LOGGER.severe(TraceInfoSistem.getTraceInfoError("obteniendo archivo de dropbox", e));
            }
            return "";
        }
}
