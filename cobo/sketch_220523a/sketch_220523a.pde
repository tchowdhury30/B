Ball[] balls;
int ballIndex = 0;
void setup() 
{
  
  size(600,600);
  //balls= new Ball[1];
  balls = new Ball[25];
  for (int i=0; i < balls.length; i++) 
    balls[i] = new Ball();
  balls[0].state = Ball.MOVING;
  
 }
 
  void draw ()
  {
    
    background(0);
    
    for (int i=0; i < balls.length; i++) {
      balls[i].draw();
      balls[i].process();
    }
    
  }
  
  void mouseClicked() 
  {
    balls[ballIndex].state = Ball.DEAD;
    ballIndex = ballIndex + 1;
  }
  
  
  class Ball 
  {
    final static int MOVING = 0;
    final static int DEAD = 1;
    float x; float y; float rad; color c; int state; float dx; float dy; 
    
    Ball() {
      float r = random(256);
      float g = random(256);
      float b = random(256);
      c = color(r,g,b);
      rad = 10;
      x = random((width - r) + r/2);
      y = random((height - r) + r/2);
      dx = random(10) - 5;
      dy = random(10) - 5;
      state = MOVING;
    }
    
    void draw()
    {
      if (state != DEAD) {
        ellipseMode(RADIUS);
        fill(c);
        stroke(c);
        ellipse(x, y, rad, rad);
      }
    }
    void move() { x = x + dx; y = y + dy; bounce(); }
    void process() { if (state == MOVING ) move(); }
    
    void bounce() {
      if (x < 0)
        dx = abs(dx);
      if (x > width)
        dx = -1 * abs(dx);
      if (y < 0)
        dy = abs(dy);
      if ( y > height)
        dy = -1 * abs(dy);
    }
  }
  
