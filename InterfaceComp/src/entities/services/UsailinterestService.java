package entities.services;

import java.security.InvalidParameterException;

public class UsailinterestService implements InterestService {
    private double interestRate;

    public UsailinterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }


}
