import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Domestic extends JFrame{   
    private JLabel labelflight,labelclass;
    private JButton back1,back2;
    private JButton[] buttonsclass = new JButton[3];
    private JButton[] buttonsflight = new JButton[5];
    private JPanel panel1,panel2;
    public int place,price,fclass,indigo,jetk,air,jeta,indian;
    public Domestic(){}

    public Domestic(int c,boolean state)
    {
        place = c;

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        panel1 = new JPanel();
        eventclickclass eclass = new eventclickclass();
        buttonsclass[0] = new JButton("Economy Class");
        buttonsclass[0].putClientProperty("index", 0);
        buttonsclass[0].addMouseListener(eclass);
        buttonsclass[1] = new JButton("Business Class");
        buttonsclass[1].putClientProperty("index", 1);
        buttonsclass[1].addMouseListener(eclass);
        buttonsclass[2] = new JButton("First Class");
        buttonsclass[2].putClientProperty("index", 2);
        buttonsclass[2].addMouseListener(eclass);
        panel1.add(buttonsclass[0]);
        panel1.add(buttonsclass[1]);
        panel1.add(buttonsclass[2]);
        JButton back1 = new JButton("Back");
        panel1.add(back1);
        eventback1 eb1 = new eventback1();
        back1.addMouseListener(eb1);
        panel1.setVisible(true);
        add(panel1);

        panel2 = new JPanel();
        labelflight = new JLabel("Choose Flight");
        panel2.add(labelflight);
        eventclickflight eflight = new eventclickflight();
        buttonsflight[0] = new JButton("");
        buttonsflight[0].putClientProperty("index", 0);
        buttonsflight[0].addMouseListener(eflight);
        buttonsflight[1] = new JButton("");
        buttonsflight[1].putClientProperty("index", 1);
        buttonsflight[1].addMouseListener(eflight);
        buttonsflight[2] = new JButton("");
        buttonsflight[2].putClientProperty("index", 2);
        buttonsflight[2].addMouseListener(eflight);
        buttonsflight[3] = new JButton("");
        buttonsflight[3].putClientProperty("index", 3);
        buttonsflight[3].addMouseListener(eflight);
        buttonsflight[4] = new JButton("");
        buttonsflight[4].putClientProperty("index", 4);
        buttonsflight[4].addMouseListener(eflight);
        panel2.add(buttonsflight[0]);
        panel2.add(buttonsflight[1]);
        panel2.add(buttonsflight[2]);
        panel2.add(buttonsflight[3]);
        panel2.add(buttonsflight[4]);
        JButton back2 = new JButton("Back");
        panel2.add(back2);
        eventback2 eb2 = new eventback2();
        back2.addMouseListener(eb2);
        panel2.setVisible(false);
        add(panel2);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);            
        setSize(430,250);
        setVisible(state);
    }

    public class eventclickclass implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            JButton btn = (JButton) e.getSource();
            fclass = (Integer)btn.getClientProperty("index");
            switch(fclass) {
                case 0: {
                    switch(place) {
                        case 0: {
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Delhi: Rs 8,128");indigo=8128;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Delhi: Rs 9,921");jetk=9921;
                            buttonsflight[2].setText("Air India->from Mumbai to Delhi: Rs 11,312");air=11312;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Delhi: Rs 12,067");jeta=12067;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Delhi: Rs 13,826");indian=13826;
                        }break;
                        case 1:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Goa: Rs 4,106");indigo=4106;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Goa: Rs 5,446");jetk=5446;
                            buttonsflight[2].setText("Air India->from Mumbai to Goa: Rs 6,117");air=6117;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Goa: Rs 6,536");jeta=6536;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Goa: Rs 8,212");indian=8212;                        
                        }break;
                        case 2:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Bengaluru: Rs 6,452");indigo=6452;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Bengaluru: Rs 6,703");jetk=6703;
                            buttonsflight[2].setText("Air India->from Mumbai to Bengaluru: Rs 6,871");air=6871;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Bengaluru: Rs 8,212");jeta=8212;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Bengaluru: Rs 11,061");indian=11061;                        
                        }break;
                        case 3:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Jaipur: Rs 6,452");indigo=6452;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Jaipur: Rs 7,039");jetk=7039;
                            buttonsflight[2].setText("Air India->from Mumbai to Jaipur: Rs 7,541");air=7541;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Jaipur: Rs 9385");jeta=9385;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Jaipur: Rs 10,893");indian=10893;                            
                        }break;
                        case 4:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Kolkata: Rs 8,547");indigo=8547;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Kolkata: Rs 9,031");jetk=9031;
                            buttonsflight[2].setText("Air India->from Mumbai to Kolkata: Rs 10,223");air=10223;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Kolkata: Rs 11,312");jeta=11312;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Kolkata: Rs 12,569");indian=12569;                        
                        }break;                    
                    }
                }break;
                case 1: {
                    switch(place) {
                        case 0: {
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Delhi: Rs 18,128");indigo=18128;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Delhi: Rs 19,921");jetk=19921;
                            buttonsflight[2].setText("Air India->from Mumbai to Delhi: Rs 21,312");air=21312;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Delhi: Rs 22,067");jeta=22067;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Delhi: Rs 23,826");indian=23826;
                        }break;
                        case 1:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Goa: Rs 14,106");indigo=18128;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Goa: Rs 15,446");jetk=19921;
                            buttonsflight[2].setText("Air India->from Mumbai to Goa: Rs 16,117");air=16117;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Goa: Rs 16,536");jeta=16536;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Goa: Rs 18,212");indian=18212;                        
                        }break;
                        case 2:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Bengaluru: Rs 16,452");indigo=16452;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Bengaluru: Rs 16,703");jetk=16703;
                            buttonsflight[2].setText("Air India->from Mumbai to Bengaluru: Rs 16,871");air=16871;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Bengaluru: Rs 18,212");jeta=18212;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Bengaluru: Rs 21,061");indian=21061;                      
                        }break;
                        case 3:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Jaipur: Rs 16,452");indigo=16452;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Jaipur: Rs 17,039");jetk=17039;
                            buttonsflight[2].setText("Air India->from Mumbai to Jaipur: Rs 17,541");air=17541;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Jaipur: Rs 19,385");jeta=19385;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Jaipur: Rs 20,893");indian=20893;                            
                        }break;
                        case 4:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Kolkata: Rs 18,547");indigo=18547;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Kolkata: Rs 19,031");jetk=19031;
                            buttonsflight[2].setText("Air India->from Mumbai to Kolkata: Rs 20,223");air=20223;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Kolkata: Rs 21,312");jeta=21312;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Kolkata: Rs 22,569");indian=22569;                        
                        }break;                    
                    }
                }break;
                case 2: {
                    switch(place) {
                        case 0: {
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Delhi: Rs 33,128");indigo=33128;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Delhi: Rs 34,921");jetk=34921;
                            buttonsflight[2].setText("Air India->from Mumbai to Delhi: Rs 36,312");air=36312;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Delhi: Rs 37,067");jeta=37067;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Delhi: Rs 38,826");indian=38826;
                        }break;
                        case 1:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Goa: Rs 29,106");indigo=29106;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Goa: Rs 30,446");jetk=30446;
                            buttonsflight[2].setText("Air India->from Mumbai to Goa: Rs 31,117");air=31117;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Goa: Rs 31,536");jeta=31536;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Goa: Rs 33,212");indian=33212;                        
                        }break;
                        case 2:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Bengaluru: Rs 31,452");indigo=31452;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Bengaluru: Rs 31,703");jetk=31703;
                            buttonsflight[2].setText("Air India->from Mumbai to Bengaluru: Rs 31,871");air=31871;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Bengaluru: Rs 33,212");jeta=33212;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Bengaluru: Rs 36,061");indian=36061;                        
                        }break;
                        case 3:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Jaipur: Rs 31,452");indigo=31452;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Jaipur: Rs 32,039");jetk=32039;
                            buttonsflight[2].setText("Air India->from Mumbai to Jaipur: Rs 32,541");air=32541;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Jaipur: Rs 34,385");jeta=34385;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Jaipur: Rs 35,893");indian=35893;                            
                        }break;
                        case 4:{
                            buttonsflight[0].setText("IndiGo Express->from Mumbai to Kolkata: Rs 33,547");indigo=33547;
                            buttonsflight[1].setText("JetKonnect->from Mumbai to Kolkata: Rs 34,031");jetk=34031;
                            buttonsflight[2].setText("Air India->from Mumbai to Kolkata: Rs 35,223");air=35223;
                            buttonsflight[3].setText("Jet Airways->from Mumbai to Kolkata: Rs 36,312");jeta=36312;
                            buttonsflight[4].setText("Indian Airlines->from Mumbai to Kolkata: Rs 37,569");indian=37569;                        
                        }break;                    
                    }
                }break;      
            }
            panel1.setVisible(false);
            panel2.setVisible(true);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventclickflight implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            JButton btn = (JButton) e.getSource();
            fclass = (Integer)btn.getClientProperty("index");
            switch(fclass) {
                case 0: price=indigo;break;
                case 1: price=jetk;break;
                case 2: price=air;break;
                case 3: price=jeta;break;
                case 4: price=indian;break;
            }
            System.out.println(price);
            panel2.setVisible(false);
            new passengerInfo(price,true);
	    dispose();
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventback1 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            new welcomeScreen(false,true).panel4.setVisible(true);
            dispose();
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
    public class eventback2 implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            panel2.setVisible(false);
            panel1.setVisible(true);
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }
}
