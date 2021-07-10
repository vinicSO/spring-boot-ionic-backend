package com.coursespring.cursomc;

import com.coursespring.cursomc.domain.*;
import com.coursespring.cursomc.enums.EstadoPagamento;
import com.coursespring.cursomc.enums.TipoCliente;
import com.coursespring.cursomc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CursomcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception { }
}
