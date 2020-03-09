package prot;

import com.prot.Application;
import com.prot.User;
import java.util.ArrayList;
import java.util.Vector;

public abstract class Board {
  public String name;
  
  public Integer id;
  
  public String type;
  
  public ArrayList<User> administrators;
  
  public Application myApplication;
  
  public Vector myTemplate;
  
  public void chooseTemplate(Integer id) {}
}


/* Location:              /home/mike/IPLab3/!/prot/Board.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */