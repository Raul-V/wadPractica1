/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.escom.wad.prac1.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Raul
 */
public interface JDBCConexion 
{
    public final String DATABASE="pract1";
    public final String USER="root";
    public final String PASSWORD="root";
    public final String SERVER="localhost";
    
    public Connection getConnection();
}
