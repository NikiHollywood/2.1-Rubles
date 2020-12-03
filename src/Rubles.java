public class Rubles {

        public static void main(String[] args) {
            int currentBalance = 100;
            int transactionAmount = 1100;
            int bonus = 0;

            if (transactionAmount > 1000) {
                bonus = transactionAmount / 100;
                currentBalance = currentBalance + bonus + transactionAmount ;
            } else  {
                currentBalance = currentBalance + transactionAmount;
            }

            System.out.println(currentBalance);

        }

}
