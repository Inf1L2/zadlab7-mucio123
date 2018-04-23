package pl.edu.ur.oopl7;

public class Main {
    public static void main(String[] args) {
    P2D[] tab2D = new P2D[100];
        P3D[] tab3D = new P3D[100];

        for(int i = 0; i<100;i++){
            tab2D[i] = new P2D().losowanie();
            tab3D[i] = new P3D().losowanie();
        }
        for(int i=0;i<100;i++){
            if (tab2D[i].gx() == tab3D[i].gx() && tab2D[i].gy() == tab3D[i].gy())
            {
            System.out.println(tab2D[i].toString()+" | "+tab3D[i].toString());
            }}
        
        
    

    
    }
}
}