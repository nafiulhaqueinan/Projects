package classes;
import java.lang.*;
import interfaces.*;

public class Restaurant implements FoodItemOperations {

	private String rid;
	private String name;
	private FoodItem fooditems[]= new FoodItem[500];


	public Restaurant(){};
	public Restaurant( String rid ,String name){
		this.rid = rid;
		this.name = name;
	}

	public void setName(String name){this.name = name;}

	public String getName(){return name;}

	public void setRid(String rid){this.rid = rid;}
	
	public String getRid(){return rid;}

	public boolean CheckFoodItem(String fid31){
		boolean flag=false;
		for(int i=0;i<fooditems.length;i++){
			if (fooditems[i]!=null){
				if(fooditems[i].getFid().equals(fid31)) {
					flag = true;
					break;
				}
			}
			else{flag=false;}

		}
		return flag;
	}

	public boolean insertFoodItem(FoodItem f){
		boolean flag =false;
		for(int i=0; i<fooditems.length; i++){
			if(fooditems[i]==null){
				fooditems[i]=f;
				flag =  true;
				break;
			}
		}
		return flag;
	}
	public boolean removeFoodItem(FoodItem f){
		boolean flag =false;
		for(int i=0; i<fooditems.length; i++){
			if(fooditems[i]==f){
				fooditems[i]=null;
				flag =  true;
				break;
			}
		}
		return flag;

	}
	public FoodItem searchFoodItem(String fid){
		FoodItem f = null;

		for(int i=0 ; i<fooditems.length;i++){
			if(fooditems!=null){
				if(fooditems[i].getFid().equals(fid)){
					f=fooditems[i];
					break;
				}
			}
		}
		return f;
	}
	public void showAllFoodItems(){
		for(int i=0; i<fooditems.length; i++){
			if(fooditems[i] != null){
				fooditems[i].showInfo();
			}
		}
	}


}