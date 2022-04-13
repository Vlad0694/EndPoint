package com.example.endpointProject;

import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;

@RestController
public class AppController {
    @PostMapping("/insert")
    public void add(@RequestParam Integer id, @RequestParam String nume, @RequestParam String prenume, @RequestParam Long nr_telefon) throws SQLException {
        AppServices service1 = new AppServices();
        service1.addPacienti(id,nume,prenume,nr_telefon);
    }

    @GetMapping("/getPacient")
    public ArrayList<Pacient> getList (@RequestParam Integer id) throws SQLException {
        AppServices service2 = new AppServices();
        return service2.getPacient(id);

    }

}
