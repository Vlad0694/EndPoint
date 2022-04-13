package com.example.endpointProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.*;
import java.util.ArrayList;

public class AppServices {


    public void addPacienti(Integer id, String nume, String prenume, Long nr_telefon) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BazaDate", "root", "parola06");
        PreparedStatement insertPacienti = con.prepareStatement("insert into Pacienti values (?,?,?,?)");
        insertPacienti.setInt(1,id);
        insertPacienti.setString(2,nume);
        insertPacienti.setString(3,prenume);
        insertPacienti.setLong(4,nr_telefon);
        insertPacienti.executeUpdate();
    }


    public ArrayList<Pacient> getPacient(Integer id) throws SQLException{
        ArrayList<Pacient> listaPacienti = new ArrayList<>();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BazaDate", "root", "parola06");
        PreparedStatement getPacient = con.prepareStatement("select * from Pacienti where Id_pacient = ?");
        getPacient.setInt(1,id);
        ResultSet rs = getPacient.executeQuery();
        while(rs.next()){
            Pacient pacient = new Pacient();
            int id_pacient = rs.getInt("Id_pacient");
            String nume = rs.getString("Nume");
            String prenume = rs.getString("Prenume");
            long nr_telefon = rs.getLong("Nr_telefon");
            pacient.setId(id_pacient);
            pacient.setNume(nume);
            pacient.setPrenume(prenume);
            pacient.setNr_telefon(nr_telefon);
            listaPacienti.add(pacient);

        }
        return listaPacienti;
    }

}
