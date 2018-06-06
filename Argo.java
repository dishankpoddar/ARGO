import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Argo extends JFrame{
    private JLabel label,label2;
    private JButton button;
    private JPanel panel;
    String argo = "";
    String welc = "";
    public Argo() {
        argo += "\n     __________     _____________ ____________ ____________  TM";
        argo += "\n    / ////// |||   |||///////////|||||||||||_/||||||||||||||   ";
        argo += "\n   /_/ ////  |||   |||      //// ||||         ||||||||||||||   ";
        argo += "\n      ////   |||   |||     ////  ||||         ||||      ||||   ";
        argo += "\n     ////____|||   |||____////   ||||  ____   ||||      ||||   ";
        argo += "\n    /////////|||   |||///////    ||||  |_|||  ||||      ||||   ";
        argo += "\n   ////      |||   |||    |||    ||||    |||  ||||      ||||   ";
        argo += "\n  ////       |||   |||      |||  ||||    |||  ||||______||||   ";
        argo += "\n ////        |||___|||        |||||||____|||  ||||||||||||||   ";
        argo += "\n////         |||||/            |||||||||||||  ||||||||||||||   ";
        argo += "\n                                    \u00a9 DishankPoddar D7C-43";
        //welc += "\n \n \n Welcome to www.argo-mumbai.in/";
        //welc += "\n For any queries call our customer care no. 1800-000-0000. \n\n\n";

        setLayout(new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));

        panel = new JPanel();
        label = new JLabel("<html>" + argo.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>").replaceAll(" ", "&nbsp;") + "</html>");
        label.setFont(new Font("Courier",Font.PLAIN,10));
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label);
        label2 = new JLabel("<html>" + welc.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>").replaceAll(" ", "&nbsp;") + "</html>");
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label2);
        button = new JButton("Continue");
        button.setBorder(BorderFactory.createEmptyBorder(10, 100, 10, 100));
        panel.add(button);
        eventclick e = new eventclick();
        button.addMouseListener(e);
        add(panel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);              
        setSize(420,360);
        setVisible(true);
    }

    public class eventclick implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            new welcomeScreen(true,true);
	    dispose();
        }  

        public void mouseEntered(MouseEvent e) {}  

        public void mouseExited(MouseEvent e) {}  

        public void mousePressed(MouseEvent e) {}  

        public void mouseReleased(MouseEvent e) {}
    }

    public static void main(String args[])
    {
        new Argo();
    }
}
