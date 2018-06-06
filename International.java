import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class International extends JFrame{   
    private JLabel labelflight,labelclass;
    private JButton back1,back2;
    private JButton[] buttonsclass = new JButton[3];
    private JButton[] buttonsflight = new JButton[5];
    private JPanel panel1,panel2;
    public int place,price,fclass,air,emirates,etihad,aeroflot,cathay;
    public International(){}

    public International(int c,boolean state)
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
                            buttonsflight[0].setText("Air India Express->from Mumbai to New York: Rs 39,688");air=39688;
                            buttonsflight[1].setText("Emirates->from Mumbai to New York: Rs 52,612");emirates=52612;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to New York: Rs 127,737");etihad=127737;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to New York: Rs 196,123");aeroflot=196123;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to New York: Rs 400,373");cathay=400373;
                        }break;
                        case 1:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to Paris: Rs 24,375");air=24375;
                            buttonsflight[1].setText("Emirates->from Mumbai to Paris: Rs 31,888");emirates=31888;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to Paris: Rs 64,450");etihad=64450;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to Paris: Rs 154,682");aeroflot=154682;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to Paris: Rs 241,531");cathay=241531;                        
                        }break;
                        case 2:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to Tokyo: Rs 22,039");air=22039;
                            buttonsflight[1].setText("Emirates->from Mumbai to Tokyo: Rs 39,050");emirates=39050;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to Tokyo: Rs 64,735");etihad=64735;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to Tokyo: Rs 81,536");aeroflot=81536;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to Tokyo: Rs 129,637");cathay=129637;                        
                        }break;
                        case 3:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to London: Rs 30,419");air=30419;
                            buttonsflight[1].setText("Emirates->from Mumbai to London: Rs 57,234");emirates=57234;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to London: Rs 85,056");etihad=85056;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to London: Rs 181,928");aeroflot=181928;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to London: Rs 274,945");cathay=274945;                            
                        }break;
                        case 4:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to Beijing: Rs 28,987");air=28987;
                            buttonsflight[1].setText("Emirates->from Mumbai to Beijing: Rs 41,637");emirates=41637;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to Beijing: Rs 68,949");etihad=68949;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to Beijing: Rs 88,469");aeroflot=88469;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to Beijing: Rs 280,739");cathay=280739;                        
                        }break;                    
                    }
                }break;
                case 1: {
                    switch(place) {
                        case 0: {
                            buttonsflight[0].setText("Air India Express->from Mumbai to New York: Rs 139,688");air=139688;
                            buttonsflight[1].setText("Emirates->from Mumbai to New York: Rs 152,612");emirates=152612;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to New York: Rs 227,737");etihad=227737;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to New York: Rs 296,123");aeroflot=296123;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to New York: Rs 500,373");cathay=500373;
                        }break;
                        case 1:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to Paris: Rs 124,375");air=124375;
                            buttonsflight[1].setText("Emirates->from Mumbai to Paris: Rs 131,888");emirates=131888;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to Paris: Rs 164,450");etihad=164450;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to Paris: Rs 254,682");aeroflot=254682;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to Paris: Rs 341,531");cathay=341531;                        
                        }break;
                        case 2:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to Tokyo: Rs 122,039");air=122039;
                            buttonsflight[1].setText("Emirates->from Mumbai to Tokyo: Rs 139,050");emirates=139050;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to Tokyo: Rs 164,735");etihad=164735;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to Tokyo: Rs 181,536");aeroflot=181536;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to Tokyo: Rs 229,637");cathay=229637;                      
                        }break;
                        case 3:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to London: Rs 130,419");air=130419;
                            buttonsflight[1].setText("Emirates->from Mumbai to London: Rs 157,234");emirates=157234;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to London: Rs 185,056");etihad=185056;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to London: Rs 281,928");aeroflot=281928;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to London: Rs 374,945");cathay=374945;                           
                        }break;
                        case 4:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to Beijing: Rs 128,987");air=128987;
                            buttonsflight[1].setText("Emirates->from Mumbai to Beijing: Rs 141,637");emirates=141637;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to Beijing: Rs 168,949");etihad=168949;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to Beijing: Rs 188,469");aeroflot=188469;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to Beijing: Rs 380,739");cathay=380739;                          
                        }break;                    
                    }
                }break;
                case 2: {
                    switch(place) {
                        case 0: {
                            buttonsflight[0].setText("Air India Express->from Mumbai to New York: Rs 289,688");air=289688;
                            buttonsflight[1].setText("Emirates->from Mumbai to New York: Rs 302,612");emirates=302612;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to New York: Rs 377,737");etihad=377737;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to New York: Rs 446,123");aeroflot=446123;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to New York: Rs 650,373");cathay=650373;
                        }break;
                        case 1:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to Paris: Rs 274,375");air=274375;
                            buttonsflight[1].setText("Emirates->from Mumbai to Paris: Rs 281,888");emirates=281888;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to Paris: Rs 314,450");etihad=314450;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to Paris: Rs 404,682");aeroflot=404682;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to Paris: Rs 491,531");cathay=491531;                        
                        }break;
                        case 2:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to Tokyo: Rs 272,039");air=272039;
                            buttonsflight[1].setText("Emirates->from Mumbai to Tokyo: Rs 289,050");emirates=289050;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to Tokyo: Rs 314,735");etihad=314735;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to Tokyo: Rs 331,536");aeroflot=331536;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to Tokyo: Rs 379,637");cathay=379637;                        
                        }break;
                        case 3:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to London: Rs 280,419");air=280419;
                            buttonsflight[1].setText("Emirates->from Mumbai to London: Rs 307,234");emirates=307234;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to London: Rs 335,056");etihad=335056;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to London: Rs 431,928");aeroflot=431928;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to London: Rs 524,945");cathay=524945;                              
                        }break;
                        case 4:{
                            buttonsflight[0].setText("Air India Express->from Mumbai to Beijing: Rs 278,987");air=278987;
                            buttonsflight[1].setText("Emirates->from Mumbai to Beijing: Rs 291,637");emirates=291637;
                            buttonsflight[2].setText("Etihad Airways->from Mumbai to Beijing: Rs 318,949");etihad=318949;
                            buttonsflight[3].setText("Aeroflot->from Mumbai to Beijing: Rs 338,469");aeroflot=338469;
                            buttonsflight[4].setText("Cathay Pacific->from Mumbai to Beijing: Rs 530,739");cathay=530739;                      
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
                case 0: price=air;break;
                case 1: price=emirates;break;
                case 2: price=etihad;break;
                case 3: price=aeroflot;break;
                case 4: price=cathay;break;
            }
            System.out.println(price);
            //panel2.setVisible(false);
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
            //panel1.setVisible(false);
            new welcomeScreen(false,true).panel3.setVisible(true);
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
