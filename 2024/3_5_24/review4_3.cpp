#include <iostream>

void theheight(double towerheight, int seconds) {
  double result = towerheight-(9.8*seconds*seconds)/2;
  if (result < 0)
    std::cout << "At " << seconds << " seconds, the ball has touched the ground.\n";
  else
    std::cout << "At " << seconds << " seconds, the ball is at height: " << result << " meters.\n";
}

int main() {
  std::cout << "Enter the height of the tower in meters: ";
  double height;
  std::cin >> height;
  for (int i=0; i<6; i++)
    theheight(height,i);
  return 0;
}
