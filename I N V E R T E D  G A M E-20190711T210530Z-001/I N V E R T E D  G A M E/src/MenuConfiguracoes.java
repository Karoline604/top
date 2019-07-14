
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class MenuConfiguracoes extends JPanel {
    
    
    private BufferedImage fundoC;
    
    private JButton Bmusica;
    private JButton Bsom;
    
    private ImageIcon imageMusica;
    private ImageIcon imageSom;
    
    public MenuConfiguracoes(){
    
         setLayout(null);
   
        
        try {
            fundoC = ImageIO.read(new FileInputStream("src/imagens/fundo1.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        imageMusica= new ImageIcon("src/imagens/bsom.png");
        imageSom= new ImageIcon ("src/imagens/bsom.png");
        
        Bmusica= new JButton();
        Bsom= new JButton();
        
        Bmusica.setBorderPainted(false);
        Bmusica.setContentAreaFilled(false);
        
        Bsom.setBorderPainted(false);
        Bsom.setContentAreaFilled(false);
        
        Bmusica.setIcon(imageMusica);
        Bsom.setIcon(imageSom);
        
        Bmusica.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
        
        Bsom.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
    
        });
        
        Bmusica.setBounds(170, 190, 300, 50);
        Bsom.setBounds(170, 270, 300, 50);
        
        add(Bmusica);
        add(Bsom);
        
        setSize(760,428);
        setVisible(true);
               
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(fundoC, 0, 0, getWidth(), getHeight(), null);
    }
    
}
