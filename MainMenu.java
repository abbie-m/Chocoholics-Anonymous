import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("ChocAn Data Center");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Main Menu Buttons
        JButton providerButton = new JButton("Provider Terminal");
        // TODO: Clicking this should open the Provider Terminal for service validation, billing, and directory access
        JButton managerButton = new JButton("Manager Terminal");
        // TODO: Clicking this should open the Manager Terminal for reports and data management

        providerButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Provider Panel Coming Soon"));
        // TODO: Prompt for Provider Number, validate, and open provider options
        managerButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Manager Panel Coming Soon"));
        // TODO: Open Manager Panel with options for reports and database updates

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10));
        panel.add(providerButton);
        panel.add(managerButton);

        add(panel);
        setVisible(true);
    }
}
