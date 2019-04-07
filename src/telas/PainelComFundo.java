/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

/**
 *
 * @author Scorpion
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PainelComFundo extends JPanel{
     private String caminhoImagem = "";

        public PainelComFundo() {
        }

        public PainelComFundo(String caminho) {
            this.caminhoImagem = caminho;
        }

        @Override
        public void paintComponent(Graphics g) {
            Graphics2D gr = (Graphics2D) g.create();

            try {
                BufferedImage bf = ImageIO.read(new File(caminhoImagem));

                gr.drawImage(bf, null, 0, 0);
            } catch (IOException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}

