import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class NPrNCROptions {
    // List to store past calculations
    private static final ArrayList<String> calculations = new ArrayList<>();

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the main frame
            JFrame frame = new JFrame("nPr & nCr Calculator");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(700, 500);

            // Set layout
            frame.setLayout(new BorderLayout());

            // Create input panel
            JPanel inputPanel = new JPanel(new GridLayout(5, 2, 10, 10));
            JLabel nLabel = new JLabel("Enter n:");
            JTextField nField = new JTextField();
            JLabel rLabel = new JLabel("Enter r:");
            JTextField rField = new JTextField();
            JLabel n2Label = new JLabel("Enter n2:");
            JTextField n2Field = new JTextField();
            JLabel r2Label = new JLabel("Enter r2:");
            JTextField r2Field = new JTextField();

            // Buttons for selection
            JButton nPrButton = new JButton("Calculate nPr");
            JButton nCrButton = new JButton("Calculate nCr");
            JButton multiplyNPrButton = new JButton("Multiply nPr");
            JButton multiplyNCrButton = new JButton("Multiply nCr");

            inputPanel.add(nLabel);
            inputPanel.add(nField);
            inputPanel.add(rLabel);
            inputPanel.add(rField);
            inputPanel.add(n2Label);
            inputPanel.add(n2Field);
            inputPanel.add(r2Label);
            inputPanel.add(r2Field);
            inputPanel.add(nPrButton);
            inputPanel.add(nCrButton);

            // Create output panel
            JTextArea resultArea = new JTextArea(10, 30);
            resultArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(resultArea);

            // Button panel for additional options
            JPanel buttonPanel = new JPanel(new GridLayout(1, 4, 10, 10));
            JButton showHistoryButton = new JButton("Show History");
            JButton clearHistoryButton = new JButton("Clear History");
            buttonPanel.add(multiplyNPrButton);
            buttonPanel.add(multiplyNCrButton);
            buttonPanel.add(showHistoryButton);
            buttonPanel.add(clearHistoryButton);

            // Add panels to frame
            frame.add(inputPanel, BorderLayout.NORTH);
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(buttonPanel, BorderLayout.SOUTH);

            // Add action listeners
            nPrButton.addActionListener(e -> {
                try {
                    int n = Integer.parseInt(nField.getText());
                    int r = Integer.parseInt(rField.getText());
                    if (n >= r && n >= 0 && r >= 0) {
                        long result = factorial(n) / factorial(n - r);
                        String calculation = "nPr (" + n + ", " + r + ") = " + result;
                        resultArea.setText(calculation);
                        calculations.add(calculation);
                    } else {
                        resultArea.setText("Invalid input: Ensure n >= r and both are non-negative.");
                    }
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input: Enter integers for n and r.");
                }
            });

            nCrButton.addActionListener(e -> {
                try {
                    int n = Integer.parseInt(nField.getText());
                    int r = Integer.parseInt(rField.getText());
                    if (n >= r && n >= 0 && r >= 0) {
                        long result = factorial(n) / (factorial(r) * factorial(n - r));
                        String calculation = "nCr (" + n + ", " + r + ") = " + result;
                        resultArea.setText(calculation);
                        calculations.add(calculation);
                    } else {
                        resultArea.setText("Invalid input: Ensure n >= r and both are non-negative.");
                    }
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input: Enter integers for n and r.");
                }
            });

            multiplyNPrButton.addActionListener(e -> {
                try {
                    int n1 = Integer.parseInt(nField.getText());
                    int r1 = Integer.parseInt(rField.getText());
                    int n2 = Integer.parseInt(n2Field.getText());
                    int r2 = Integer.parseInt(r2Field.getText());
                    if (n1 >= r1 && n2 >= r2 && n1 >= 0 && r1 >= 0 && n2 >= 0 && r2 >= 0) {
                        long nPr1 = factorial(n1) / factorial(n1 - r1);
                        long nPr2 = factorial(n2) / factorial(n2 - r2);
                        long result = nPr1 * nPr2;
                        String calculation = "Multiply nPr (" + n1 + ", " + r1 + ") * nPr (" + n2 + ", " + r2 + ") = " + result;
                        resultArea.setText(calculation);
                        calculations.add(calculation);
                    } else {
                        resultArea.setText("Invalid input: Ensure n >= r and both are non-negative.");
                    }
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input: Enter integers for n and r.");
                }
            });

            multiplyNCrButton.addActionListener(e -> {
                try {
                    int n1 = Integer.parseInt(nField.getText());
                    int r1 = Integer.parseInt(rField.getText());
                    int n2 = Integer.parseInt(n2Field.getText());
                    int r2 = Integer.parseInt(r2Field.getText());
                    if (n1 >= r1 && n2 >= r2 && n1 >= 0 && r1 >= 0 && n2 >= 0 && r2 >= 0) {
                        long nCr1 = factorial(n1) / (factorial(r1) * factorial(n1 - r1));
                        long nCr2 = factorial(n2) / (factorial(r2) * factorial(n2 - r2));
                        long result = nCr1 * nCr2;
                        String calculation = "Multiply nCr (" + n1 + ", " + r1 + ") * nCr (" + n2 + ", " + r2 + ") = " + result;
                        resultArea.setText(calculation);
                        calculations.add(calculation);
                    } else {
                        resultArea.setText("Invalid input: Ensure n >= r and both are non-negative.");
                    }
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input: Enter integers for n and r.");
                }
            });

            showHistoryButton.addActionListener(e -> {
                if (calculations.isEmpty()) {
                    resultArea.setText("No history to show.");
                } else {
                    StringBuilder history = new StringBuilder("Calculation History:\n");
                    for (String calc : calculations) {
                        history.append(calc).append("\n");
                    }
                    resultArea.setText(history.toString());
                }
            });

            clearHistoryButton.addActionListener(e -> {
                calculations.clear();
                resultArea.setText("Calculation history cleared.");
            });

            // Display frame
            frame.setVisible(true);
        });
    }

    // Helper method for factorial
    private static long factorial(int num) {
        long result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}