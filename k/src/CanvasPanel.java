import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.Queue; 
public class CanvasPanel extends JPanel 
{
    JLabel[] lbl, lbl2;
    private Timer timer;
    private int speed = 500;
    int[]array;
    private final Queue <Integer> queue;
    public CanvasPanel(){
        this.queue = new LinkedList<>();
        setBackground(Color.white);
        timer = new Timer(speed,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            mergeAnimate(array);
            }
        });
        timer.start(); 
    }
    
    public void DisplayArray(int[] array){
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        if(!emptyArray()){
            this.removeAll();
        }
        if(array != null) {
            lbl= new JLabel[array.length];
            for(int i=0; i<array.length;i++){
                String value = Integer.toString(array[i]);
                JLabel label = new JLabel(value);
                label.setFont(new Font("Helvetica", Font.BOLD,11));
                label.setHorizontalAlignment(JLabel.CENTER);
                label.setVerticalAlignment(JLabel.CENTER);
                label.setPreferredSize(new Dimension(80,40));
                label.setBorder(border);
                lbl[i]= label;
               System.out.print(value + " ");
            }
            setLayout(null);
            for(JLabel label:lbl){
                add(label);
            }
            switch (lbl.length) {
               case 10:
                    lbl[0].setBounds(137,10,70,40);
                    lbl[1].setBounds(224,10,70,40);
                    lbl[2].setBounds(303,10,70,40);
                    lbl[3].setBounds(390,10,70,40);
                    lbl[4].setBounds(470,10,70,40);
                    lbl[5].setBounds(550,10,70,40);
                    lbl[6].setBounds(630,10,70,40);
                    lbl[7].setBounds(710,10,70,40);
                    lbl[8].setBounds(790,10,70,40);
                    lbl[9].setBounds(870,10,70,40);
                    
                    break;
                case 11:
                 
                    lbl[0].setBounds(90,10,80,40);
                    lbl[1].setBounds(173,10,80,40);
                    lbl[2].setBounds(257,10,80,40);
                    lbl[3].setBounds(340,10,80,40);
                    lbl[4].setBounds(422,10,80,40);
                    lbl[5].setBounds(504,10,80,40);
                    lbl[6].setBounds(586,10,80,40);
                    lbl[7].setBounds(667,10,80,40);
                    lbl[8].setBounds(749,10,80,40);
                    lbl[9].setBounds(831,10,80,40);
                    lbl[10].setBounds(913,10,80,40);
                    
                    break;
               
                case 12:
                    lbl[0].setBounds(49,10,70,40);
                    lbl[1].setBounds(137,10,70,40);
                    lbl[2].setBounds(224,10,70,40);
                    lbl[3].setBounds(303,10,70,40);
                    lbl[4].setBounds(390,10,70,40);
                    lbl[5].setBounds(470,10,70,40);
                    lbl[6].setBounds(550,10,70,40);
                    lbl[7].setBounds(630,10,70,40);
                    lbl[8].setBounds(710,10,70,40);
                    lbl[9].setBounds(790,10,70,40);
                    lbl[10].setBounds(870,10,70,40);
                    lbl[11].setBounds(950,10,70,40);
                    break;
                case 13:
                    lbl[0].setBounds(10,10,80,40);
                    lbl[1].setBounds(90,10,80,40);
                    lbl[2].setBounds(173,10,80,40);
                    lbl[3].setBounds(257,10,80,40);
                    lbl[4].setBounds(340,10,80,40);
                    lbl[5].setBounds(422,10,80,40);
                    lbl[6].setBounds(504,10,80,40);
                    lbl[7].setBounds(586,10,80,40);
                    lbl[8].setBounds(667,10,80,40);
                    lbl[9].setBounds(749,10,80,40);
                    lbl[10].setBounds(831,10,80,40);
                    lbl[11].setBounds(913,10,80,40);
                    lbl[12].setBounds(995,10,80,40);
                    break;
                case 15:
                    lbl[0].setBounds(5,10,70,40);
                    lbl[1].setBounds(77,10,70,40);
                    lbl[2].setBounds(149,10,70,40);
                    lbl[3].setBounds(221,10,70,40);
                    lbl[4].setBounds(293,10,70,40);
                    lbl[5].setBounds(365,10,70,40);
                    lbl[6].setBounds(437,10,70,40);
                    lbl[7].setBounds(509,10,70,40);
                    lbl[8].setBounds(581,10,70,40);
                    lbl[9].setBounds(653,10,70,40);
                    lbl[10].setBounds(725,10,70,40);
                    lbl[11].setBounds(797,10,70,40);
                    lbl[12].setBounds(869,10,70,40);
                    lbl[13].setBounds(941,10,70,40);
                    lbl[14].setBounds(1012,10,70,40);
                    break;
                case 14:
                    lbl[0].setBounds(10,10,70,40);
                    lbl[1].setBounds(87,10,70,40);
                    lbl[2].setBounds(159,10,70,40);
                    lbl[3].setBounds(231,10,70,40);
                    lbl[4].setBounds(303,10,70,40);
                    lbl[5].setBounds(375,10,70,40);
                    lbl[6].setBounds(447,10,70,40);
                    lbl[7].setBounds(519,10,70,40);
                    lbl[8].setBounds(591,10,70,40);
                    lbl[9].setBounds(663,10,70,40);
                    lbl[10].setBounds(735,10,70,40);
                    lbl[11].setBounds(807,10,70,40);
                    lbl[12].setBounds(879,10,70,40);
                    lbl[13].setBounds(951,10,70,40);
                    break;
                default:
                    break;
            }
            repaint();
            validate();
        }
    }
    
    public void resetArray(){
        this.removeAll();
        repaint();
        validate();
    }
    
    public boolean emptyArray(){
        if(lbl == null)
			return true;
		for(JLabel label: lbl) {
			if(label!=null)
				return false;
		}
		return true;
    }
    
    public void animate(int[] array){
      Border border = BorderFactory.createLineBorder(Color.BLACK);
       
        if(array != null) {
            lbl2= new JLabel[array.length];
            for(int i=0; i<array.length;i++){
                String value = Integer.toString(array[i]);
                JLabel label2 = new JLabel(value);
                label2.setFont(new Font("Helvetica", Font.BOLD,11));
                label2.setHorizontalAlignment(JLabel.CENTER);
                label2.setVerticalAlignment(JLabel.CENTER);
                label2.setPreferredSize(new Dimension(80,40));
                label2.setBorder(border);
                lbl2[i]= label2;
               System.out.print(value + " ");
            }
            setLayout(null);
            for(JLabel label2:lbl2){
                add(label2);
            }
            switch (lbl2.length) {
               case 10:
                    
                    lbl2[0].setBounds(137,100,70,40);
                    lbl2[1].setBounds(224,100,70,40);
                    lbl2[2].setBounds(303,100,70,40);
                    lbl2[3].setBounds(390,100,70,40);
                    lbl2[4].setBounds(470,100,70,40);
                    lbl2[5].setBounds(550,100,70,40);
                    lbl2[6].setBounds(630,100,70,40);
                    lbl2[7].setBounds(710,100,70,40);
                    lbl2[8].setBounds(790,100,70,40);
                    lbl2[9].setBounds(870,100,70,40);
                    
                    break;
                case 11:
                    lbl2[0].setBounds(90,100,80,40);
                    lbl2[1].setBounds(173,100,80,40);
                    lbl2[2].setBounds(257,100,80,40);
                    lbl2[3].setBounds(340,100,80,40);
                    lbl2[4].setBounds(422,100,80,40);
                    lbl2[5].setBounds(504,100,80,40);
                    lbl2[6].setBounds(586,100,80,40);
                    lbl2[7].setBounds(667,100,80,40);
                    lbl2[8].setBounds(749,100,80,40);
                    lbl2[9].setBounds(831,100,80,40);
                    lbl2[10].setBounds(913,100,80,40);
                    
                    break;
               
                case 12:
                    lbl2[0].setBounds(49,100,70,40);
                    lbl2[1].setBounds(137,100,70,40);
                    lbl2[2].setBounds(224,100,70,40);
                    lbl2[3].setBounds(303,100,70,40);
                    lbl2[4].setBounds(390,100,70,40);
                    lbl2[5].setBounds(470,100,70,40);
                    lbl2[6].setBounds(550,100,70,40);
                    lbl2[7].setBounds(630,100,70,40);
                    lbl2[8].setBounds(710,100,70,40);
                    lbl2[9].setBounds(790,100,70,40);
                    lbl2[10].setBounds(870,100,70,40);
                    lbl2[11].setBounds(950,100,70,40);
                    break;
                case 13:
                    lbl2[0].setBounds(10,100,80,40);
                    lbl2[1].setBounds(90,100,80,40);
                    lbl2[2].setBounds(173,100,80,40);
                    lbl2[3].setBounds(257,100,80,40);
                    lbl2[4].setBounds(340,100,80,40);
                    lbl2[5].setBounds(422,100,80,40);
                    lbl2[6].setBounds(504,100,80,40);
                    lbl2[7].setBounds(586,100,80,40);
                    lbl2[8].setBounds(667,100,80,40);
                    lbl2[9].setBounds(749,100,80,40);
                    lbl2[10].setBounds(831,100,80,40);
                    lbl2[11].setBounds(913,100,80,40);
                    lbl2[12].setBounds(995,100,80,40);
                    break;
                case 15:
                    lbl2[0].setBounds(5,100,70,40);
                    lbl2[1].setBounds(77,100,70,40);
                    lbl2[2].setBounds(149,100,70,40);
                    lbl2[3].setBounds(221,100,70,40);
                    lbl2[4].setBounds(293,100,70,40);
                    lbl2[5].setBounds(365,100,70,40);
                    lbl2[6].setBounds(437,100,70,40);
                    lbl2[7].setBounds(509,100,70,40);
                    lbl2[8].setBounds(581,100,70,40);
                    lbl2[9].setBounds(653,100,70,40);
                    lbl2[10].setBounds(725,100,70,40);
                    lbl2[11].setBounds(797,100,70,40);
                    lbl2[12].setBounds(869,100,70,40);
                    lbl2[13].setBounds(941,100,70,40);
                    lbl2[14].setBounds(1012,100,70,40);
                    break;
                case 14:
                    lbl2[0].setBounds(10,100,70,40);
                    lbl2[1].setBounds(87,100,70,40);
                    lbl2[2].setBounds(159,50,70,40);
                    lbl2[3].setBounds(231,50,70,40);
                    lbl2[4].setBounds(303,50,70,40);
                    lbl2[5].setBounds(375,50,70,40);
                    lbl2[6].setBounds(447,50,70,40);
                    lbl2[7].setBounds(519,50,70,40);
                    lbl2[8].setBounds(591,50,70,40);
                    lbl2[9].setBounds(663,50,70,40);
                    lbl2[10].setBounds(735,50,70,40);
                    lbl2[11].setBounds(807,50,70,40);
                    lbl2[12].setBounds(879,50,70,40);
                    lbl2[13].setBounds(951,50,70,40);
                    break;
                default:
                    break;
            }
            repaint();
            validate();
        }
    }
       
        


     public void mergeAnimate(int[]array) {
          if (lbl2!=null &&lbl2.length == 10) {
              lbl2[0].setBounds(lbl2[0].getX()-5,lbl2[0].getY()+10,lbl2[0].getWidth(),lbl2[0].getHeight());
              lbl2[1].setBounds(lbl2[1].getX()-5,lbl2[1].getY()+10,lbl2[1].getWidth(),lbl2[1].getHeight());
              lbl2[2].setBounds(lbl2[2].getX()-5,lbl2[2].getY()+10,lbl2[2].getWidth(),lbl2[2].getHeight());
              lbl2[3].setBounds(lbl2[3].getX()-5,lbl2[3].getY()+10,lbl2[3].getWidth(),lbl2[3].getHeight());
              lbl2[4].setBounds(lbl2[4].getX()-5,lbl2[4].getY()+10,lbl2[4].getWidth(),lbl2[4].getHeight());
              
          }
            
        }
     public Timer getTimer() {
         return timer;
     }
     
            public static int[] mergeSort(int[] array) {
       for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
            System.out.println("\n");
        if(array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
       
        int[] left = new int[mid];
        queue.add();
        int[] right=new int[array.length-mid];
        queue.add();
        for(int i=0; i < mid; i++) {
            left[i] = array[i];
        }
        for(int j=0; j < right.length; j++) {  
            right[j] = array[mid+j];
        }
        int[] result = new int[array.length];
        // Recursive call for left and right arrays.
        left = mergeSort(left);
        right = mergeSort(right);
        result = merge(left, right);
        return result;
    }

    public static int[] merge(int[] left, int[] right) {
     int[] result = new int[left.length + right.length];
        int leftPointer, rightPointer, resultPointer;
	leftPointer = rightPointer = resultPointer = 0;
		while(leftPointer < left.length || rightPointer < right.length) {
                if(leftPointer < left.length && rightPointer < right.length) {
		if(left[leftPointer] < right[rightPointer]) {
		result[resultPointer++] = left[leftPointer++];
		} else {
		result[resultPointer++] = right[rightPointer++];
		}		
		}
		else if(leftPointer < left.length) {	
		result[resultPointer++] = left[leftPointer++];	
		}
		else if(rightPointer < right.length) {	
		result[resultPointer++] = right[rightPointer++];
		}	
		}
		return result; 
    }
                private static void printArray(int[] array) {
		
		 for (int i = 0; i < array.length; i++)
                 System.out.print(array[i] + " ");
                 System.out.println("\n");
	}
                
        private JLabel[] getLabel() {
            return lbl2;
        }

}
