import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class finalScreen extends JFrame
{   private JLabel labeldate,labelloc,labelprice,labelpricedet1,labelpricedet2,labelpricedet3,labelinfo;
    private JLabel[] emptylabel = new JLabel[6];;
    private JButton buttonbuy, buttonback;
    private JLabel[] labelname = new JLabel[5];
    private JLabel[] labelage = new JLabel[5];
    private JLabel[] labelgender = new JLabel[5];
    public JPanel panel1,panel2,panel3,panel4;
    private String pricedet,date,location,finalprice;
    private int d,m,y,loc1,loc2,n,fprice;
    private String[] name= new String[5];
    private String[] gender= new String[5];
    private int[] age = new int[5];
    public int price;
    finalScreen()
    {
        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        d = new welcomeScreen().d;
        m = new welcomeScreen().m;
        y = new welcomeScreen().y;
        loc1 = new welcomeScreen().loc1;
        loc2 = new welcomeScreen().loc2;
        n = new passengerInfo().n;
        price = new passengerInfo().tprice;
        for(int i =0;i<n;i++){
            name[i]= new passengerInfo().name[i];
            age[i]= new passengerInfo().age[i];
            gender[i]= new passengerInfo().gender[i];
        }
        System.out.println("ok check" +d+"/"+m+"/"+y+"\t"+loc1+"\t"+loc2+"\t"+price+"\t"+n);
        for(int i =0;i<n;i++){
            System.out.println(name[i]+"\t\t"+age[i]+"\t"+gender[i]);
            if(age[i]>=5&&age[i]<12)
                fprice += price*0.5;
            else if (age[i] >= 12)
                fprice += price;

        }
        switch(loc1){
            case 1: { switch(loc2){
                    case 0: location = "New York"; break;
                    case 1: location = "Paris"; break;
                    case 2: location = "Tokyo"; break;
                    case 3: location = "London"; break;
                    case 4: location = "Beijing"; break;
                }                        
            };break;
            case 2: { switch(loc2){
                    case 0: location = "Delhi"; break;
                    case 1: location = "Goa"; break;
                    case 2: location = "Bengaluru"; break;
                    case 3: location = "Jaipur"; break;
                    case 4: location = "Kolkata"; break;
                }                        
            };break;
        }
        location = "Journey from Mumbai to "+location;
        date = "Date of Journey: "+d+"/"+m+"/"+y;
        panel1 = new JPanel();
        labeldate = new JLabel(date);
        panel1.add(labeldate);
        emptylabel[0] = new JLabel("     ");
        panel1.add(emptylabel[0]);
        labelloc = new JLabel(location);
        panel1.add(labelloc);
        panel1.setVisible(true);
        add(panel1);

        panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        labelinfo = new JLabel("Passengers Info:    ");
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2; gbc.insets = new Insets(10,15,5,15);
        panel2.add(labelinfo,gbc);
        emptylabel[1] = new JLabel("     ");
        gbc.gridx = 2; gbc.gridy = 0; gbc.gridwidth = 1;
        panel2.add(emptylabel[1],gbc);
        emptylabel[2] = new JLabel("          ");
        gbc.gridx = 3; gbc.gridy = 0; gbc.gridwidth = 1;
        panel2.add(emptylabel[2],gbc);

        for(int i = 0;i<n;i++) {
            labelname[i] = new JLabel(name[i]);
            gbc.gridx = 0; gbc.gridy = i+1; gbc.gridwidth = 2; gbc.insets = new Insets(5,15,5,15);
            labelname[i].insets();
            panel2.add(labelname[i],gbc);
            labelage[i] = new JLabel(Integer.toString(age[i]));
            gbc.gridx = 2; gbc.gridy = i+1; gbc.gridwidth = 1;
            panel2.add(labelage[i],gbc);
            labelgender[i] = new JLabel(gender[i]);
            gbc.gridx = 3; gbc.gridy = i+1; gbc.gridwidth = 1;
            panel2.add(labelgender[i],gbc);
        }
        panel2.setVisible(true);
        add(panel2);

        finalprice="Amount Paid: "+fprice/1000+","+fprice%1000;
        panel3 = new JPanel();
        panel3.setLayout(new BoxLayout(panel3,BoxLayout.Y_AXIS));
        emptylabel[5] = new JLabel("     ");
        emptylabel[5].setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel3.add(emptylabel[5]);
        labelprice = new JLabel(finalprice);
        labelprice.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel3.add(labelprice);
        emptylabel[3] = new JLabel("     ");
        emptylabel[3].setAlignmentX(JLabel.CENTER_ALIGNMENT);
        panel3.setVisible(true);
        add(panel3);

        JPanel emptypanel = new JPanel();
        emptypanel.setVisible(true);
        add(emptypanel);

        panel4 = new JPanel();
        buttonbuy = new JButton("Book another ticket");
        panel4.add(buttonbuy);
        buttonbuy.addMouseListener(new eventnew());
        emptylabel[4] = new JLabel("             ");
        panel4.add(emptylabel[4]);
        buttonback = new JButton("EXIT");
        buttonback.addMouseListener(new eventexit());
        panel4.add(buttonback);
        panel4.setVisible(true);
        add(panel4);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);            
        setSize(500,300);
        setVisible(true);
    }
    public class eventnew implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            /*panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);*/
            new Argo();
	    dispose();
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventexit implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            System.exit(0);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }

}

