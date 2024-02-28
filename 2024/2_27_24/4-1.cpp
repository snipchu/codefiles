#include <iostream>

int main() {
  std::cout << "Enter a number: ";
  int x{};
  std::cin >> x;

  if (x==2 || x==3 ||x==5 || x==7)
    std::cout << "The digit is prime\n";
  return 0;
}
