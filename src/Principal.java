import javax.swing.*;

public class Principal {
    private JTextField txtNumR2;
    private JTextField txtNumR1;
    private JTextField txtNumM1;
    private JTextField txtNumM2;
    private JTextField txtNumD1;
    private JTextField txtNumD2;
    private JTextField txtNumS1;
    private JTextField txtNumS2;
    private JButton btnCalcular;
    private JTextField txtRS;
    private JTextField txtRR;
    private JTextField txtRM;
    private JPanel pnlOps;
    private JTextField txtRD;


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Operaciones");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(true);
        ventana.setSize(800,600);
        ventana.setLocationRelativeTo(null);
        ventana.setContentPane(new Principal().pnlOps);

        ventana.pack();
        ventana.setVisible(true);




    }
}
