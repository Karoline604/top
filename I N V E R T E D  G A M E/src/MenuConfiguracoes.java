
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
    
    private JFrame frame;
    private BufferedImage fundoC;
    
    private JButton Bmusica;
    private JButton Bsom;
    private JButton Bvoltar;
    
    private ImageIcon imageMusica;
    private ImageIcon imageSom;
    private ImageIcon imageVoltar;
    
    public MenuConfiguracoes(JFrame frame){
    
        this.frame=frame;
        
        setLayout(null);
   
        try {
            fundoC = ImageIO.read(new FileInputStream("src/imagens/fundoConfig.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        imageMusica= new ImageIcon("src/imagens/musicaD.png");
        imageSom= new ImageIcon ("src/imagens/somD.png");
        imageVoltar= new ImageIcon("src/imagens/voltar2.png");
        
        Bmusica= new JButton();
        Bsom= new JButton();
        Bvoltar= new JButton();
        
        Bmusica.setBorderPainted(false);
        Bmusica.setContentAreaFilled(false);
        
        Bsom.setBorderPainted(false);
        Bsom.setContentAreaFilled(false);
        
        Bvoltar.setBorderPainted(false);
        Bvoltar.setContentAreaFilled(false);
        
        Bmusica.setIcon(imageMusica);
        Bsom.setIcon(imageSom);
        Bvoltar.setIcon(imageVoltar);
        
        Bmusica.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        });
        
        Bsom.addActionListener(new ActionListener (){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
    
        });
        
        Bvoltar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                frame.getContentPane().removeAll();
                
                MenuPrincipal mp= new MenuPrincipal(frame);
                
                frame.getContentPane().add(mp);
                
                mp.requestFocusInWindow();
            }
            
            
        });
        
        Bvoltar.setBounds(30, 20, 50,38);
        Bsom.setBounds(400,80, 64, 67);
        Bmusica.setBounds(400, 130, 77, 62);
        
        
        add(Bvoltar);
        add(Bmusica);
        add(Bsom);
        
        setSize(760,428);
        setVisible(true);
               
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(fundoC, 0, 0, getWidth()-15, getHeight()-20, null);
    }
    
}
