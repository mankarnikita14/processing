import processing.core.*;
public class FourBallChallenge extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    public static final int noOfBalls = 4;
    int x[]=new int[noOfBalls];
    int y[]=new int[noOfBalls];
    int xSpeed[]=new int[noOfBalls];

    public static void main(String[] args) {
        PApplet.main("FourBallChallenge", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        for(int i=0;i<noOfBalls;i++){
            x[i]=0;
        }
        for(int i=0;i<noOfBalls;i++){
            y[i]=HEIGHT*(i+1)/5;
        }
        for(int i=0;i<noOfBalls;i++){
            xSpeed[i]=i+1;
        }
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        for(int i = 0; i< noOfBalls; i++){
            ellipse(x[i], y[i], DIAMETER, DIAMETER);
            x[i]=x[i]+xSpeed[i];
        }
    }
}
