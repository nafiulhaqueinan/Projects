package interfaces;

import classes.*;

public interface FoodItemOperations{

	boolean insertFoodItem(FoodItem f);
	
	boolean removeFoodItem(FoodItem f);
	
	FoodItem searchFoodItem(String fid);
	
	void showAllFoodItems();
}





