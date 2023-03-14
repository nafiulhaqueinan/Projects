package interfaces;

import classes.*;

public interface RestaurantOperations{

	boolean insertRestaurant(Restaurant r);

	boolean removeRestaurant(Restaurant r);

	Restaurant searchRestaurant(String rid);

	void showAllRestaurants();
}

