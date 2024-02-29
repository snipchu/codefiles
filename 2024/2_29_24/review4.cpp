#include <iostream>

int main() {
  std::cout << "Enter a double value: ";
  double x{};
  std::cin >> x;
  std::cout << "Enter a double value: ";
  double y{};
  std::cin >> y;
  std::cout << "Enter +, -, *, or /: ";
  char foo{};
  std::cin >> foo;
  int z = static_cast<int>(foo);
  
  if (z==42){
    std::cout << x << " * " << y << " = " << x*y << "\n";
  } else if (z==43) {
    std::cout << x << " + " << y << " = " << x+y << "\n";
  } else if (z==45) {
    std::cout << x << " - " << y << " = " << x-y << "\n";
  } else if (z==47) {
    std::cout << x << " / " << y << " = " << x/y << "\n";
  }

  return 0;
}
