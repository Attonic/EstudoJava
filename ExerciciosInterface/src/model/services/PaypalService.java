package model.services;

public class PaypalService implements OnlinePaymentService {
    private static final double PAY_FEE_PERCENT = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public Double paymentFee(Double amount){
        return amount * PAY_FEE_PERCENT;
    }
    @Override
    public Double interest(Double amount, Integer mounths){
        return amount * mounths * MONTHLY_INTEREST;
    }


}
