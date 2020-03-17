import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
public class MenuPanel extends JPanel
{

    JButton addSize, addArray, sort, randArray, reset,exit;
    JComboBox arraySize;
    JTextField arrayTxt;
    JLabel sizeLbl,arrayLbl,sz;
    JLabel[] lbl,lbl2;
    public int size;
    private String[]strArray;
    public int[]array;
    private Integer [] sizeOpt = {10,11,12,13,14,15};
    private MergeSortMain home;
    private CanvasPanel canvas;
  
    int i=0;
    
    public MenuPanel(MergeSortMain home){
        this.home = home;
        this.canvas = new CanvasPanel();
        setBackground(Color.gray);
        setSize(1100, 100);
        
        addSize = new JButton("Add Size");
        addArray = new JButton("Add Array");
        sort = new JButton("Sort");
        randArray = new JButton("Random Array");
        reset = new JButton("Reset");
        arrayLbl = new JLabel("Add Array Size");
        arrayTxt = new JTextField(15);
        arraySize = new JComboBox(sizeOpt);
        sz = new JLabel();
        exit = new JButton("Exit");
        
        
        add(arraySize);
        add(addSize);
        add(arrayLbl);
        add(arrayTxt);
        add(addArray);
        add(sort);
        add(randArray);
        add(reset);
        add(exit);
        
        addSize.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
               setSize();
               JOptionPane.showMessageDialog(null,size);
               
        } });
        addArray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                setSize();
                addArray();
                home.displayArray(array);
        } });
        randArray.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                random();
                home.displayArray(array);
        } });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                reset();
        } });
        sort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
            home.animateArray(array);
         
             canvas.getTimer().start();
            // home.mergeAnimate(array);
               
        } });
         exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {         
        } });
    }
    
    
    public void setSize() {
       size = (Integer)arraySize.getSelectedItem();
    }
    
    public void addArray() {
        setSize();        
        strArray = arrayTxt.getText().split(" ");
        if(size < strArray.length){
            JOptionPane.showMessageDialog(null,"Number of input exceeded limit");
        }
        else if(size > strArray.length){
            JOptionPane.showMessageDialog(null,"Number of input is less than limit");
        }
        else{
            array = new int[strArray.length];
            for (int i=0;i<strArray.length;i++){
                array[i] = Integer.parseInt(strArray[i]);
            }
        }
    }
    
    public void random() {
        Random r = new Random();
        size = (Integer)arraySize.getSelectedItem();
        array = new int[size];  
        for(int i = 0; i < size; i++) {
            array[i] = r.nextInt();
       
        } 
    }
    public void reset(){
        home.resetAll();
    }
    
    public int[] getArray(int[] array) {
        return array;
    }

    
}
