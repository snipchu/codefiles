#include "io.h"
#include <iostream>

int readNumber() {
  std::cout << "Enter a number: ";
  int foo{};
  std::cin >> foo;
  return foo;
}

void writeAnswer(int x) {
  std::cout << x << "\n";
}
