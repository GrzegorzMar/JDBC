package reminder;

import javax.swing.*;
import java.util.Scanner;

public class SimpleGuiPopupsDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JOptionPane.showMessageDialog(null, "Ile masz lat?");
        System.out.println("Ile masz lat?");
        int age = scanner.nextInt();
        System.out.println("Masz "+ age + " lat!");

    }
}
