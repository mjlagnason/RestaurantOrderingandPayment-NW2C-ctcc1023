/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/**
 *
 * @author User1
 */
import java.sql.*;


public class QueryProcessor {
        Statement stmt;
    ResultSet rs; //represents the result set of a database query .  refers to the row and column data contained in a ResultSet object
    Connection con;
    ResultSetMetaData metadata;

    
        public QueryProcessor()
    {
        try
        {
            DBConnection.setConnection();
            con = DBConnection.getConnection();
            stmt= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
        }catch(Exception e) {e.printStackTrace();}
    }
        
    public String[][] getAllRecord(String query)
    {
               String row[][]=null;
        try
        {
            rs = stmt.executeQuery(query);
            
            
           if(rs.last())
           {
               metadata=rs.getMetaData();
               row= new String[rs.getRow()][metadata.getColumnCount()];
               rs.first();
               int r=0;
               do
               {
                 for(int col=0;col<metadata.getColumnCount();col++)
                   {
                       row[r][col]=rs.getString(col+1);
                   }
                   r++;
               }while(rs.next());
           }
        }catch(Exception e)
        {
            e.printStackTrace();
            
            
        }
        return row;

    }
    
    public void executeUpdate(String query) {
               try{
	       stmt.executeUpdate(query);
               }
               catch(Exception e)
               {
                   e.printStackTrace();
               }
	   }
    
    	   public String[] getSpecificRow(String query)
	   {
	       String record[]=null;
	       try
	       {
	           rs=stmt.executeQuery(query);
	           if(rs.first())
	           {
	               metadata=rs.getMetaData();
	               record=new String[metadata.getColumnCount()];
	               for(int col=0; col<metadata.getColumnCount(); col++)
	               {
	                   record[col]=rs.getString(col+1);
	               }
	           }

	       }catch(Exception e)
	       {
                   e.printStackTrace();
	    	   javax.swing.JOptionPane.showMessageDialog(null,"ERROR");
	       }
	       return record;
	   }

            public String getSpecificField(String query)
	   {
	       String record=null;
	       try
	       {
	           rs=stmt.executeQuery(query);
	           if(rs.first())
	           {
	               metadata=rs.getMetaData();
	               
	               for(int col=0; col<metadata.getColumnCount(); col++)
	               {
                           
	                   record=rs.getString(col+1);
	               }
	           }

	       }catch(Exception e)
	       {
                   e.printStackTrace();
	    	   javax.swing.JOptionPane.showMessageDialog(null,"ERROR");
	       }
	       return record;
	   }

    void setString(int i, String name1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setInt(int i, int number1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
           
          
           
}
