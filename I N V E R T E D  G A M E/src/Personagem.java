
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAROL
 */
public class Personagem extends Objeto{
    
    private final int qtdVida=3;
    
    
    
    public Personagem(int x, int y, int velc_x, int velc_y, int largura, int altura) {
        super(x, y, velc_x, velc_y, largura, altura);
    }
    
}
