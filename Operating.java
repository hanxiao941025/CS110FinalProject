//CS110
//Xiao Han
/**
  Operating class:
    This class will control the data for the user have
*/
import java.util.Random;
import java.util.ArrayList;
public class Operating
{
  //Variable
  //The card for user1
  private ArrayList<String> user1=new ArrayList<String>();
  //The card for user2
  private ArrayList<String> user2=new ArrayList<String>();
  
  
  /**
    Constructor
    The constructor will give each user random 26 cards
  */
  public Operating()
  {
    ArrayList<String> cardList=new ArrayList<String>();
    
    //Show all the cards
    cardList.add("2  heart");
    cardList.add("3  heart");
    cardList.add("4  heart");
    cardList.add("5  heart");
    cardList.add("6  heart");
    cardList.add("7  heart");
    cardList.add("8  heart");
    cardList.add("9  heart");
    cardList.add("10 heart");
    cardList.add("11 heart");
    cardList.add("12 heart");
    cardList.add("13 heart");
    cardList.add("14 heart");

    cardList.add("2  spade");
    cardList.add("3  spade");
    cardList.add("4  spade");
    cardList.add("5  spade");
    cardList.add("6  spade");
    cardList.add("7  spade");
    cardList.add("8  spade");
    cardList.add("9  spade");
    cardList.add("10 spade");
    cardList.add("11 spade");
    cardList.add("12 spade");
    cardList.add("13 spade");
    cardList.add("14 spade");

    cardList.add("2  diamond");
    cardList.add("3  diamond");
    cardList.add("4  diamond");
    cardList.add("5  diamond");
    cardList.add("6  diamond");
    cardList.add("7  diamond");
    cardList.add("8  diamond");
    cardList.add("9  diamond");
    cardList.add("10 diamond");
    cardList.add("11 diamond");
    cardList.add("12 diamond");
    cardList.add("13 diamond");
    cardList.add("14 diamond");

    cardList.add("2  club");
    cardList.add("3  club");
    cardList.add("4  club");
    cardList.add("5  club");
    cardList.add("6  club");
    cardList.add("7  club");
    cardList.add("8  club");
    cardList.add("9  club");
    cardList.add("10 club");
    cardList.add("11 club");
    cardList.add("12 club");
    cardList.add("13 club");
    cardList.add("14 club");

    
    //Riffle the card
    int index;
    Random randomNumbers=new Random();
    int i=26;
    while (i>=1)
    {
      
      index=randomNumbers.nextInt(2*i);
      user1.add(cardList.get(index));
      cardList.remove(index);

      
      index=randomNumbers.nextInt(2*i-1);
      user2.add(cardList.get(index));
      cardList.remove(index);
      i--;
    }       
  }
  
  
  /**
    getUser1Card class
    This class will show the first card for the user1 and remove it
    @return The first card for the user1
  */
  public String getUser1Card()
  {

      String firstcard=user1.get(0);


      return firstcard;
  }
  
  /**
    getUser2Card class
    This class will show the first card for the user2 and remove it
    @return The first card for the user2
  */
  public String getUser2Card()
  {

      String firstcard=user2.get(0);
      return firstcard;
  }
  
  /**
    addUser1Card class
    This class will give a card to user1
    @param e The name of the card which is going to be added
  */
  public void addUser1Card(String e)
  {
    //Adds an item at the last position in an ArrayList Object
    user1.add(e);
  }
  
  /**
    addUser2Card class
    This class will give a card to user2
    @param e The name of the card which is going to be added
  */
  public void addUser2Card(String e)
  {
    user2.add(e);
  }
  
  /**
    removeUser1Card method
    This method will remove the first card from user1
  */
  public void removeUser1Card()
  {
    user1.remove(0);
  }
  
  /**
    removeUser2Card method
    This method will remove the first card from user2
  */
  public void removeUser2Card()
  {
    user2.remove(0);
  }
  
  /**
    getAllCard1 method
    This method will return the String arraylist for the user1
    @return The string arrayList for the user1
  */
  public ArrayList<String> getAllCard1()
  {
    return user1;
  }
  
  /**
    getAllCard2 method
    @return The string arrayList for the user2
  */
  public ArrayList<String> getAllCard2()
  {
    return user2;
  }
  
  /**
    getSize1 method
    @return The size of user1's card
  */
  public int getSize1()
  {
    return user1.size();
  }
  
  /**
    getSize2 method
    @return The size of user2's card
  */
  public int getSize2()
  {
    return user2.size();
  }
  
  /**
    getNumber1 class
    This class will get a int value for user1's card
    @return The user1's card int value
  */
  public int getNumber1()
  {
    String str=getUser1Card().substring(0,2).trim();
    int user1Number=Integer.parseInt(str);
    return user1Number;
  }
  
   /** 
     getNumber2 class
     This class will get a int value for user2's card
     @return The user2's card int value
   */
   public int getNumber2()
   {
     String str=getUser2Card().substring(0,2).trim();
     int user2Number=Integer.parseInt(str);
     return user2Number;
   }

}
