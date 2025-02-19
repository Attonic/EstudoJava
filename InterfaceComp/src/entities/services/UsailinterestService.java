package entities.services;

import java.security.InvalidParameterException;

public class BrazilinterestService {
    private double interestRate;

    public BrazilinterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double paymnet(double amount, int months){
        if(months < 1){
        throw new InvalidParameterException("Months Must bee greater than zero");
        }else{
            return amount * Math.pow(1.0 + interestRate / 100, months);
        }
    }
}
