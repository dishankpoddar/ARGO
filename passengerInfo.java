import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class passengerInfo extends JFrame{
    private JLabel labelprice,labelnp,labelname,labelage,labelgender,labelerror,labelerror2,labelerror3,labelerror4;
    private JButton button, button2, back1;
    private JLabel[] emptylabel = new JLabel[2];
    private JTextField[] textname = new JTextField[5];
    private JTextField[] textage = new JTextField[5];
    public JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7;
    private JComboBox numberlist;
    private JComboBox[] genderlist = new JComboBox[5];
    public static int n,k,check=0,check2=0,tprice;
    public static int[] age = new int[5];
    public static String[] name = new String[5];
    public static String[] gender = new String[5];
    private String[] numbers = {"1","2","3","4","5"};
    private String[] genders = {"","Male","Female"};
    private String textprice;
    boolean check3;
    public passengerInfo(){};
    public passengerInfo(int price,boolean state) {
        n = 1;
        check3 = false;
        gender = new String[]{"","","","",""};
        name = new String[]{"","","","",""};

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
        
        tprice=price;

        textprice = "Price of one ticket: "+(price/1000)+","+(price%1000);
        panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
        labelprice = new JLabel(textprice);
        labelprice.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel1.add(labelprice);
        emptylabel[0] = new JLabel(" ");
        emptylabel[0].setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel1.add(emptylabel[0]);
        panel1.setVisible(true);
        add(panel1);

        panel2 = new JPanel();
        labelnp = new JLabel("Enter number of passengers: ");
        panel2.add(labelnp);
        numberlist = new JComboBox(numbers);
        panel2.add(numberlist);
        numbercheck en = new numbercheck();
        numberlist.addActionListener(en);
        panel2.setVisible(true);
        add(panel2);

        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
        button = new JButton("Continue");
        button.setAlignmentX(JButton.CENTER_ALIGNMENT);
        eventclick1 e1 = new eventclick1();
        button.addMouseListener(e1);
        panel3.add(button);
        emptylabel[1] = new JLabel(" ");
        emptylabel[1].setAlignmentX(JLabel.CENTER_ALIGNMENT);
        emptylabel[1].setAlignmentY(JLabel.TOP_ALIGNMENT);
        panel3.add(emptylabel[1]);
        panel3.setVisible(true);
        add(panel3);

        for(int i = 0;i<5;i++) {
            textname[i] = new JTextField(14);
            textage[i] = new JTextField(3);
            genderlist[i] = new JComboBox(genders);
            genderlist[i].putClientProperty("index", i);
            genderlist[i].addActionListener(new genderlistcheck());
        }
        panel4 = new JPanel();
        panel4.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        labelname = new JLabel("Name");
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        panel4.add(labelname,gbc);
        labelage = new JLabel("Age");
        gbc.gridx = 2; gbc.gridy = 0; gbc.gridwidth = 1;
        panel4.add(labelage,gbc);
        labelgender = new JLabel("Gender");
        gbc.gridx = 3; gbc.gridy = 0; gbc.gridwidth = 1;
        panel4.add(labelgender,gbc);
        panel4.setVisible(false);
        add(panel4);

        panel7 = new JPanel();
        panel7.setLayout(new BoxLayout(panel7,BoxLayout.Y_AXIS));
        labelerror = new JLabel();
        labelerror.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel7.add(labelerror);
        labelerror3 = new JLabel();
        labelerror3.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel7.add(labelerror3);
        labelerror4 = new JLabel();
        labelerror4.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel7.add(labelerror4);
        labelerror2 = new JLabel();
        labelerror2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel7.add(labelerror2);
        panel7.setVisible(true);
        add(panel7);

        panel5 = new JPanel();
        button2 = new JButton("Continue");
        eventclick2 e2 = new eventclick2();
        button2.addMouseListener(e2);
        panel5.add(button2);
        panel5.setVisible(false);
        add(panel5);

        panel6 = new JPanel();
        back1 = new JButton("Back");
        panel6.add(back1);
        eventback1 eb1 = new eventback1();
        back1.addMouseListener(eb1);
        panel6.setVisible(true);
        add(panel6);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300,350);
        setVisible(state);
    }

    public class eventclick1 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            panel4.setVisible(false);
            panel5.setVisible(false);
            for(int i = 0;i<n;i++) {
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridx = 0; gbc.gridy = i+1; gbc.gridwidth = 2;
                panel4.add(textname[i],gbc);
                gbc.gridx = 2; gbc.gridy = i+1; gbc.gridwidth = 1;
                panel4.add(textage[i],gbc);
                gbc.gridx = 3; gbc.gridy = i+1; gbc.gridwidth = 1;
                panel4.add(genderlist[i],gbc);
            }
            for(int i = n;i<5;i++) {
                panel4.remove(textname[i]);
                panel4.remove(textage[i]);
                panel4.remove(genderlist[i]);
            }
            panel4.setVisible(true);
            panel5.setVisible(true);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventclick2 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            try{check2=0;
                for(int i = 0;i<n;i++) {
                    int x;
                    name[i] = textname[i].getText();
                    if(name[i].equals("")){
                        labelerror4.setText("Please enter name");x = 1/0;}
                    age[i] = Integer.parseInt(textage[i].getText());
                    if(age[i]>=18 )
                        check2++;
                    if(check2==0 && i==n-1){
                        labelerror3.setText("Atleast one adult is required");x = 1/0;}
                    if(gender[i]==""){
                        labelerror2.setText("Please enter gender");x = 1/0;}
                    check=0;
                    check3=false;
                }
            } catch(NumberFormatException e1){labelerror.setText("Please enter age correctly(number only)"); check=1;}
            catch(ArithmeticException e2){ check=1;}
            if(check==0){
                /*panel5.remove(button2); panel1.setVisible(false); panel2.setVisible(false); panel3.setVisible(false); panel4.setVisible(false); 
                panel5.setVisible(false); panel6.setVisible(false); panel7.setVisible(false);*/dispose(); new preFinalScreen();}
            for(int i=0;i<n;i++) {
                System.out.println(name[i]+"\t\t"+age[i]+"\t"+gender[i]);
            }
        }

        public void mouseEntered(MouseEvent e) {}

        public void mouseExited(MouseEvent e) {}

        public void mousePressed(MouseEvent e) {}

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventback1 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            /*panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
            panel5.setVisible(false);
            panel6.setVisible(false);*/
            int loc1 = new welcomeScreen(false,false).loc1;
            int loc2 = new welcomeScreen(false,false).loc2;
            switch(loc1)
            {
                case 1: new International(loc2,true);System.out.println("INT"); break;
                case 2: new Domestic(loc2,true);System.out.println("DOM");break;
            }
            dispose();
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}

    } 
    public class numbercheck implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox)e.getSource();
            String numbercheck = (String)cb.getSelectedItem();
            n = Integer.parseInt(numbercheck);
            
        }
    }
    public class genderlistcheck implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox)e.getSource();
            k = (Integer)cb.getClientProperty("index");
            String gendercheck = (String)cb.getSelectedItem();
            gender[k]= gendercheck;
        }
    }
}
