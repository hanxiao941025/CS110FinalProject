//CS110
//Xiao Han
/**
  DisplayImage class
  This class will control the image in panel 1 and panel2 and panel3 and panel4
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DisplayImage
{
  /**
    Constructor
    The default value for the image. Actually it is the back image.
  */
  
  private ImageIcon cardImage;
  public DisplayImage()
  {
    cardImage=new ImageIcon("cardpics\\back.jpg");
  }
  
  /**
    Constructor
    This constructor will build the ImageIcon object for the image that should be displayed.
  */
  public DisplayImage(String e)
  {
    if (e.startsWith("2"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\2h.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\2s.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\2d.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\2c.jpg");
      }
    }
    
    else if (e.startsWith("3"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\3h.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\3s.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\3d.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\3c.jpg");
      }
    }
    
    else if (e.startsWith("4"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\4h.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\4s.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\4d.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\4c.jpg");
      }
    }
    
    else if (e.startsWith("5"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\5h.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\5s.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\5d.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\5c.jpg");
      }
    }

    else if (e.startsWith("6"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\6h.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\6s.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\6d.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\6c.jpg");
      }
    }

    else if (e.startsWith("7"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\7h.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\7s.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\7d.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\7c.jpg");
      }
    }

    else if (e.startsWith("8"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\8h.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\8s.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\8d.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\8c.jpg");
      }
    }

    else if (e.startsWith("9"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\9h.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\9s.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\9d.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\9c.jpg");
      }
    }

    else if (e.startsWith("10"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\10h.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\10s.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\10d.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\10c.jpg");
      }
    }

    else if (e.startsWith("11"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\jackh.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\jacks.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\jackd.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\jackc.jpg");
      }
    }

    else if (e.startsWith("12"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\queenh.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\queens.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\queend.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\queenc.jpg");
      }
    }

    else if (e.startsWith("13"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\kingh.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\kings.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\kingd.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\kingc.jpg");
      }
    }

    else if (e.startsWith("14"))
    {
      if (e.endsWith("t"))
      {
        cardImage=new ImageIcon("cardpics\\aceh.jpg");
      }
      else if (e.endsWith("e"))
      {
        cardImage=new ImageIcon("cardpics\\aces.jpg");
      }
      else if (e.endsWith("d"))
      {
        cardImage=new ImageIcon("cardpics\\aced.jpg");
      }
      else
      {
        cardImage=new ImageIcon("cardpics\\acec.jpg");
      }
    }        
  }
  
  
  /**
    returnImage method
    return the image
  */
  public ImageIcon returnImage()
  {
    return cardImage;
  }
  /**
    clear method
    clear the image
  */
  public ImageIcon clear()
  {
    return cardImage=null;
  }
}