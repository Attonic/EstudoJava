package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Instalment {
    static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate date;
    private Double amount;

    public Instalment(){

    }

    public Instalment(LocalDate date, Double amount) {
        this.date = date;
        this.amount = amount;

    }

    public LocalDate getDarte() {
        return date;
    }

    public void setDarte(LocalDate darte) {
        this.date = darte;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date.format(fmt) + " _ " + String.format("%.2f", amount);
    }
}
