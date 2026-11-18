
public class ProductApp {
    
}


public class ProductApp extends JFrame {

   
    private JTextField txtCustomerName;
    private JComboBox<String> cmbProduct;
    private JTextField txtPrice;
    private JButton btnProcess;

    public ProductApp() {
        setTitle("Product App");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        
        JMenuBar menuBar = new JMenuBar();
        JMenu mnuFile = new JMenu("File");
        JMenuItem mnuExit = new JMenuItem("Exit");
        mnuExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        mnuFile.add(mnuExit);
        menuBar.add(mnuFile);
        menuBar.add(new JMenu("Edit"));
        setJMenuBar(menuBar);

 
        add(new JLabel("Customer Name:"));
        txtCustomerName = new JTextField("Joe Bloggs");
        add(txtCustomerName);

        add(new JLabel("Select Product:"));
      
        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };
        cmbProduct = new JComboBox<>(products);
        add(cmbProduct);

        add(new JLabel("Enter Price:"));
        txtPrice = new JTextField("3500");
        add(txtPrice);

        add(new JLabel("")); // empty space
        btnProcess = new JButton("PROCESS");
        add(btnProcess);

   
        btnProcess.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                processSale();
            }
        });
    }

    private void processSale() {
        try {
            // 1. Get data from form
            String customer = txtCustomerName.getText();
            String product = (String) cmbProduct.getSelectedItem();
            double price = Double.parseDouble(txtPrice.getText());

            // 2. Q2.1 - Calculations
            double vat = price * 0.15;        // VAT: 15% of product price
            double commission = price * 0.05; // Commission: 5% of product price
            double total = price + vat + commission; // Total = Price + VAT + Commission

            // 3. Show popup - exactly like screenshot
            String message = "Customer Name: " + customer + "\n"
                    + "Product: " + product + "\n"
                    + "VAT: R " + vat + "\n"
                    + "COMMISSION: R " + commission + "\n"
                    + "TOTAL: R " + total;
            JOptionPane.showMessageDialog(null, message);

            // 4. Q2.3 - Save to data.txt
            FileWriter fw = new FileWriter("data.txt");
            PrintWriter pw = new PrintWriter(fw);

            pw.println("DATA LOG");
            pw.println("***************************");
            pw.println("Customer Name: " + customer);
            pw.println("Product: " + product);
            pw.println("VAT: R " + vat);
            pw.println("COMMISSION: R " + commission);
            pw.println("TOTAL: R " + total);
            pw.println("***************************");

            pw.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid price! Error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        ProductApp app = new ProductApp();
        app.setVisible(true);
    
