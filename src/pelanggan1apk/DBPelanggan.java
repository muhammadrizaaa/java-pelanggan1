/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelanggan1apk;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author MSI
 */
public class DBPelanggan {
    private Connection conn;
    private final Koneksi k = new Koneksi();
    public ArrayList<Pelanggan> getPelanggan()throws SQLException{
        ArrayList<Pelanggan> daftar = new ArrayList<>();
        //get the connection u feel me
        conn = k.getConnection();
        //set the query u know what i mean
        String query = "SELECT * FROM pelanggan";
        PreparedStatement ps = conn.prepareStatement(query);
        //this line below 4 executing the query u get me fam
        ResultSet rs = ps.executeQuery();
        //now we put tha shi on the Array List dawg
        while(rs.next()){
            String id = rs.getString("id");
            String nama = rs.getString("nama");
            String jenis = rs.getString("jenis");
            String tahunLahir = rs.getString("tahun_lahir");
            Pelanggan p = new Pelanggan(id,nama,jenis,Integer.parseInt(tahunLahir));
            daftar.add(p);
        }
        rs.close();
        ps.close();
        conn.close();
        return daftar;
    }
    public boolean insertPelanggan(Pelanggan p)throws SQLException{
        conn = k.getConnection();
        String query = "INSERT INTO pelanggan(id, nama, jenis, tahun_lahir) VALUES(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, p.getId());
        ps.setString(2, p.getNama());
        ps.setString(3, p.getJenis());
        ps.setInt(4, p.getTahunLahir());
        int checkRow = ps.executeUpdate();
        ps.close();
        conn.close();
        return checkRow == 1;
    }
    
    public boolean updatePelanggan(Pelanggan p)throws SQLException{
        conn = k.getConnection();
        String query = "UPDATE pelanggan SET nama=?, jenis=?, tahun_lahir=? WHERE id=? ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(4, p.getId());
        ps.setString(1, p.getNama());
        ps.setString(2, p.getJenis());
        ps.setInt(3, p.getTahunLahir());
        int checkRow = ps.executeUpdate();
        ps.close();
        conn.close();
        return checkRow == 1;
    }
        public boolean deletePelanggan(String id)throws SQLException{
        conn = k.getConnection();
        String query = "DELETE FROM pelanggan WHERE id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, id);
        int checkRow = ps.executeUpdate();
        ps.close();
        conn.close();
        return checkRow == 1;
    }
    public ArrayList<Pelanggan> cariPelanggan(String q)throws SQLException{
        ArrayList<Pelanggan> daftar = new ArrayList<>();
        
        conn = k.getConnection();
        String query = "SELECT FROM pelanggan WHERE nama LIKE ?, jenis=?, tahun_lahir=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1,"%"+q+"%");
        ps.setString(2,q);
        ps.setString(3,q);
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            String id = rs.getString("id");
            String nama = rs.getString("nama");
            String jenis = rs.getString("jenis");
            String tahunLahir = rs.getString("tahun_lahir");
            Pelanggan p = new Pelanggan(id, nama, jenis, Integer.parseInt(tahunLahir));
            daftar.add(p);
        }
        ps.close();
        rs.close();
        conn.close();
        return daftar;
    }
}

