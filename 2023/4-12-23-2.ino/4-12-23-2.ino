// Motor always falling down, press button to push it up slightly
// Also LEDs to show an 'energy bar' :D

// 6 leds (digital 2-7)
// pushbutton (digital 8)
// servo motor (digital 9)

#include <Servo.h>
Servo myservo;

int degrees = 90; // what degree the servo should turn to

void setup() {
  // setting all the led pinmode as output and turning it off
  for (int x = 2; x < 8; x++){
    pinMode(x, OUTPUT);
    digitalWrite(x, LOW);
  }
  pinMode(8, INPUT); // push button
  myservo.attach(9); // servo motor
  Serial.begin(9600); // open serial to print values
}

void loop() {
  
  // check if the pushbutton is pressed
  // pressing the button increases the servo degree value
  digitalRead(8)==1 ? degrees+=25 : degrees -= 10;
  
  // converting degrees to which number led should light up
  int led = map(degrees, 0, 180, 0, 6);
  digitalWrite(led, HIGH);
  delay(100);
  digitalWrite(led, LOW);
  
  // making sure degree value stays in the correct range
  if (degrees < 0) {
    degrees = 0;
  } else if (degrees > 180) {
    degrees = 180;
  }
  myservo.write(degrees); // write degrees to the servo
  
  // print values
  Serial.print("degrees: ");
  Serial.print(degrees); // degree the servo turned to
  Serial.print("\t led value: "); 
  Serial.println(led); // number led lights up
}