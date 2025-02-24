package entities.services;

import java.security.InvalidParameterException;

public class BrazilinterestService implements InterestService {
    private double interestRate;

    public BrazilinterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }


}
