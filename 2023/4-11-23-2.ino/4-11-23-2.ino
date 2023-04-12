// This ino code is a modified version of project 8 (hourglass) in the Arduino starter kit
// Tilting the sensor will make the led "fall" in that direction

// 6 leds (analog 2-7)
// tilt sensor (analog 8)

// 2 variables for switch states to check if it has changed
int switchState = 0;
int prevSwitchState = 1;

int led = 7;  // led variable to increment or decrement

void setup() {
  // for loop that assignments pins 2-7 as output
  for (int pinnum = 2; pinnum < 8; pinnum++) {
    pinMode(pinnum, OUTPUT);
  }

  pinMode(8, INPUT); // pin 8 is the tilt sensor
}

void loop() {
  // state of tilt sensor
  switchState = digitalRead(8);

  // incrementing ot decrementing the led value based on if the switch state has changed
  switchState == prevSwitchState ? led-- : led++;

  // making sure the led value doesn't go below 2 or above 7
  if (led == 1) {
    led = 2;
  } else if (led == 8) {
    led = 7;
  }

  // write new location onto leds
  digitalWrite(led, HIGH);
  delay(150);
  digitalWrite(led, LOW);
}
