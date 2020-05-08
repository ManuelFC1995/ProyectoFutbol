/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author manue
 */
public class ConnectionInfo {
    private String Host;
    private String DataBase;
    private String User;
    private String password;

    public ConnectionInfo(String Host, String DataBase, String User, String password) {
        this.Host = Host;
        this.DataBase = DataBase;
        this.User = User;
        this.password = password;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getDataBase() {
        return DataBase;
    }

    public void setDataBase(String DataBase) {
        this.DataBase = DataBase;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ConnectionInfo{" + "Host=" + Host + ", DataBase=" + DataBase + ", User=" + User + ", password=" + password + '}';
    }
    
    
}
