import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
    private JPanel pnlOps;
    private JButton btnBorrar;
    int n1,  n2;

    public Principal() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(!txtNumS2.getText().equals("") && !txtNumS1.getText().equals(""))  {
                     n1 = Integer.parseInt(txtNumS1.getText());
                     n2 = Integer.parseInt(txtNumS2.getText());
                    //txtRS.setText(Integer.toString(n1 + n2));
                    JOptionPane.showMessageDialog(null,n1+n2,"Suma",JOptionPane.PLAIN_MESSAGE);
                    n1 = 0;
                    n2 = 0;
                    //
                }
                else{
                    JOptionPane.showMessageDialog(null, "Falta otro número para hacer la operación","Error Suma",JOptionPane.PLAIN_MESSAGE);
                }

                if(!txtNumR2.getText().equals("") && !txtNumR1.getText().equals("")) {
                    n1 = Integer.parseInt(txtNumR1.getText());
                    n2 = Integer.parseInt(txtNumR2.getText());
                    JOptionPane.showMessageDialog(null,n1-n2,"Resta",JOptionPane.PLAIN_MESSAGE);
                    n1 = 0;
                    n2 = 0;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Falta otro número para hacer la operación","Error en Resta",JOptionPane.PLAIN_MESSAGE);
                }
                if(!txtNumM2.getText().equals("") && !txtNumM1.getText().equals("")) {
                    n1 = Integer.parseInt(txtNumM1.getText());
                    n2 = Integer.parseInt(txtNumM2.getText());
                    JOptionPane.showMessageDialog(null,n1*n2,"Multiplicación",JOptionPane.PLAIN_MESSAGE);
                    n1 = 0;
                    n2 = 0;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Falta otro número para hacer la operación","Error en Multiplicación",JOptionPane.PLAIN_MESSAGE);
                }
                if(!txtNumD2.getText().equals("") && !txtNumD1.getText().equals("")) {
                    double n3;
                    double n4;
                    n3 = Double.parseDouble(txtNumD1.getText());
                    n4 = Double.parseDouble(txtNumD2.getText());

                    JOptionPane.showMessageDialog(null,n3/n4,"División",JOptionPane.PLAIN_MESSAGE);

                    n3 = 0;
                    n4 = 0;
                }
                else {
                    JOptionPane.showMessageDialog(null, "Falta otro número para hacer la operación","Error en División",JOptionPane.PLAIN_MESSAGE);
                }
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumS1.setText("");
                txtNumS2.setText("");
                txtNumR1.setText("");
                txtNumR2.setText("");
                txtNumM1.setText("");
                txtNumM2.setText("");
                txtNumD1.setText("");
                txtNumD2.setText("");
            }
        });
    }

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
