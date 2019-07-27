
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAROL
 */
public class Plataforma extends Objeto{
    
    private BufferedImage plataforma;
    
    public Plataforma(int x, int y, int velc_x, int velc_y, int largura, int altura) {
        super(x, y, velc_x, velc_y, largura, altura);
    
    
        try{
            plataforma =ImageIO.read(new FileInputStream("src/imagens/plataforma.png"));
    
        }catch(Exception e){
            e.printStackTrace();
        }
    
    }       
    
    public void Draw(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(plataforma, getX(), getY(), getAltura(), getLargura(), null);
    }
}
