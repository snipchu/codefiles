#include <iostream>

void myfunction(int somenumber) {
  std::cout << "You said: " << somenumber << "\n";
}
int main() {
  myfunction(3);
  myfunction(4);
  return 0;
}
