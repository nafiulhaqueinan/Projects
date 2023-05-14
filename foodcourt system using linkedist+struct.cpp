#include <iostream>

#include <string>

#include <algorithm>

using namespace std;

struct Product {
  int product_id;
  string product_name;
  float unit_price;
  int available_quantity;
  Product * next;
  Product * prev;
};

Product * head = nullptr;
Product * tail = nullptr;


void showProducts() {
  cout << "Product List:\n";
  Product * current = head;
  while (current != nullptr) {
    cout << "ID: " << current -> product_id << " | Name: " << current -> product_name << " | Price: " << current -> unit_price << " | Quantity: " << current -> available_quantity << endl;
    current = current -> next;
  }
}

void addProduct() {
  Product * p = new Product;
  cout << "Enter product ID: ";
  cin >> p -> product_id;
  cout << "Enter product name: ";
  cin >> p -> product_name;
  cout << "Enter unit price: ";
  cin >> p -> unit_price;
  cout << "Enter available quantity: ";
  cin >> p -> available_quantity;
  p -> next = nullptr;
  p -> prev = nullptr;
  if (head == nullptr) {
    head = p;
    tail = p;
  } else {
    tail -> next = p;
    p -> prev = tail;
    tail = p;
  }
  cout << "Product added successfully!\n";
}

void removeProduct() {
  int id;
  cout << "Enter product ID to remove: ";
  cin >> id;
  Product * current = head;
  while (current != nullptr && current -> product_id != id) {
    current = current -> next;
  }
  if (current != nullptr) {
    if (current == head && current == tail) {
      head = nullptr;
      tail = nullptr;
    } else if (current == head) {
      head = current -> next;
      head -> prev = nullptr;
    } else if (current == tail) {
      tail = current -> prev;
      tail -> next = nullptr;
    } else {
      current -> prev -> next = current -> next;
      current -> next -> prev = current -> prev;
    }
    delete current;
    cout << "Product removed successfully!\n";
  } else {
    cout << "Product not found!\n";
  }
}

void searchProduct() {
  string name;
  cout << "Enter product name to search: ";
  cin >> name;
  Product * current = head;
  while (current != nullptr && current -> product_name != name) {
    current = current -> next;
  }
  if (current != nullptr) {
    cout << "ID: " << current -> product_id << " Name: " << current -> product_name << " Price: " << current -> unit_price << " Quantity: " << current -> available_quantity << endl;
  } else {
    cout << "Product not found!\n";
  }
}

void sortAscending() {
  bool swapped = true;
  while (swapped) {
    swapped = false;
    Product * current = head;
    while (current != nullptr && current -> next != nullptr) {
      if (current -> unit_price > current -> next -> unit_price) {
        Product * temp = current -> next;
        current -> next = temp -> next;
        temp -> prev = current -> prev;
        if (temp -> next != nullptr) {
          temp -> next -> prev = current;
        } else {
          tail = current;
        }
        if (current -> prev != nullptr) {
          current -> prev -> next = temp;
        } else {
          head = temp;
        }
        temp -> next = current;
        current -> prev = temp;
        swapped = true;
      }
      current = current -> next;
    }
  }
  showProducts();
}

void sortDescending() {
  bool swapped = true;
  while (swapped) {
    swapped = false;
    Product * current = head;
    while (current != nullptr && current -> next != nullptr) {
      if (current -> unit_price < current -> next -> unit_price) {
        Product * temp = current -> next;
        current -> next = temp -> next;
        temp -> prev = current -> prev;
        if (temp -> next != nullptr) {
          temp -> next -> prev = current;
        } else {
          tail = current;
        }
        if (current -> prev != nullptr) {
          current -> prev -> next = temp;
        } else {
          head = temp;
        }
        temp -> next = current;
        current -> prev = temp;
        swapped = true;
      }
      current = current -> next;
    }
  }
  showProducts();
}

int main() {
    cout << "\nChoose an option:\n"
             << "1. Show all the products on the list.\n"
             << "2. Add a new product to the list.\n"
             << "3. Remove a product from the list based on product id.\n"
             << "4. Search for a product based on product name.\n"
             << "5. Sort and show products according to Unit Price (Ascending Order).\n"
             << "6. Sort and show products according to Unit Price (Descending Order).\n"
             << "0. Exit the System.\n"
             << "Enter the system : ";
         int n;cin>>n;
         if(n==1){
            showProducts();
            main();
         }
         else if(n==2){
            addProduct();
            main();
         }
         else if(n==3){
            removeProduct();
            main();
         }
         else if(n==4){
            searchProduct();
            main();
         }
         else if(n==5){
            sortAscending();
            main();
         }
         else if(n==6){
            sortDescending();
            main();
         }
         else if(n=0){
            cout<<"exit successful !"<<endl;
         }


return 0;
}
