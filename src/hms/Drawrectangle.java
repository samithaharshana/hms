/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

/**
 *
 * @author Samitha
 */
import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Drawrectangle extends Frame {

    public void paint(Graphics g) {
        Graphics2D ga = (Graphics2D) g;
        ga.setPaint(Color.red);
        ga.drawRect(50, 50, 300, 300);
        ga.setPaint(Color.green);
        ga.drawRect(100, 100, 200, 200);
        ga.setPaint(Color.blue);
        ga.drawRect(150, 150, 100, 100);
    }
    
   

}
