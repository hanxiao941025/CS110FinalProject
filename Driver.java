//CS110
//Xiao Han
//Driver class: This class make the whole program work
import javax.swing.JOptionPane;
public class Driver
{
  public static void main(String[] args)
  {
    JOptionPane.showMessageDialog(null,"The rule for the game: The two user have to both reveal the card "
                                       +"first, then they can click the 'fight' button to see the results for each "
                                       +"round.");
     
                                              
    //Start to call the window class and start the game.
    Window window=new Window();
  }
}