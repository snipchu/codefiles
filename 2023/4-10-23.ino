void setup() {
}

void loop() {
  int potvalue = analogRead(A0);
  int pitch = map(potvalue, 0, 1023, 50, 4000);
  
  tone(8, pitch, 20);
  delay(250);
}
