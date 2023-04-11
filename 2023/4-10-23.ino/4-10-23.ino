// This arduino code is a modified version of project 6 (Light Theremin) in the Arduino starter kit
// You need a potentiometer (analog A0) and a piezo (Digital 8)

void setup() {
}

void loop() {
  int potvalue = analogRead(A0);
  int pitch = map(potvalue, 0, 1023, 50, 4000);
  
  tone(8, pitch, 20);
  delay(250);
}
