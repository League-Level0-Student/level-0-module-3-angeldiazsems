void setup() {
 
 size(1000,1000);
  
}

void draw() {
  

  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
for (int i = 0; i < 8; i++) {
     ellipse(500,500,(500-i*65),(500-i*65));
  


  //Use an if statement and modulo to alternate the color of your rings.
  if( i %2==0){
    
  fill(#ED1111);
  }
else{

fill(#FFFFFF);
}

}

}
