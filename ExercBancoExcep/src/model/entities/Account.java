package model.entities;


import model.exception.BusinessException;

public class Account {
        private Integer number;
        private String holder;
        private Double balance;
        private Double withdrawLimit;

        public Account(){

        }

    public Account(Integer number, String holder, Double balance, Double withdraw) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdraw;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {

            balance += amount;
    }

    public void withdraw(Double amount)throws BusinessException{
        validit(amount);
            balance -= amount;
    }

    private void validit(Double amount) throws BusinessException{
            if (amount > getWithdrawLimit()){
                throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
            }
            if (amount > getBalance()){
                throw new BusinessException("Withdraw error: Not enough balance");
            }
    }
}
