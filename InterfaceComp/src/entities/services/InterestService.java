package entities.services;

import java.security.InvalidParameterException;

public interface InterestService {
    double getInterestRate();

    default double paymnet(double amount, int months){
        if(months < 1){
            throw new InvalidParameterException("Months Must bee greater than zero");
        }else{
            return amount * Math.pow(1.0 + getInterestRate() / 100, months);
        }
    }
}
