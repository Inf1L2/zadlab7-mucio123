package pl.edu.ur.oopl7;
import java.util.Random;
public class P2D {
    public int x;
    public int y;    
    public P2D(){
        x=0;
        y=0;
    }
    public P2D(int x, int y){
        this.x=x;
        this.y=y;                
    }
    public int gx(){
        return x;
    }
    public int gy(){
        return y;
    }   
          public P2D losowanie(){
                  Random random = new Random();
                  int a = random.nextInt(21)-10;
                  int b = random.nextInt(21)-10;
                  P2D d = new P2D(a,b);
                  return d;
          }
              public String toString(){
                   return x + "," + y;
              }            
           }    