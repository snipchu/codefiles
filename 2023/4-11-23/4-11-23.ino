// Arduino code that changes the RGB values of a LED
// Things u need: 3 Potentiometers (A0 - A2), RGB LED (3,5,6 respectively)

void setup() {
  pinMode(3, OUTPUT); // R
  pinMode(5, OUTPUT); // G
  pinMode(6, OUTPUT); // B
  
  Serial.begin(9600);
}

void loop() {
  
  // convert raw pot values to correct 'scale'
  int redPotValue = map(analogRead(A0), 0, 1023, 0, 255);
  int greenPotValue = map(analogRead(A1), 0, 1023, 0, 255);
  int bluePotValue = map(analogRead(A2), 0, 1023, 0, 255);
  
  // print potentiometer values to serial
  Serial.print("red: ");
  Serial.print(redPotValue);
  Serial.print("\tgreen: ");
  Serial.print(greenPotValue);
  Serial.print("\tblue: ");
  Serial.println(bluePotValue);
  
  // write the values to the LED
  digitalWrite(3, redPotValue);
  digitalWrite(5, greenPotValue);
  digitalWrite(6, bluePotValue);
}
