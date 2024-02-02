#include <iostream>

int doubleNumber(int mynum) {
  return mynum*2;
}

int main() {
  int userval;
  std::cout << "Enter a number: ";
  std::cin >> userval;
  std::cout << doubleNumber(userval) << "\n";
  return 0;
}
