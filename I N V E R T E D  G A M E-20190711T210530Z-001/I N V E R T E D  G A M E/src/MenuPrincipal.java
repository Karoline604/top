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
 * @author KAROL
 */
public class MenuPrincipal extends JPanel {

    private static final long serialVersionUID = 1L;
    
    private BufferedImage fundoP;
    
    private JFrame Pframe;
    
    private JButton Bjogar;
    private JButton Bperson;
    private JButton Bconfig;
    
    private ImageIcon imageJogar;
    private ImageIcon imagePerson;
    private ImageIcon imageConfig;
    
    public MenuPrincipal(JFrame frame){
        
        Pframe=frame;
        
        setLayout(null);
        
        try{
            fundoP=ImageIO.read(new FileInputStream("src/imagens/fundo1.jpg"));
        }catch(Exception e){
           e.printStackTrace();
        }
    
    imageJogar=new ImageIcon("src/imagens/BjogarD.png");
    imagePerson= new ImageIcon("src/imagens/BpersonD.png");
    imageConfig= new ImageIcon("src/imagens/BconfigD.png");
    
    Bjogar= new JButton();
    Bperson= new JButton();
    Bconfig= new JButton();
    
    Bjogar.setBorderPainted(false);
    Bjogar.setContentAreaFilled(false);
    
    Bperson.setBorderPainted(false);
    Bperson.setContentAreaFilled(false);
    
    Bconfig.setBorderPainted(false);
    Bconfig.setContentAreaFilled(false);
    
    Bjogar.setIcon(imageJogar);
    Bperson.setIcon(imagePerson);
    Bconfig.setIcon(imageConfig);
    
    
    Bjogar.addActionListener(new ActionListener () {
        
        @Override
        public void actionPerformed(ActionEvent e) {

            //Pframe.getContentPane().removeAll(); 
                
            
            //PainelJogo pj = new PainelJogo();
          //  Pframe.getContentPane().add(pj);
                
        //    pj.requestFocusInWindow(); 
                
        }
    });
    
    Bperson.addActionListener(new ActionListener (){
        
        @Override
        public void actionPerformed(ActionEvent e) {

            //remove
        Pframe.getContentPane().removeAll();
        
        //cria um novo
        MenuPersonagens mp= new MenuPersonagens();
        //adiciona
        Pframe.getContentPane().add(mp);
        
        //foca
        mp.requestFocusInWindow();
        
        }
        
    });
    
    Bconfig.addActionListener(new ActionListener (){
        
        @Override
        public void actionPerformed(ActionEvent ae) {
             
        //remove
        Pframe.getContentPane().removeAll();
        
        //cria um novo
        MenuConfiguracoes mc= new MenuConfiguracoes();
        //adiciona
        Pframe.getContentPane().add(mc);
        
        //foca
        mc.requestFocusInWindow();
                
        }
       
    });
    
    // Posicionando os botões
        Bjogar.setBounds(170, 190, 300, 50);
        Bperson.setBounds(170, 270, 300, 50);
        Bconfig.setBounds(170, 350, 300, 50);

        // Adicionando Componentes ao Painel
        add(Bjogar);
        add(Bperson);
        add(Bconfig);

        // Configurações Finais do Painel
        setSize(760,428);
        setVisible(true);
    
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(fundoP, 0, 0, getWidth(), getHeight(), null);
    }
}
