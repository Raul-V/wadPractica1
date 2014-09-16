/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.escom.wad.prac1.jdbc.imp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Raul
 */
public class JDBCConexionImp implements com.escom.wad.prac1.jdbc.JDBCConexion
{
    @Override
    /**
     * Obtiene la conexion para manejar la base de datos
     */
    public Connection getConnection()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql//"+SERVER+"/"+DATABASE,USER,PASSWORD);
            return con;
        }catch(ClassNotFoundException cnfe)
        {
            System.err.println("Ocurrio un error, no se encuentra la clase com.mysql.jdbc.Driver");
            System.err.println(cnfe.getMessage());
            return null;
        }
        catch(SQLException sqle)
        {
            System.err.println("Ocurrio un error tipo SQL, al obtener la conexión");
            System.err.println(sqle.getMessage());
            return null;
        }
    }
}
