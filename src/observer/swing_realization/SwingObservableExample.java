package observer.swing_realization;

import javax.swing.*;

public class SwingObservableExample {
    private JFrame jFrame;

    public static void main(String[] args) {
        SwingObservableExample example = new SwingObservableExample();
        example.go();
    }

    private void go() {
        jFrame = new JFrame();

        JButton button = new JButton("Should i do it?");
        button.addActionListener(event -> System.out.println("Don`t do in, you might regret it!"));
        button.addActionListener(event -> System.out.println("C`mon, do it!"));
    }

}
