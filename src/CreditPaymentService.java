public class CreditPaymentService {

    public double calculate (int loanAmount, double interestRate, int loanTerm) { //сумма кредита, годовая % ставка, срок кредита в мес.
        double monthlyInterestRate = interestRate / (100 * 12); //ПС
        double formula1 = 1 + monthlyInterestRate; //1+ПС
        double y = Math.pow(formula1, -loanTerm); //возвели в степень
        double denominator = 1 - y;
        double MonthlyPayment = (loanAmount * monthlyInterestRate) / denominator; //ежемесячный платеж

        return MonthlyPayment;
    }
}
