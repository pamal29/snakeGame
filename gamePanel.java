
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class gamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT= 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_HEIGHT*SCREEN_WIDTH)/UNIT_SIZE;
    static final int DELAY = 75;
    final int x[]= new int[GAME_UNITS];
    final int y[]= new int[GAME_UNITS];
    int bodyParts = 0;
    int applesEaten = 0;
    int appleX;
    int appleY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random = new Random();

    public gamePanel(){
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new myKeyAdapter());
        startGame();
    }

    public void startGame(){
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

     public void newApple(){
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
    }

   public void draw(Graphics g) {
    g.setColor(Color.RED);
    g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

    g.setColor(Color.GRAY);
    for (int i = 0; i < SCREEN_HEIGHT / UNIT_SIZE; i++) {
        g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, SCREEN_HEIGHT);
        g.drawLine(0, i * UNIT_SIZE, SCREEN_WIDTH, i * UNIT_SIZE);
    }

    System.out.println("Apple drawn at: " + appleX + ", " + appleY);
    }


    public void move(){

    }
    public void checkApple(){

    }
    public void checkCollisions(){

    }
    public void gameOver(Graphics g){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class myKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {

        }
    }
}
