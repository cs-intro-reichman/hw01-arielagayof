public class Gen3 {
    public static void main(String[] args) {
        int boundary1 = Integer.parseInt(args[0]);
        int boundary2 = Integer.parseInt(args[1]);
        int num1 = (int)(Math.random() * (boundary1 - boundary2) + boundary2);
        int num2 = (int)(Math.random() * (boundary1 - boundary2) + boundary2);
        int num3 = (int)(Math.random() * (boundary1 - boundary2) + boundary2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println("the minimal generated number was " + Math.min(num1, Math.min(num2, num3)));
    }
}