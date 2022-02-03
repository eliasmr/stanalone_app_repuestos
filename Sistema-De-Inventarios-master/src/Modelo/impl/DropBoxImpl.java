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
import java.nio.file.Files;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.util.Date;
import java.util.logging.Logger;
import sistemaDeInventarios.SistemaDeInventarios;
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
    String rutaFile = "";
        try {
            File file =new File(paramFile);
            rutaFile = "/AutopartesLeon/"+directorio+"/"+file.getName();
            if(SistemaDeInventarios.seesion.getDropbox()){
                  FullAccount acount =  client.users().getCurrentAccount(); 
                  InputStream in = new FileInputStream(file);
                  UploadBuilder upload = client.files().uploadBuilder(rutaFile);
                  upload.withClientModified(new Date(file.lastModified()));
                  upload.withMode(WriteMode.ADD);
                  upload.withAutorename(Boolean.TRUE);
                  upload.uploadAndFinish(in);
              }else{
                String path = SistemaDeInventarios.seesion.getPathFolderRecursos()+"/AutopartesLeon/"+directorio+"/"+file.getName();
                Files.copy(file.toPath(), new File(path).toPath(), REPLACE_EXISTING);
              }
            
            return rutaFile;
        } catch (DbxException | IOException e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("Cargando archivo al dropbox", e));
        }
        return "se presentan problemas al cargar la imagen";
    }
    
        public String getFileDrobox(String path){
            try {
             String dropbox = SistemaDeInventarios.seesion.getPathFolderRecursos();
             dropbox = dropbox.concat(path);
             return dropbox;
            } catch ( Exception e) {
                LOGGER.severe(TraceInfoSistem.getTraceInfoError("obteniendo archivo de dropbox", e));
            }
            return "";
        }
}

