#include <IRremote.h>
#include <Servo.h> 
#include <LiquidCrystal.h>

LiquidCrystal lcd(13,12,11,10,9,8); 
int RECV_PIN = 6; //Pino infravermelho  
IRrecv irrecv(RECV_PIN);// Pino Habilitado/controle remoto
decode_results results;// valores recebidos controle
Servo myservo;
int red = 3;
int valorFotoResistor=0;
int fotoResistor = A1;
int PIR = 2;
float sensorTemp = A0;

int atual=1;
int valorPIR=0;
int aberto = 0;
int controle = 0;
int Stemp = 0;
int motor = 0;


void setup(){
  irrecv.enableIRIn(); 
  lcd.begin(16,2); 
  pinMode(red, OUTPUT);
  
}


void loop(){
  //Infravermelho
    if (irrecv.decode(&results)) 
  {
    switch (results.value)
    {
     case 0xFD00FF: 
      
  		myservo.attach(5); 
      	myservo.write(0); 
      	lcd.begin(16,2); 
      	lcd.setCursor(0,0);
        lcd.print("Trancado");
      	aberto = 0;
      	motor = 1;
      	controle = 1;
      	delay(100);
        break;
      
     case 0xFD609F:
      if(motor == 1){
		myservo.write(-90);
      	lcd.begin(16,2);
        lcd.setCursor(0,0);
  		lcd.print("Trancado");
      	aberto = 0;
        delay(100);
      	//digitalWrite(red, LOW);
      }
        break;
      
     case 0xFD8877://botao-2
      	Stemp = 1;
      	controle = 1;
        break ;
      
     case 0xFD20DF:
      if(motor == 1){
      	myservo.write(90);
      	lcd.begin(16,2);
      	lcd.setCursor(0,0);
  		lcd.print("Aberto"); 
      	aberto = 1;
   		controle = 1;
        delay(100);
      }
        break; 
  	
      case 0xFD48B7://caso apertar o botão 3
        myservo.detach();
      	motor = 0;
        break ;
 
     case 0xFD08F7:
      	atual = 0;
        break ;
 
    }
    irrecv.resume();
  }
  
  //FOTORESISTOR
  if(aberto == 1){
     valorFotoResistor = analogRead(fotoResistor);
     Serial.println(valorFotoResistor);
     if(valorFotoResistor >=400){//Pouca Luz
     	digitalWrite(red, HIGH);
        delay(100);
       }
       else{//Alta Luz
          digitalWrite(red, LOW);
        }
  }else{
    digitalWrite(red, LOW);
  }
    
  // TEMPERATURA
  if(Stemp== 1 && motor == 0){
      float valor = analogRead(sensorTemp);
      float tensao = (valor/1024)*5;
      float temperatura =(tensao-0.5)*100;
    	lcd.setCursor(0,1);
		lcd.print("      C");
      	lcd.setCursor(0,1);
    	lcd.print(temperatura);
  		delay(1400);

    
  }
  
  
  //Sensor de Distancia
  if(controle == 0){
  valorPIR = digitalRead(PIR);
  if (valorPIR == 1){
     lcd.begin(16,2); 
     lcd.setCursor(0,0);
     lcd.print("Aberto");
    myservo.attach(5); 
    myservo.write(90);
    delay(500);
  } 
   else {
    lcd.setCursor(0,0);
    lcd.print("Fechado");
    myservo.write(-90);
    delay(500);
   } 
  }
  
  
}

