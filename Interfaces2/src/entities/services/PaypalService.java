package entities.services;

public class PaypalService implements OnlinePaymentService {
    static  final int

    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int mount) {
        return amount * mount * 0.01;
    }
}
