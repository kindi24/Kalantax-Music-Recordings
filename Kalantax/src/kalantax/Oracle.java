
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalantax;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author Manolis
 */


public class Oracle {
    static String     driverClassName = "oracle.jdbc.OracleDriver" ;
    static String     url = "jdbc:oracle:thin:@192.168.6.21:1521:dblabs" ;
    static Connection dbConnection = null;
    static String     username = "iee2019019";
    static String     passwd = "Kalantax";
    static Statement  statement       = null;
    static ResultSet rs		      = null;
    
    public static Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName (driverClassName);
         dbConnection = DriverManager.getConnection (url, username, passwd);
         return dbConnection;
        
    }
    public static ResultSet songsbyAlbum(String album) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL SONGSBYALBUM(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,album);
      
        cs.executeQuery();
        
        ResultSet rs=(ResultSet) cs.getObject(1);
        return rs;
        
        
        
    }
    public static ResultSet songsbyGenre(String genre) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL SONGSBYGENRE(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,genre);               
        cs.executeQuery();
        ResultSet rs= (ResultSet)cs.getObject(1);
       
        return rs;
    }
    
        public static ResultSet songsbyName(String name) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL SONGSBYNAME(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,name);     
        cs.executeQuery();
        ResultSet rs= (ResultSet)cs.getObject(1);
       
        return rs;
    }
    
    public static ResultSet discoByCities(String city) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL DISCOBYCITIES(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,city);      
        cs.executeQuery();
        ResultSet rs= (ResultSet)cs.getObject(1);
       
        return rs;
    }
    
    public static ResultSet artistsBySB(String sb) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL ARTISTSBYSB(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,sb);
        cs.executeQuery();
        ResultSet rs= (ResultSet)cs.getObject(1);
       
        return rs;
    }
    
    public static ResultSet recordersByNames(String name) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL RECORDERSBYNAMES(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,name);     
        cs.executeQuery();
        ResultSet rs= (ResultSet)cs.getObject(1);
       
        return rs;
    }
      
    public static ResultSet recordingsByDates(String rdate) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL RECORDINGSBYDATES(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,rdate);       
        cs.executeQuery();
        ResultSet rs= (ResultSet)cs.getObject(1);
       
        return rs;
    }
    
    public static ResultSet recordingsByHalls(String hall) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL RECORDINGSBYHALLS(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,hall);
        cs.executeQuery();
        ResultSet rs= (ResultSet)cs.getObject(1);
       
        return rs;
    }
    
    public static ResultSet recordingsByRecorders(String recorder_name) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL RECORDINGSBYRECORDERS(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,recorder_name);       
        cs.executeQuery();
        ResultSet rs= (ResultSet)cs.getObject(1);
       
        return rs;
    }
    
    public static ResultSet recordingsBySongs(String song_name) throws SQLException, ClassNotFoundException{
        
        Connection dbcon =getConnection();
        CallableStatement  cs  = dbcon.prepareCall("{CALL RECORDINGSBYSONGS(?,?)}");
        cs.registerOutParameter(1, OracleTypes.CURSOR);
        cs.setString(2,song_name);       
        cs.executeQuery();
        ResultSet rs= (ResultSet)cs.getObject(1);
       
        return rs;
    }
    
    public static void addArtists(int id,String name,String sb) throws ClassNotFoundException, SQLException{
        
        
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL ADDARTISTS(?,?,?)}");
            cs.setInt(1,id);
            cs.setString(2,name);
            cs.setString(3,sb);
            cs.executeQuery();
            cs.close();
            dbcon.close();
     
        
        
    }
    public static void deleteArtist(int id) throws SQLException, ClassNotFoundException{
        Connection dbcon=getConnection();
        CallableStatement cs=dbcon.prepareCall("{CALL DELETEARTIST(?)}");
        cs.setInt(1, id);
        cs.executeQuery();
        cs.close();
        
    }
    
    public static void addDisco(int id,String name,String city) throws SQLException{
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL ADDDISCO(?,?,?)}");
            cs.setInt(1,id);
            cs.setString(2, name);
            cs.setString(3, city);
            cs.executeQuery();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static void deleteDisco(int id) throws SQLException{
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL DELETEDISCO(?)}");
            cs.setInt(1,id);
            cs.executeQuery();
            cs.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        } 
}

    /**
     *
     * @param id
     * @param name
     * @param phone
     * @param address
     */
    public static void addRecorder(int id,String name,String phone,String address){
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL ADDRECORDER(?,?,?,?)}");
            cs.setInt(1,id);
            cs.setString(2,name);
            cs.setString(3,phone);
            cs.setString(4,address);
            cs.executeQuery();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      }
    
      public static void deleteRecorder(int id) throws SQLException{
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL DELETERECORDER(?)}");
            cs.setInt(1,id);
            cs.executeQuery();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
       
            
          }
      
      
       }
      
      
    public static void addSongs(int id,String name,String album,String genre,int did,int aid) throws SQLException{
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL ADDSONG(?,?,?,?,?,?)}");
            cs.setInt(1,id);
            cs.setString(2, name);
            cs.setString(3, album);
            cs.setString(4, genre);
            cs.setInt(5, did);
            cs.setInt(6,aid);
            cs.executeQuery();
            cs.closeOnCompletion();
            dbcon.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static void  deleteSongs(int id)throws SQLException{
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL DELETESONG(?)}");
            cs.setInt(1,id);
            cs.executeQuery();
            cs.closeOnCompletion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
        public static void addRecordings(int id,int rid,int sid,String rdate,String hall) throws SQLException{
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL ADDRECORDINGS(?,?,?,?,?)}");
            cs.setInt(1,id);
            cs.setInt(2, rid);
            cs.setInt(3, sid);
            cs.setString(4, rdate);
            cs.setString(5, hall);
            cs.executeQuery();
            cs.closeOnCompletion();
            dbcon.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static void  deleteRecordings(int id)throws SQLException{
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL DELETERECORDINGS(?)}");
            cs.setInt(1,id);
            cs.executeQuery();
            cs.closeOnCompletion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
       
        }
        
            
    }
    
    public static ResultSet showlogRecorder(){
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL SHOWLOGRECORDER(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs=(ResultSet)cs.getObject(1);
            return rs;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
            
    }
    
    
     public static ResultSet showlogArtists(){
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL SHOWLOGARTISTS(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs=(ResultSet)cs.getObject(1);
            return rs;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
             
    }
     
    public static ResultSet showlogDisco(){
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL SHOWLOGDISCO(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs=(ResultSet)cs.getObject(1);
            return rs;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
             return null;
        }
            
            
    }
    
    
    public static ResultSet showlogRecordings(){
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL SHOWLOGRECORDINGS(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs=(ResultSet)cs.getObject(1);
            return rs;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
              return null;
        }
          
            
    } 
    
    public static ResultSet showlogSongs(){
        try {
            Connection dbcon=getConnection();
            CallableStatement cs=dbcon.prepareCall("{CALL SHOWLOGSONGS(?)}");
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.executeQuery();
            ResultSet rs=(ResultSet)cs.getObject(1);
            return rs;
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Oracle.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
            
            
    } 
    
    
    
    
}

  
