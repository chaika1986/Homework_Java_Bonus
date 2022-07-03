public class Main {
    public static void main(String[] args) {
        int initialAccount = 150_000;
        int payment = 123_567;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        //int bonus = payment > 1000 ? payment / 100 : 0;

        int finalAccount = initialAccount + payment + bonus;
        System.out.println("На счете: " + finalAccount);
        System.out.println("Бонус: " + bonus);
    }
}
