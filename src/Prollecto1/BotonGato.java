package Prollecto1;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;


public class BotonGato extends JButton{

    int fila;
    int columna;
    String estado = "";

    public BotonGato(int fila, int columna){

        this.fila = fila;
        this.columna = columna;

        this.setFont(new Font("Arial",Font.BOLD,60));
        this.setBackground(Color.white);
        this.setForeground(Color.black);
        this.setBorder(null);
        

    }

}