//CS110
//Xiao Han
/**
  Window class: This class will show the window in
  the screen and show the things when the user click different buttons.
*/
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Window extends JFrame
{
  //Variable
  private final int WINDOW_WIDTH=1200;  //Window width
  private final int WINDOW_HEIGHT=500;  //Window height
  //The left "Reveal next card" Button
  private JButton playButton1;
  //Label
  private JLabel label1;
  private JLabel label4;
  private JLabel label2;
  private JLabel label3;
  //The right "Reveal next card" Button
  private JButton playButton2;
  //The two fight button have no difference. The purpose is to make the layout better
  //The left "fight" button
  private JButton fightButton1;
  //The right "Fight" button
  private JButton fightButton2;
  //Call the game object.
  private Game game=new Game();

  //8 panel in the ContentPane      
  private JPanel panel1=new JPanel();
  private JPanel panel2=new JPanel();
  private JPanel panel3=new JPanel();
  private JPanel panel4=new JPanel();
  private JPanel panel5=new JPanel();
  private JPanel panel6=new JPanel();
  private JPanel panel7=new JPanel();
  private JPanel panel8=new JPanel();
  

  /**
    Constructor
    The constructor will finish all the work in this program.
  */
  public Window()
  {
    //Set the title bar text.
    setTitle("War Game");
    
    //Set the size of the window.
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    
    //Specify an action for the close button.
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Add a GridLayout manager to the content pane.
    setLayout(new GridLayout(2,4));
    
    //Call the DisplayImage class in order to show the pictures in the main window. 
    DisplayImage image=new DisplayImage();
    
    setVisible(true);
    //Build the 4 buttons
    playButton1=new JButton("Reveal next card");
    playButton2=new JButton("Reveal next card");
    fightButton1=new JButton("Fight");
    fightButton2=new JButton("Fight");
    
    //Set the two back buttons in each side of the window        
    label1=new JLabel(image.returnImage());
    panel1.add(label1);
        
    label4=new JLabel(image.returnImage());
    panel4.add(label4);     
    
    //Make sure the user will not click the fight button before they reveal the first card
    fightButton1.setVisible(false);
    fightButton2.setVisible(false);
    
    //Reveal next card button
    panel5.add(playButton1);
    playButton1.addActionListener(new playButton1Listener());
    
   //Reveal next card button
    panel8.add(playButton2);
    playButton2.addActionListener(new playButton2Listener());
    

    //The fightButton1 and fightButton2 have no difference
    //The purpose is to make the layout looks good. 
    panel6.add(fightButton1);
    fightButton1.addActionListener(new fightButtonListener());
    panel7.add(fightButton2);
    fightButton2.addActionListener(new fightButtonListener());

    
    
    //Remember to put these parts at the end of the constructor.
    add(panel1);
    add(panel2);
    add(panel3);
    add(panel4);
    add(panel5);
    add(panel6);
    add(panel7);
    add(panel8);    
    
    //So the window can refresh itself
    validate();

    
  }
  
  class playButton1Listener implements ActionListener
  {
    /**
      The actionPerformed method executes when the user1 
      clicks on the playbutton
    */
    public void actionPerformed(ActionEvent e)
    {
      String card=game.getUser1Card();
      //The fightButton start to become visible after the user click the reveal card button
      fightButton1.setVisible(true);
      panel2.removeAll();
      DisplayImage image1=new DisplayImage(card);
      label2=new JLabel(image1.returnImage());
      label2.setText("You still have "+game.getSize1()+" cards");
      panel2.add(label2);
      
      validate();

      
    }
  }
  
  class playButton2Listener implements ActionListener
  {
    /**
      The actionPerformed method executes when the user2
      clicks on the playbutton
    */
    public void actionPerformed(ActionEvent e)
    {
      String card=game.getUser2Card();

      fightButton2.setVisible(true);
      panel3.removeAll();
      
      DisplayImage image2=new DisplayImage(card);
      label3=new JLabel(image2.returnImage());
      label3.setText("You still have "+game.getSize2()+" cards");
      panel3.add(label3);
      
      validate();

                  
      
    }
  }
  
  class fightButtonListener implements ActionListener
  {
    /**
      The actionPerformed method executes when either the user1 or 
      the user2 clicks the button. 
    */
    public void actionPerformed(ActionEvent e)
    {
      //Compares each card between people
      game.war();
      
      panel2.add(label2);
    }
  }
  
      
    
}