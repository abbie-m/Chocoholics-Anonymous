// Entry point for ChocAn Java Desktop Application


public class ChocAn {
    public static void main(String[] args) {
        // Start the GUI
        javax.swing.SwingUtilities.invokeLater(() -> {
            new MainMenu();
        });
    }
}

// --- GUI Layer ---


public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("ChocAn Data Center");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Main Menu Buttons
        JButton providerButton = new JButton("Provider Terminal");
        JButton managerButton = new JButton("Manager Terminal");

        providerButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Provider Panel Coming Soon"));
        managerButton.addActionListener(e -> JOptionPane.showMessageDialog(this, "Manager Panel Coming Soon"));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1, 10, 10));
        panel.add(providerButton);
        panel.add(managerButton);

        add(panel);
        setVisible(true);
    }
}

// --- Models Layer ---


public class Member {
    private String name;
    private String memberNumber;
    private String address;
    private String city;
    private String state;
    private String zip;
    private boolean isSuspended;

    public Member(String name, String memberNumber, String address, String city, String state, String zip, boolean isSuspended) {
        this.name = name;
        this.memberNumber = memberNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.isSuspended = isSuspended;
    }

    // Getters and setters omitted for brevity
}



public class Provider {
    private String name;
    private String providerNumber;
    private String address;
    private String city;
    private String state;
    private String zip;

    public Provider(String name, String providerNumber, String address, String city, String state, String zip) {
        this.name = name;
        this.providerNumber = providerNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // Getters and setters omitted for brevity
}



public class Service {
    private String name;
    private String code;
    private double fee;

    public Service(String name, String code, double fee) {
        this.name = name;
        this.code = code;
        this.fee = fee;
    }

    // Getters and setters omitted for brevity
}
