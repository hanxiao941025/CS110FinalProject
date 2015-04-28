//CS110
//Xiao Han
/**
  Game class:
  The computer will judge the result under different situations
*/
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Game extends Operating
{

  
  /**
    Constructor
    Super constructor: This super constructor will call the mother class (Operating.java)
  */
  public Game()
  {
    super();
  }
  
   
   /**
     War class
     This class will compare the value of the card
     @return Whether the war will happen or not. 
   */
   public void war()
   {
     int n1=getNumber1();
     int n2=getNumber2(); 
    
     if (n1>n2)
     {
       //Add the two card's name at the end of the queue.
       addUser1Card(getUser1Card());
       addUser1Card(getUser2Card());
       //Then remove the card's name (The first element in the queue).
       removeUser1Card();
       removeUser2Card();              
       JOptionPane.showMessageDialog(null, "user 1 won this round and he will take 1 cards from user 2.");
       
       if (getSize1()==0)
       {
         JOptionPane.showMessageDialog(null,"Game over. User2 won");
       }
       if (getSize2()==0)
       {
         JOptionPane.showMessageDialog(null,"Game over. User1 won");
       }
     }
     else if (n1<n2)
     {
       //Add the two card's name at the end of the queue.
       addUser2Card(getUser2Card());
       addUser2Card(getUser1Card());
       //Then remove the card's name at the end of the queue
       removeUser1Card();
       removeUser2Card();
       JOptionPane.showMessageDialog(null, "user 2 won this round and he will take 1 cards from user 1.");
       if (getSize1()==0)
       {
         JOptionPane.showMessageDialog(null,"Game over. User2 won");
       }
       if (getSize2()==0)
       {
         JOptionPane.showMessageDialog(null,"Game over. User1 won");
       }
       
     }
     
     else if (n1==n2)
     {
         
         ArrayList<String> war=new ArrayList<String>();
         int count=0;

         do
         { 

           war.add(getUser1Card());
           war.add(getUser2Card());

           removeUser1Card();
           removeUser2Card();
           
           if (getSize1()==0)
           {
             JOptionPane.showMessageDialog(null,"Game over. User2 won");
           }
           else if (getSize2()==0)
           {
             JOptionPane.showMessageDialog(null,"Game over. User1 won");
           }
           else
           {
             war.add(getUser1Card());
             war.add(getUser2Card());
             removeUser1Card();
             removeUser2Card();
           }
           
           if (getSize1()==0)
           {
             JOptionPane.showMessageDialog(null,"Game over. User2 won");
           }
           else if (getSize2()==0)
           {
             JOptionPane.showMessageDialog(null,"Game over. User1 won");
           }
           else
           {

             String nn1=getUser1Card().substring(0,2).trim();
                          
             n1=Integer.parseInt(nn1);
             String nn2=getUser2Card().substring(0,2).trim();

             
             n2=Integer.parseInt(nn2);
             war.add(getUser1Card());
             war.add(getUser2Card());
             removeUser1Card();
             removeUser2Card();
 
                          
           }
           if (getSize1()==0)
           {
             JOptionPane.showMessageDialog(null,"Game over. User2 won");
           }
           if (getSize2()==0)
           {
             JOptionPane.showMessageDialog(null,"Game over. User1 won");
           }           
           count++;
         } while(n1==n2 && (getSize1()!=0 && getSize2()!=0));
         int card=2*count+1;
         if (getSize1()!=0 && getSize2()!=0)
         {
           if (n1>n2)
           {
             for (int i=0; i<war.size(); i++)
             {
               String str=war.get(i);
               addUser1Card(str);
             }
             JOptionPane.showMessageDialog(null, "A war happend. User 1 won the war. He will take "
                                           +card+" cards from user 2");
           
           }
           else if(n2>n1)
           {
             for (int i=0; i<war.size(); i++)
             {
               String str=war.get(i);
               addUser2Card(str);
             }
             JOptionPane.showMessageDialog(null, "A war happened. User 2 won the war. He will take "
                                             +card+" cards from user 1.");

           }
         }
       
     }
     
   }
   
}