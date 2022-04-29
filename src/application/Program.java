package application;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		
		Random random = new Random();
		int numero = random.nextInt(13);
        for (int i = 0; i < numero; i++) {

            if (i % 2 == 0) {

                System.out.println(i+2);

            }
        }

}
}
