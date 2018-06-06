import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.text.NumberFormat;
import javax.swing.text.*;
class payInfo extends JFrame
{
    private JLabel label,labeltype,labelnetwork,labelnumber,labelexp,labelcvv,labelslash;
    private JLabel[] labelerror = new JLabel[3];
    private JButton button;
    private JLabel[] emptylabel = new JLabel[12];
    private JFormattedTextField textfieldmonth,textfieldyear,textfieldnumber;
    private JPasswordField fieldcvv;
    public JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7;
    private JComboBox typelist,networklist;
    public String[] types = {"Credit Card","Debit Card"};
    public String[] networks = {"VISA","MasterCard"};
    public int m,y,mm,yy,number,cvv,check1,check2,check3;
    public payInfo(){
        Calendar cl=Calendar.getInstance();
        yy=cl.get(Calendar.YEAR);
        mm=cl.get(Calendar.MONTH);

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        NumberFormat format = NumberFormat.getInstance();
        format.setGroupingUsed(false);

        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Long.class);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);

        panel1 = new JPanel();
        label = new JLabel("PAYMENT GATEWAY");
        panel1.add(label);
        panel1.setVisible(true);
        add(panel1);

        panel2 = new JPanel();
        labeltype = new JLabel("Enter Card Type:");
        panel2.add(labeltype);
        typelist = new JComboBox(types);
        panel2.add(typelist);
        panel2.setVisible(true);
        add(panel2);

        panel3 = new JPanel();
        labelnetwork = new JLabel("Enter Payment Network:");
        panel3.add(labelnetwork);
        networklist = new JComboBox(networks);
        panel3.add(networklist);
        panel3.setVisible(true);
        add(panel3);

        panel4 = new JPanel();
        labelnumber = new JLabel("Enter Card Number (16-digits only):");
        panel4.add(labelnumber);
        textfieldnumber = new JFormattedTextField(formatter);
        textfieldnumber.setColumns(16);
        panel4.add(textfieldnumber);
        labelerror[0] = new JLabel();
        panel4.add(labelerror[0]);
        panel4.setVisible(true);
        add(panel4);

        panel5 = new JPanel();
        labelexp = new JLabel("Enter Card Expiry (mm/yyyy):");
        panel5.add(labelexp);
        textfieldmonth = new JFormattedTextField(formatter);
        textfieldmonth.setColumns(2);
        panel5.add(textfieldmonth);
        labelslash = new JLabel("/");
        panel5.add(labelslash);
        textfieldyear = new JFormattedTextField(formatter);
        textfieldyear.setColumns(4);
        panel5.add(textfieldyear);
        labelerror[1] = new JLabel();
        panel5.add(labelerror[1]);
        panel5.setVisible(true);
        add(panel5);

        panel6 = new JPanel();
        labelcvv = new JLabel("Enter CVV Number");
        panel6.add(labelcvv);
        fieldcvv = new JPasswordField(3);
        panel6.add(fieldcvv);
        labelerror[2] = new JLabel();
        panel6.add(labelerror[2]);
        panel6.setVisible(true);
        add(panel6);

        panel7 = new JPanel();
        button = new JButton("Continue");
        button.addMouseListener(new eventclick());
        panel7.add(button);
        panel7.setVisible(true);
        add(panel7);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);            
        setSize(600,300);
        setVisible(true);
    }

    public class eventclick implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            if(textfieldnumber.getText().length()!=16){
                labelerror[0].setText("Please Enter A 16-digit Number Only");check1=0;
            } else{
                labelerror[0].setText("");check1=1;
            }

            if(fieldcvv.getText().length()!=3){
                labelerror[2].setText("Please Enter A 3-digit Number Only");check2=0;
            } else{
                labelerror[2].setText("");check2=1;
            }
            m = Integer.parseInt(textfieldmonth.getText());
            y = Integer.parseInt(textfieldyear.getText());
            if(m<1||m>12||(m<mm&&y==yy)||y<yy||(y>yy+10)||(textfieldyear.getText().length()!=4)||(textfieldmonth.getText().length()==0)){
                labelerror[1].setText("Please Enter correct date");check3=0;
            } else{
                labelerror[1].setText("");check3=1;
	        dispose();
            }
            if(check1==1&&check2==1&&check3==1){                
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(false);
                panel4.setVisible(false);
                panel5.setVisible(false);
                panel6.setVisible(false);
                panel7.setVisible(false);
                new finalScreen();
            }
        } 

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
}
