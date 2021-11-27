package Modelo.impl;

import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.v2.DbxClientV2;
import com.dropbox.core.v2.files.ListFolderResult;
import com.dropbox.core.v2.files.Metadata;
import com.dropbox.core.v2.files.UploadBuilder;
import com.dropbox.core.v2.files.WriteMode;
import com.dropbox.core.v2.users.FullAccount;
import java.io.File;
import java.io.FileInputStream;
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
    private static final String ACCESS_TOKEN ="sl.A9FaEec0dwxut7rYsszRSJybZL3BCfVGfeQ6eH8qEZO5pJU7ZkYpZyYWYuutLGa7XfovMXMWiYewLIe1f8XvYJu1jcoxXK61KOBpNH1T9uztl1N-B7BOQHqU5h9nfI4U6kAB_oiHsogX";
    
    public String uploadFIleDropbox(final String directorio,final String paramFile){
    LOGGER.info(TraceInfoSistem.getTraceInfo("Inicia cargue archivo al dropbox "));
        try {
            DbxRequestConfig config = new DbxRequestConfig("dropbox/repuestos","en_US");
            DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
            File file =new File(paramFile);
            InputStream in = new FileInputStream(file);
            String rutaFile = "/AutopartesLeon/"+directorio+file.getName();
            UploadBuilder upload = client.files().uploadBuilder(rutaFile);
            upload.withClientModified(new Date(file.lastModified()));
            upload.withMode(WriteMode.ADD);
            upload.withAutorename(Boolean.TRUE);
            upload.uploadAndFinish(in);
            return rutaFile;
        } catch (Exception e) {
            LOGGER.severe(TraceInfoSistem.getTraceInfoError("Cargando archivo al dropbox", e));
        }
        return "";
    }
}
