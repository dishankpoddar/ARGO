import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
class welcomeScreen extends JFrame {
    private JLabel label,label2,labeldate,labelmonth,labelyear,labelconfirm,labelloc;
    private JButton button, buttonint, buttondom,back1,back2,back3;
    private JButton[] buttonsint = new JButton[5];
    private JButton[] buttonsdom = new JButton[5];
    private JLabel[] emptylabel = new JLabel[12];
    private JTextField textfielddate,textfieldmonth,textfieldyear;
    public JPanel panel1,panel2,panel3,panel4;
    private JComboBox datelist,monthlist,yearlist;
    public static int y,m,d,yy,mm,dd,loc1,loc2;
    private int i;
    private String text,text2,location;
    private boolean statecal;
    private String[] dates = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
    private String[] months = {"01","02","03","04","05","06","07","08","09","10","11","12"};
    private int currentyear = Calendar.getInstance().get(Calendar.YEAR);
    private String[] years = {String.valueOf(currentyear),String.valueOf(currentyear+1)};
    public welcomeScreen(){};

    public welcomeScreen(boolean state,boolean state0) {
        d = 01;
        m = 01;
        y = 2017;
        Calendar cl=Calendar.getInstance();
        yy=cl.get(Calendar.YEAR);
        mm=cl.get(Calendar.MONTH)+1;
        dd=cl.get(Calendar.DATE);

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        for(i=0;i<12;i++)
            emptylabel[i]= new JLabel("  ");

        panel1 = new JPanel();
        label = new JLabel("When do you want to travel:");
        panel1.add(label);
        labeldate = new JLabel("Enter Date (dd): ");
        panel1.add(labeldate);
        datelist = new JComboBox(dates);
        panel1.add(datelist);
        datelistcheck edate = new datelistcheck();
        datelist.addActionListener(edate);
        labelmonth = new JLabel("Enter Month (mm): ");
        panel1.add(labelmonth);
        monthlist = new JComboBox(months);
        panel1.add(monthlist);
        monthlistcheck emonth = new monthlistcheck();
        monthlist.addActionListener(emonth);
        labelyear = new JLabel("Enter Year (yyyy): ");
        panel1.add(labelyear);
        yearlist = new JComboBox(years);
        panel1.add(yearlist);
        yearlistcheck eyear = new yearlistcheck();
        yearlist.addActionListener(eyear);
        button = new JButton("Continue");
        panel1.add(button);
        eventclick2 e2 = new eventclick2();
        button.addMouseListener(e2);
        label2 = new JLabel("");
        panel1.add(label2);
        panel1.setVisible(state);
        add(panel1);

        panel2 = new JPanel();
        labelconfirm = new JLabel();
        panel2.add(labelconfirm);
        labelloc = new JLabel("<html>" + "Do you want to travel to \n".replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>").replaceAll(" ", "&nbsp;") + "</html>");
        panel2.add(labelloc);
        buttonint = new JButton("International");
        panel2.add(buttonint);
        eventclick3 e3 = new eventclick3();
        buttonint.addMouseListener(e3);
        buttondom = new JButton("Domestic");
        panel2.add(buttondom);
        eventclick4 e4 = new eventclick4();
        buttondom.addMouseListener(e4);
        back1 = new JButton("Back");
        panel2.add(back1);
        eventback1 eb1 = new eventback1();
        back1.addMouseListener(eb1);
        panel2.setVisible(false);
        add(panel2);

        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
        eventclickloc eloc = new eventclickloc();
        buttonsint[0] = new JButton("New York");
        buttonsint[0].putClientProperty("index", 0);
        buttonsint[0].addMouseListener(eloc);
        buttonsint[0].setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonsint[1] = new JButton("Paris");
        buttonsint[1].putClientProperty("index", 1);
        buttonsint[1].addMouseListener(eloc);
        buttonsint[1].setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonsint[2] = new JButton("Tokyo");
        buttonsint[2].putClientProperty("index", 2);
        buttonsint[2].addMouseListener(eloc);
        buttonsint[2].setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonsint[3] = new JButton("London");
        buttonsint[3].putClientProperty("index", 3);
        buttonsint[3].addMouseListener(eloc);
        buttonsint[3].setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonsint[4] = new JButton("Beijing");
        buttonsint[4].putClientProperty("index", 4);
        buttonsint[4].addMouseListener(eloc);
        buttonsint[4].setAlignmentX(JButton.CENTER_ALIGNMENT);
        panel3.add(emptylabel[0]);
        panel3.add(buttonsint[0]);
        panel3.add(emptylabel[1]);
        panel3.add(buttonsint[1]);
        panel3.add(emptylabel[2]);
        panel3.add(buttonsint[2]);
        panel3.add(emptylabel[3]);
        panel3.add(buttonsint[3]);
        panel3.add(emptylabel[4]);
        panel3.add(buttonsint[4]);
        panel3.add(emptylabel[5]);
        JButton back2 = new JButton("Back");
        panel3.add(back2);
        eventbackint eb2 = new eventbackint();
        back2.addMouseListener(eb2);
        back2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        panel3.setVisible(false);
        add(panel3);

        panel4 = new JPanel();
        panel4.setLayout(new BoxLayout(panel4,BoxLayout.Y_AXIS));
        buttonsdom[0] = new JButton("Delhi");
        buttonsdom[0].putClientProperty("index", 0);
        buttonsdom[0].addMouseListener(eloc);
        buttonsdom[0].setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonsdom[1] = new JButton("Goa");
        buttonsdom[1].putClientProperty("index", 1);
        buttonsdom[1].addMouseListener(eloc);
        buttonsdom[1].setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonsdom[2] = new JButton("Bengaluru");
        buttonsdom[2].putClientProperty("index", 2);
        buttonsdom[2].addMouseListener(eloc);
        buttonsdom[2].setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonsdom[3] = new JButton("Jaipur");
        buttonsdom[3].putClientProperty("index", 3);
        buttonsdom[3].addMouseListener(eloc);
        buttonsdom[3].setAlignmentX(JButton.CENTER_ALIGNMENT);
        buttonsdom[4] = new JButton("Kolkata");
        buttonsdom[4].putClientProperty("index", 4);
        buttonsdom[4].addMouseListener(eloc);
        buttonsdom[4].setAlignmentX(JButton.CENTER_ALIGNMENT);
        panel4.add(emptylabel[6]);
        panel4.add(buttonsdom[0]);
        panel4.add(emptylabel[7]);
        panel4.add(buttonsdom[1]);
        panel4.add(emptylabel[8]);
        panel4.add(buttonsdom[2]);
        panel4.add(emptylabel[9]);
        panel4.add(buttonsdom[3]);
        panel4.add(emptylabel[10]);
        panel4.add(buttonsdom[4]);
        panel4.add(emptylabel[11]);
        JButton back3 = new JButton("Back");
        panel4.add(back3);
        eventbackdom eb3 = new eventbackdom();
        back3.addMouseListener(eb3);
        back3.setAlignmentX(JButton.CENTER_ALIGNMENT);
        panel4.setVisible(false);
        add(panel4);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);            
        setSize(250,300);
        setVisible(state0);
    }
    public class eventclick2 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            text="Departure Date: "+d+"/"+m+"/"+y+" \n";
            labelconfirm.setText("<html>" + text.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>").replaceAll(" ", "&nbsp;") + "</html>");
            statecal = false;
            if(y>yy+1|y==yy+1&m>mm)
                statecal = true;
            else if(m==1|m==3|m==5|m==7|m==8|m==10|m==12&&d>31)
                statecal = true;
            else if(m==4|m==6|m==9|m==11&&d>30)
                statecal = true;
            else if(y%4==0&&m==2&&d>29)
                statecal = true;
            else if(y%4!=0&&m==2&&d>28)
                statecal = true;

            if(y==yy&&m<mm)
                statecal = true;
            else if (y==yy&&m==mm&&d<=dd)
                statecal = true;

            if(statecal){
                text2 = "Enter dates between \n"+(dd+1)+"/"+(mm)+"/"+(yy)+" to "+(dd)+"/"+(mm)+"/"+(yy+1);
                label2.setText("<html>" + text2.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>").replaceAll(" ", "&nbsp;") + "</html>");
            }
            else{
                panel1.setVisible(false);
                panel2.setVisible(true);
            }
            System.out.println(dd+" "+mm+" "+yy);
            System.out.println(d+" "+m+" "+y);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventclick3 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            loc1 = 1;
            panel2.setVisible(false);
            panel3.setVisible(true);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventclick4 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            loc1 = 2;
            panel2.setVisible(false);
            panel4.setVisible(true);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventback1 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            panel2.setVisible(false);
            panel1.setVisible(true);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventbackint implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            panel3.setVisible(false);
            panel2.setVisible(true);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventbackdom implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            panel4.setVisible(false);
            panel2.setVisible(true);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventclickloc implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            JButton btn = (JButton) e.getSource();
            loc2 = (Integer)btn.getClientProperty("index");
            location = (String)btn.getText();
            System.out.println("clicked button: " + loc2 + "\t" + location);
            panel3.setVisible(false);
            panel4.setVisible(false);
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

    public class datelistcheck implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox)e.getSource();
            String datecheck = (String)cb.getSelectedItem();
            d = Integer.parseInt(datecheck);;
        }
    }
    public class monthlistcheck implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox)e.getSource();
            String monthcheck = (String)cb.getSelectedItem();
            m = Integer.parseInt(monthcheck);
        }
    }
    public class yearlistcheck implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JComboBox cb = (JComboBox)e.getSource();
            String yearcheck = (String)cb.getSelectedItem();
            y = Integer.parseInt(yearcheck);
        }
    }
}
