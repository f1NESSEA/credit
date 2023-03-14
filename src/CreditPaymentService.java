public class CreditPaymentService {
    public int calculate(int period, int amount, double rate) {
        double monthPercent = rate / 100 / period;
        double coefficient = (monthPercent * (Math.pow(1 + monthPercent, period) / ((Math.pow(1 + monthPercent, period)) - 1)));
        double payment = coefficient * amount;
        return (int) payment;
    }
}
