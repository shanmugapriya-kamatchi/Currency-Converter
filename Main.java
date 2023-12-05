import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main extends JFrame implements ActionListener ,ItemListener{
    JFrame f;JTextField t1,t2;JButton b1,b2; JComboBox c1,c2;JLabel l1,l2,l3,l4,l5;
    String s[],from,to;
    double amount;
    Main(){
        s= new String[]{" ", "USD", "INR","EUR","JPY","CNY"};
        f=new JFrame("currency convertor Shanmugapriya Kamatchi");
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("convert");
        b2=new JButton("cancel");
        c1=new JComboBox(s);
        c2=new JComboBox(s);
        l1=new JLabel("Convert this amount");
        l2=new JLabel("From this currency");
        l3=new JLabel("To this currency");
        l4=new JLabel("Result:");
        l5=new JLabel();
        l5.setIcon(new ImageIcon("C:\\Users\\shanm\\Downloads\\im1.png"));
        l5.setBounds(50,50,600,40);
        t1.setBounds(50,150,180,40);
        t2.setBounds(250,250,180,40);
        c1.setBounds(250,150,180,40);
        c2.setBounds(450,150,180,40);
        l1.setBounds(50,110,180,40);
        l2.setBounds(250,110,180,40);
        l3.setBounds(450,110,180,40);
        l4.setBounds(180,250,180,40);
        b1.setBounds(100,350,180,40);
        b2.setBounds(350,350,180,40);
        f.add(t1);f.add(t2);f.add(c1);f.add(c2);f.add(b1);f.add(b2);f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);
        f.setSize(700, 700);
        f.setLayout(null);
        f.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        c1.addItemListener(this);
        c2.addItemListener(this);
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

    }
        void converting(String from,String to,double amount) {
            if(from.equals("INR")) {
                switch (to) {
                    case "INR":
                        t2.setText(String.valueOf(amount*1));
                        break;
                    case "USD":
                        t2.setText(String.valueOf(amount*0.012018474));
                        break;
                    case "EUR":
                        t2.setText(String.valueOf(amount*0.011271811));
                        break;
                    case "JPY":
                        t2.setText(String.valueOf(amount*1.7745118));
                        break;
                    case "CNY":
                        t2.setText(String.valueOf(amount*0.087609527));
                        break;
                }
            }
            if(from.equals("USD")) {
                switch (to) {
                    case "INR":
                        t2.setText(String.valueOf(amount*83.204427));
                        break;
                    case "USD":
                        t2.setText(String.valueOf(amount*1));
                        break;
                    case "EUR":
                        t2.setText(String.valueOf(amount*0.93804893));
                        break;
                    case "JPY":
                        t2.setText(String.valueOf(amount*147.6582));
                        break;
                    case "CNY":
                        t2.setText(String.valueOf(amount*7.2905606));
                        break;
                }
            }
            if(from.equals("EUR")) {
                switch (to) {
                    case "INR":
                        t2.setText(String.valueOf(amount*88.710055));
                        break;
                    case "USD":
                        t2.setText(String.valueOf(amount*1.0660237));
                        break;
                    case "EUR":
                        t2.setText(String.valueOf(amount*1));
                        break;
                    case "JPY":
                        t2.setText(String.valueOf(amount*157.42145));
                        break;
                    case "CNY":
                        t2.setText(String.valueOf(amount*7.7714603));
                        break;
                }
            }
            if(from.equals("JPY")) {
                switch (to) {
                    case "INR":
                        t2.setText(String.valueOf(amount*0.56351195));
                        break;
                    case "USD":
                        t2.setText(String.valueOf(amount*0.0067710352));
                        break;
                    case "EUR":
                        t2.setText(String.valueOf(amount*0.006351714));
                        break;
                    case "JPY":
                        t2.setText(String.valueOf(amount*1));
                        break;
                    case "CNY":
                        t2.setText(String.valueOf(amount*0.049368232));
                        break;
                }
            }
            if(from.equals("CNY")) {
                switch (to) {
                    case "INR":
                        t2.setText(String.valueOf(amount*11.413762));
                        break;
                    case "USD":
                        t2.setText(String.valueOf(amount*0.13715303));
                        break;
                    case "EUR":
                        t2.setText(String.valueOf(amount*0.12865013));
                        break;
                    case "JPY":
                        t2.setText(String.valueOf(amount*20.257374));
                        break;
                    case "CNY":
                        t2.setText(String.valueOf(amount*1));
                        break;
                }
            }
        }
    public static void main(String[] args) {
        Main main = new Main();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        amount= Double.parseDouble(t1.getText());
        if(e.getSource()==b1){
            converting(from,to,amount);
        }
        if(e.getSource()==b2){
            f.dispose();
        }
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1)
            from=(String)c1.getSelectedItem();
        if (e.getSource() == c2)
            to = (String) c2.getSelectedItem();
    }
}
