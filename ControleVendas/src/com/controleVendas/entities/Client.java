package com.controleVendas.entities;

import com.controleVendas.utils.AbstractRegister;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Client extends AbstractRegister {
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDateTime birthDate;


    public Client(String name, Integer id, LocalDateTime birthDate) {
        super(name, id);
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + getName() + '\'' +
                ", code=" + getId() +
                ", birthDate=" + (birthDate != null  ? dtf.format(birthDate) : "Sem data")  +
                '}';
    }
}
