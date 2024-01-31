#include <iostream>

int main() {
  // These lines of code return double and triple a number
  std::cout << "Enter an integer: ";

  int chosenInt{ };
  std::cin >> chosenInt;
  
  std::cout << "Double that number is " << chosenInt*2 << "\n";
  std::cout << "Triple that number is " << chosenInt*3 << "\n";

  // These lines of code return the different and sum of 2 numbers
  int firstInt{ }, secondInt{ }; 
  std::cout << "Enter a number: ";
  std::cin >> firstInt;
  std::cout << "Enter another number: ";
  std::cin >> secondInt;

  std::cout << firstInt << " - " << secondInt << " = " << firstInt-secondInt << "\n";
  std::cout << firstInt << " + " << secondInt << " = " << firstInt+secondInt << "\n";

  return 0;
}
