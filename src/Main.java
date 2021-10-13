public class Main {
    public static void main(String[] args) {

        CreditPaymentService credit = new CreditPaymentService();
        double loanTerm12months = credit.calculate(1_000_000, 9.99, 12);
        System.out.println(loanTerm12months);

        double loanTerm24months = credit.calculate(1_000_000, 9.99, 24);
        System.out.println(loanTerm24months);

        double loanTerm36months = credit.calculate(1_000_000, 9.99, 36);
        System.out.println(loanTerm36months);
    }
}
