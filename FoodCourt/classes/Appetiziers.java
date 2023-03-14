package classes;
import java.lang.*;

public final class Appetiziers extends FoodItem{

  private String size;

 public Appetiziers(){this("fid" ," name", 0, 0.0 , "size");}

  public Appetiziers(String fid , String name,int availableQuantity, double price , String size ){
    super(fid,name, availableQuantity,price);
    this.size = size;
  }

  public void setSize(String size){this.size = size;}
  public String getSize(){return size;}

  public void showInfo(){
    System.out.println("-------------------------------------------\n");
    System.out.println("Food Id  : "+ getFid());
    System.out.println("Food Name  : "+ getName());
    System.out.println("Available Quantity  : "+ getAvailableQuantity());
    System.out.println("Food Price  : "+ getPrice());
  	System.out.println("Food Size  : "+ size);
    System.out.println("-------------------------------------------\n");
  }

}