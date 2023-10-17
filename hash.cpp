#include "hash.h"
#include <iostream>

struct Employee {
  int id;
  int salary;
  char name[10];
};

int getkey(void *data) {
  // Adjust this function based on your actual data structure
  // For simplicity, assuming the data is an Employee struct
  return ((Employee *)data)->id;
}

int main() {
  Hash l(10, &getkey);
  Employee *emp;

  while (true) {
    std::cout << "Menu" << std::endl;
    std::cout << "1. Insert records" << std::endl;
    std::cout << "2. Display all records" << std::endl;
    std::cout << "3. Search by ID" << std::endl;
    std::cout << "4. Delete by ID" << std::endl;
    std::cout << "5. Exit" << std::endl;
    std::cout << "Enter your choice: ";
    int choice;
    std::cin >> choice;

    switch (choice) {
    case 1: {
      int numRecords;
      std::cout << "Enter number of records to insert: ";
      std::cin >> numRecords;

      for (int i = 0; i < numRecords; ++i) {
        emp = new Employee();
        std::cout << "Enter employee ID: ";
        std::cin >> emp->id;
        std::cout << "Enter employee name: ";
        std::cin >> emp->name;
        std::cout << "Enter employee salary: ";
        std::cin >> emp->salary;
        l.insert(emp);
      }
      std::cout << "Insertion Successful" << std::endl;
      break;
    }
    case 2: {
      l.reset();
      while ((emp = (Employee *)l.next()) != nullptr) {
        std::cout << "ID: " << emp->id << ", Name: " << emp->name
                  << ", Salary: " << emp->salary << std::endl;
      }
      break;
    }
    case 3: {
      if (l.isLinkedListEmpty()) {
        std::cout << "No records inserted yet." << std::endl;
      } else {
        bool found = false;
        std::cout << "Enter ID to search: ";
        int searchId;
        std::cin >> searchId;
        l.reset();
        while ((emp = (Employee *)l.next()) != nullptr) {
          if (searchId == emp->id) {
            std::cout << "ID: " << emp->id << ", Name: " << emp->name
                      << ", Salary: " << emp->salary << std::endl;
            found = true;
            break;
          }
        }
        if (!found) {
          std::cout << "Not found" << std::endl;
        }
      }
      break;
    }
    case 4: {
      if (l.isLinkedListEmpty()) {
        std::cout << "No records inserted yet." << std::endl;
      } else {
        bool found = false;
        std::cout << "Enter ID to delete: ";
        int deleteId;
        std::cin >> deleteId;
        l.reset();
        while ((emp = (Employee *)l.next()) != nullptr) {
          if (deleteId == emp->id) {
            l.remove(emp);
            found = true;
            std::cout << "Record deleted successfully" << std::endl;
            break;
          }
        }
        if (!found) {
          std::cout << "Not found" << std::endl;
        }
      }
      break;
    }
    case 5:
      std::cout << "Exiting program." << std::endl;
      exit(0);
    default: {
      std::cout << "Invalid choice. Please try again." << std::endl;
      break;
    }
    }
  }

  return 0;
}
