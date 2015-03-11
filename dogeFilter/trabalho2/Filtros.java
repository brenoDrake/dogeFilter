/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package trabalho2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextAttribute;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.WritableRaster;
import java.text.AttributedString;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author breno
 */
public class Filtros {
    
    public static BufferedImage escalaDeCinza(BufferedImage imgOriginal)
    {
        // Cria a imagem em escala de cinza utilizando o recurso nativo do BufferedImage
        BufferedImage imgCinza = new BufferedImage(imgOriginal.getWidth(), imgOriginal.getHeight(),
        BufferedImage.TYPE_BYTE_GRAY);

        // "Desenha" a imagem dentro do BufferedImage
        Graphics2D g = imgCinza.createGraphics();
        g.drawImage(imgOriginal, 0, 0, null);
        return imgCinza;
    }
    
    public static BufferedImage passaBaixa(BufferedImage imgOriginal)
    {
        // Matriz de trasnformação para o filtro passa-baixa
        // 0.11 é aproximadamente 1/9
        float[] matrizTrans = { 0.11f, 0.11f, 0.11f, 0.11f, 0.11f, 0.11f, 0.11f, 0.11f, 0.11f };
        return Filtros.filtroPorMatriz(imgOriginal, matrizTrans);
    }
    
    public static BufferedImage passaAlta(BufferedImage imgOriginal)
    {
        // Matriz de trasnformação para o filtro passa-alta
        float[] matrizTrans = { 0.0f, 1.0f, 0.0f, 1.0f, -4.0f, 1.0f, 0.0f, 1.0f, 0.0f };
        return Filtros.filtroPorMatriz(imgOriginal, matrizTrans);
    }
    
    private static BufferedImage filtroPorMatriz(BufferedImage imgOriginal, float[] matrizTrans)
    {
        // Interface nativa do java para aplicação de operações simples em um BufferedImage
        BufferedImageOp meuFiltro = new ConvolveOp(new Kernel(3, 3, matrizTrans),
        ConvolveOp.EDGE_NO_OP, null);
        
        // Cria uma nova imagem aplicando o filtro
        return meuFiltro.filter(imgOriginal, null);
    }
    
    public static BufferedImage selpia(BufferedImage imgOriginal) 
    {
        BufferedImage sepia = new BufferedImage(imgOriginal.getWidth(), imgOriginal.getHeight(), BufferedImage.TYPE_INT_RGB);
        
        // Indica
        int sepiaDepth = 20;
        int sepiaIntensity = 80;

        int w = imgOriginal.getWidth();
        int h = imgOriginal.getHeight();

        WritableRaster raster = sepia.getRaster();

        // Matriz que armazena o RGB dos pixles
        int[] pixels = new int[w * h * 3];
        // Seta os pixels da imagem original na matriz de pixels
        imgOriginal.getRaster().getPixels(0, 0, w, h, pixels);

        // Percorre a matriz de pixles, 3 a cada vez (pois um para cada cada cor do RGB).
        for (int i = 0; i < pixels.length; i += 3) 
        {
            int r = pixels[i];
            int g = pixels[i + 1];
            int b = pixels[i + 2];

            int gry = (r + g + b) / 3;
            r = g = b = gry;
            r = r + (sepiaDepth * 2);
            g = g + sepiaDepth;

            // Verifica se os valores estão dentro da faixa RGB 
            if (r > 255)
                r = 255;
           
            if (g > 255)
                g = 255;
            
            if (b > 255) 
                b = 255;
            
            // Deixa o tom do azul mais escuro para potencializar o efeito sélpia
            b -= sepiaIntensity;

            // Verifica se os valores estão dentro da faixa RGB 
            if (b < 0)
                b = 0;
            else if (b > 255) 
                b = 255;
            
            pixels[i] = r;
            pixels[i + 1] = g;
            pixels[i + 2] = b;
        }
        
        // 'Desenha' a imagem em sélpia, adicionando os pixels alterados na nova imagem
        raster.setPixels(0, 0, w, h, pixels);
        return sepia;
    }
    
    public static BufferedImage doge(BufferedImage imgOriginal)
    {
        ArrayList<String> lstTextos = new ArrayList<String>();
        lstTextos.add("#muchDoge");
        lstTextos.add("#instaDoge");
        lstTextos.add("#dogeS2");
        lstTextos.add("#lol");
        lstTextos.add("#wow");
        lstTextos.add("#amazing");
        lstTextos.add("#wowWow");
        lstTextos.add("#manySkills");
        lstTextos.add("#soArt");
        lstTextos.add("Wow");
        lstTextos.add("#BrenoPires");
        lstTextos.add("#soAmazing");
        lstTextos.add("#LaisCarvalho");
        lstTextos.add("#manyFilters");
        lstTextos.add("#amazingSkils");
        lstTextos.add("#manyPixels");
        lstTextos.add("#cool");
        lstTextos.add("#soSuper");
        lstTextos.add("#muchPrograms");
        lstTextos.add("#veryProgramingSkills");
        lstTextos.add("#hey");
        lstTextos.add("#soCute");
        lstTextos.add("#veryRealism");
        lstTextos.add("#javaS2");
        lstTextos.add("#dogeS2");
        
        BufferedImage imgDoge = new BufferedImage(imgOriginal.getWidth(), imgOriginal.getHeight(),
        BufferedImage.TYPE_INT_RGB);
        
        // "Desenha" a imagem dentro do BufferedImage
        Graphics2D g2D = imgDoge.createGraphics();
        g2D.drawImage(imgOriginal, 0, 0, null);
        
        Random rand = new Random();
        
        // Adiciona 5 hashtags doge aleatórias
        for(int i = 0; i < 5; i ++)
        {
            int x = rand.nextInt(imgOriginal.getWidth());
            int y = rand.nextInt(imgOriginal.getHeight());

            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            String txt = lstTextos.get(rand.nextInt(lstTextos.size()));

            AttributedString as = new AttributedString(txt);
            as.addAttribute(TextAttribute.FOREGROUND, new Color(r, g, b));
            as.addAttribute(TextAttribute.FONT, new Font("Comic Sans MS", Font.PLAIN, 20));

            g2D.drawString(as.getIterator(), x, y);
        }
        
        return imgDoge;
    }
}
