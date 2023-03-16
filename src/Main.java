public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int period = 12;
        int amount = 1_000_000;
        double rate = 9.99;
        int payment = service.calculate(period, amount, rate);
        System.out.println(payment);
        System.out.println(service.calculate(24, amount, rate));
        System.out.println(service.calculate(36, amount, rate));
    }
}