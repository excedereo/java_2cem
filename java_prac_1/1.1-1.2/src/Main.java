import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        final double ROUBLES_PER_YUAN = 11.91;
        Scanner reader = new Scanner(System.in);
        int yuan = reader.nextInt();
        reader.close();
        double roubles = yuan * ROUBLES_PER_YUAN;
        double digit = yuan % 10;
        if ((10 < yuan ) && (yuan < 15)) {
            System.out.println("CNY: " + yuan + " китайских юаней");
        } else if (digit == 1) {
            System.out.println("CNY: " + yuan + " китайский юань");
        } else if ((1 < digit ) && (digit < 5) ) {
            System.out.println("CNY: " + yuan + " китайских юаня");
        } else {
            System.out.println("CNY: " + yuan + " китайских юаней");
        }
        roubles = Math.floor(roubles*100)/100;
        System.out.println("RUB: "+ roubles);
    }
}
