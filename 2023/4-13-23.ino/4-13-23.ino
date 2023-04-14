// RGB buttons that rotate a servo motor bc im running out of ideas
// I cant do project 9 tho bc i have no battery :(

// 3 pushbuttons (in a voltage ladder, analog 0)
// RGB LED (digital 2,3,4)
// Servo motor (digital 5)

#include <Servo.h>
Servo servo;
int led = 0; // used to determine led color and servo angle

void setup() {
  // set up servo and rotate it to 0 degrees
  servo.attach(5);
  servo.write(0);
}

void loop() {
  // voltage on button
  int buttonval = analogRead(A0);
  
  // change led pin value based on voltage
  if (buttonval == 621) {
    led = 2;
  } else if (buttonval == 580) {
    led = 3;
  } else if (buttonval == 543) {
    led = 4;
  }
  
  // output led color and servo angle
  digitalWrite(led, HIGH);
  servo.write((led-1)*45);
  delay(10);
  digitalWrite(led, LOW);
}