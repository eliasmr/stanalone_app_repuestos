
package Modelo;

/**
 *
 * @author Elias
 */
public class ConsultasSQL {
    
 /*repuesto**/
    public final static String INSERT_REPUESTO = "INSERT INTO TBL_REPUESTO(NOMBRE,REFERENCIA,DESCRIPCION,RUTA_IMAGEN) VALUES(?,?,?,?)";
    public final static String GET_REPUESTO = "SELECT * FROM TBL_REPUESTO M WHERE M.NOMBRE LIKE '%?%'";
    public final static String GET_REPUESTO_BY_ID = "SELECT * FROM TBL_REPUESTO M WHERE M.ID_REPUESTO =?";
    public final static String UPDATE_REPUESTO = "UPDATE TBL_REPUESTO SET NOMBRE=?, REFERENCIA=?, DESCRIPCION=?, RUTA_IMAGEN=? WHERE ID_REPUESTO=?";
    public final static String DELETE_REPUESTO = "DELETE FROM TBL_REPUESTO WHERE ID_REPUESTO = ?";
    public final static String ALL_REPUESTO = "SELECT * FROM TBL_REPUESTO";
    public final static String ALL_REPUESTO_BY_MODELO= "SELECT * FROM TBL_REPUESTO ";
    
    /*Combustible*/
    public final static String GET_COMBUSTIBLE = "SELECT * FROM TBL_TIPO_COMBUSTIBLE M WHERE M.ID_TIPO_COMBUSTIBLE =?";
    public final static String ALL_COMBUSTIBLE = "SELECT * FROM TBL_TIPO_COMBUSTIBLE";
    
    /**Modelo*/
    public final static String INSERT_MODELO = "INSERT INTO TBL_MODELO(NOMBRE,ANO,CILINDRAJE,ID_TIPO_COMBUSTIBLE,DESCRIPCION,RUTA_IMAGEN,ID_MARCA) VALUES(?,?,?,?,?,?,?)";
    public final static String GET_MODELO = "SELECT * FROM TBL_MODELO M WHERE M.NOMBRE LIKE '%?%'";
    public final static String GET_MODELO_BY_ID = "SELECT * FROM TBL_MODELO M WHERE M.ID_MARCA =?";
    public final static String UPDATE_MODELO = "UPDATE TBL_MODELO SET NOMBRE=?, ANO=?, CILINDRAJE=?, ID_TIPO_COMBUSTIBLE=?, DESCRIPCION=?, RUTA_IMAGEN=?, ID_MARCA=? WHERE ID_MODELO=?";
    public final static String DELETE_MODELO = "DELETE FROM TBL_MODELO WHERE ID_MODELO = ?";
    public final static String ALL_MODELO = "SELECT * FROM TBL_MODELO";
    public final static String GET_MODELO_BY_ID_MODELO = "SELECT * FROM TBL_MODELO M WHERE M.ID_MODELO =?";
    
    /** MARCA **/
    public final static String INSERT_MARCA = "INSERT INTO TBL_MARCA(NOMBRE,DESCRIPCION,ID_MODELO) VALUES(?,?,?)";
    public final static String GET_MARCA = "SELECT * FROM TBL_MARCA M WHERE M.NOMBRE LIKE '%?%'";
    public final static String GET_MARCA_BY_ID = "SELECT * FROM TBL_MARCA M WHERE M.ID_MARCA =?";
    public final static String UPDATE_MARCA = "UPDATE TBL_MARCA SET NOMBRE=?, DESCRIPCION=?, ID_MODELO=? WHERE ID_MARCA=?";
    public final static String DELETE_MARCA = "DELETE FROM TBL_MARCA WHERE ID_REPUESTO = ?";
    public final static String ALL_MARCA = "SELECT * FROM TBL_MARCA";
    
    
    /** repuesto x modelo **/
    public final static String INSERT_REPUESTO_X_MODELO = "INSERT INTO TBL_REPUESTO_X_MODELO(ID_REPUESTO, ID_MODELO) VALUES(?,?)";
    public final static String ALL_REPUESTO_X_MODELO_BY_ID_MARCA = "SELECT * FROM TBL_REPUESTO_X_MODELO rm JOIN  TBL_MODELO  md ON rm.ID_MODELO = md.ID_MODELO JOIN TBL_REPUESTO rp ON rp.ID_REPUESTO = rm.ID_REPUESTO WHERE md.ID_MARCA = ?";
    public final static String ALL_REPUESTO_X_MODELO = "SELECT * FROM TBL_REPUESTO_X_MODELO";
    public final static String ALL_REPUESTO_MODELO_BY_IDMODELO_IDREPUESTO = "SELECT * FROM TBL_REPUESTO_X_MODELO rm  WHERE rm.ID_MODELO = ? AND rm.ID_REPUESTO = ?";
    public final static String DELETE_REPUESTO_X_MODELO = "DELETE FROM TBL_REPUESTO_X_MODELO WHERE ID_REPUESTO_X_MODELO = ? ";
    /** Session */
    
    public final static String GET_SESSION = "SELECT *FROM TBL_SESSION WHERE NOMBRE = ?";
}
