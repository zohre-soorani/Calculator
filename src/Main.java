import javax.swing.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                calculator.MainPage mainPage = new calculator.MainPage();
                mainPage.setVisible(true);
            }
        });
    }

}