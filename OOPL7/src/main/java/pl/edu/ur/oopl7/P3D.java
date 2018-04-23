package pl.edu.ur.oopl7;
import java.util.Random;
public class P3D extends P2D{
    private int z;  
    public P3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public P3D() {
    }   
     public int gz(){
        return z;
    }   
    @Override
    public P3D losowanie(){
    Random random = new Random();
    int a = random.nextInt(21)-10;
    int b = random.nextInt(21)-10;
    int c = random.nextInt(21)-10;              
    P3D d = new P3D(a,b,c);
              return d;
    }
    public String toString() {
        return "x=" + this.x + ", y=" + this.y + ", z=" + this.z;
    }
}