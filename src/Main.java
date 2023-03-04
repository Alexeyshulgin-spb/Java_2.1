public class Main {
    public static void main(String[] args) {

        int balancePhone = 100;
        int enteredCash = 999;
        int bonusForBalance = 0;
        int endedBalance = 0;

        if (enteredCash >= 1000) {
            bonusForBalance = enteredCash / 100;
            endedBalance = balancePhone+enteredCash+bonusForBalance;
        } else  {
            endedBalance =  balancePhone+enteredCash;
        }
        System.out.println(endedBalance);

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}
