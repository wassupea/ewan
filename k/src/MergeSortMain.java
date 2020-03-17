import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class MergeSortMain here.
 *
 * @author A.M.D.
 * @version v 0.2 Update
 */
public class MergeSortMain extends JFrame
{
    private JPanel topmenu;
    private CanvasPanel canvas;
    public static int[]array;
    
    //constructor for JFrame
    public MergeSortMain(){
        topmenu = new MenuPanel(this);
        add(topmenu, BorderLayout.NORTH);
        
        canvas = new CanvasPanel();
        add(canvas, BorderLayout.CENTER);
        
   
        
        setSize(1100, 700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Merge Sort");
        setLocationRelativeTo(null);
    }
    
    //for displaying Array in Canvas
    public void displayArray(int[] array){
            canvas.DisplayArray(array);
    }
    public void resetAll(){
        canvas.resetArray();
    }
    public void animateArray(int[] array){
           canvas.animate(array);
    }
    
    public void mergeAnimate(int[]array) {
        canvas.mergeAnimate(array);
    }
    //Runs the program
    public static void main(String[] args){
        new MergeSortMain();
    }
     public Timer getTimer() {
        return canvas.getTimer();
     }
}
