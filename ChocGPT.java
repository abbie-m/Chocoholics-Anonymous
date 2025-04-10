// Entry point for ChocAn Java Desktop Application


public class ChocGPT {
    public static void main(String[] args) {
        // Start the GUI
        javax.swing.SwingUtilities.invokeLater(() -> {
            new MainMenu();
        // TODO: Launch the main GUI interface with options for providers and managers
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
    
public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getMemberNumber() {
    return memberNumber;
}

public void setMemberNumber(String memberNumber) {
    this.memberNumber = memberNumber;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

public String getState() {
    return state;
}

public void setState(String state) {
    this.state = state;
}

public String getZip() {
    return zip;
}

public void setZip(String zip) {
    this.zip = zip;
}

public boolean isSuspended() {
    return isSuspended;
}

public void setSuspended(boolean suspended) {
    isSuspended = suspended;
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