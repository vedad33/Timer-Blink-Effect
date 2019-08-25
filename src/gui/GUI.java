
package gui;

import javax.swing.JOptionPane;


public class GUI {

    
    public static void main(String[] args) {
      
        int x= JOptionPane.showOptionDialog(null, "Choose one option", "Timer", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,null, new String[]{"Settings","Cancel"},null);
        
        
        switch(x){
        
            case JOptionPane.YES_OPTION:
                NewJFrameTimer timer = new NewJFrameTimer();
                timer.setVisible(true);
                break;
                
            case JOptionPane.NO_OPTION:
                System.exit(0);
                break;
                
        
        
        }
    }
    
}
