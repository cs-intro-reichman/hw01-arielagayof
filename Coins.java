public class Coins {
    public static void main(String[] args) {
        int totalCents = Integer.parseInt(args[0]);
        int quarters = totalCents/25;
        int cents = totalCents%25;
        System.out.println("Use " + quarters + " quarters and " + cents + " cents");

    }
}