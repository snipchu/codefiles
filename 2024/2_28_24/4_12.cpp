#include <iostream>

int main() {
  std::cout << "Enter a character: ";
  char x{};
  std::cin >> x;
  int code{x};
  std::cout << "You entered \'" << x << "\', which has ASCII code " << code << "\n";
  return 0;
}
