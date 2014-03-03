/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package notepad;

import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author sampath
 */
public class UIBuilder {
    private JFrame mainWind;
    private JTextArea paper;

    public UIBuilder() {
        mainWind = new JFrame("Swm pad");
        paper = new JTextArea();
        mainWind.add(paper);
        mainWind.pack();
        mainWind.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWind.setVisible(true);
    }
    
    
    
}
