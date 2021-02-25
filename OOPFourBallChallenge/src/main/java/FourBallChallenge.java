import processing.core.PApplet;
public class FourBallChallenge extends PApplet{

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    Ball a,b,c,d;
    
    public static void main(String[] args) {
        PApplet.main("FourBallChallenge",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        a=new Ball((HEIGHT/5),1);
        b=new Ball((HEIGHT*2)/5,2);
        c=new Ball(HEIGHT*3/5,3);
        d=new Ball(HEIGHT*4/5,4);
    }
    float x=0;
    @Override
    public void draw() {

        drawCircles();
    }

    private void drawCircles() {
        ellipse(a.x,a.y,a.diameter,a.diameter);
        a.x = a.x+a.speedX;

        ellipse(b.x,b.y,b.diameter,b.diameter);
        b.x = b.x+b.speedX;

        ellipse(c.x,c.y,c.diameter,c.diameter);
        c.x = c.x+c.speedX;

        ellipse(d.x,d.y,d.diameter,d.diameter);
        d.x = d.x+d.speedX;

    }
}
