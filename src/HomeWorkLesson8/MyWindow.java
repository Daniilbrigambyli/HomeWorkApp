package HomeWorkLesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {

    private int count = 0;
    private int numbers;

    Font font = new Font("Arial", Font.BOLD, 32);
    Font fontReset = new Font("Arial", Font.BOLD, 16);

    JButton buttonLeft = new JButton("<");
    JButton buttonRigth = new JButton(">");
    JButton buttonReset = new JButton("Рестарт");

    JLabel counter = new JLabel();

    JTextField step = new JTextField (150);

    public MyWindow() {
        
        window();
        button();
        value();
        textField();
        anonymousClass();

        setVisible(true);

    }

    private void anonymousClass() {
        step.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                numbers = Integer.parseInt(step.getText());
                step.setText(null);
            }
        });

        buttonLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count = count - numbers;
                counter.setText(String.valueOf(count));
            }
        });

        buttonRigth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                count = count + numbers;
                counter.setText(String.valueOf(count));
            }
        });

        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                counter.setText(String.valueOf(count = 0));
            }
        });
    }

    private void textField() {
        add(step, BorderLayout.NORTH);
    }

    private void value() {
        counter.setFont(font);
        counter.setHorizontalAlignment(SwingConstants.CENTER);
        add(counter, BorderLayout.CENTER);
        counter.setText(String.valueOf(count));
    }

    private void button() {
        buttonLeft.setFont(font);
        add(buttonLeft, BorderLayout.LINE_START);
        buttonRigth.setFont(font);
        add(buttonRigth, BorderLayout.LINE_END);
        buttonReset.setFont(fontReset);
        add(buttonReset, BorderLayout.PAGE_END);
    }

    private void window() {
        setTitle("MyWindow");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
    }
}
