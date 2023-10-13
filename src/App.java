import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {
        // Membuat frame
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Membuat label
        JLabel label1, label2, label3;
        label1 = new JLabel("Username");
        label1.setBounds(20, 20, 80, 25);
        frame.add(label1);

        label2 = new JLabel("Password");
        label2.setBounds(20, 50, 80, 25);
        frame.add(label2);

        label3 = new JLabel("");
        label3.setBounds(20, 110, 250, 25);
        frame.add(label3);

        // Membuat text field
        JTextField user = new JTextField(20);
        user.setBounds(100, 20, 165, 25);
        frame.add(user);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(100, 50, 165, 25);
        frame.add(pass);

        // Membuat checkbox
        JCheckBox tampilpass = new JCheckBox("Tampilkan Password");
        tampilpass.setBounds(20, 80, 200, 25);
        frame.add(tampilpass);

        tampilpass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (tampilpass.isSelected()) {
                    pass.setEchoChar((char) 0);
                } else {
                    pass.setEchoChar('\u25cf');
                }
            }
        });

        // Membuat button
        JButton masuk = new JButton("Masuk");
        masuk.setBounds(20, 110, 80, 25);
        frame.add(masuk);

        JButton keluar = new JButton("Keluar");
        keluar.setBounds(100, 110, 80, 25);
        frame.add(keluar);

        // Menampilkan frame
        frame.setVisible(true);
    }
}
