package entities.services;

import entities.Contract;
import entities.Instalment;

import java.time.LocalDate;

public class ContractServices{
    private OnlinePaymentService onlinePaymentService;

    public ContractServices(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int mounth){
        double basicQuota = contract.getTotalValue() / mounth;

        for (int i = 1; i <= mounth ; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstalments().add(new Instalment(dueDate, quota));
        }
    }


}
