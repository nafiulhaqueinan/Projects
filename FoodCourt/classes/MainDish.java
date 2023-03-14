package classes;
import java.lang.*;

public final class MainDish extends FoodItem{

  private String category;

  public MainDish(){
  	this("fid" , "name", 0 ,0.0," category");
  }

  public MainDish(String fid , String name,int availableQuantity, double price , String category ){
  	super(fid, name , availableQuantity, price);
  	this.category = category;
  }

  public void setCategory(String category){this.category = category;}
  public String getCategory(){return category;}

  public void showInfo(){
    System.out.println("-------------------------------------------\n\n");
    System.out.println("Food Id  : "+ getFid());
    System.out.println("Food Name  : "+ getName());
    System.out.println("Available Quantity  : "+ getAvailableQuantity());
    System.out.println("Food Price  : "+ getPrice());
  	System.out.println("Food Category  : "+ getCategory());
    System.out.println("-------------------------------------------\n\n");
  }

}