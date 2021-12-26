import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Rob2D {
    Link l0, l1, l2;
    JointR JO, JA, JE;
    static String s = "";

    public Rob2D() {
        l0 = new Link(0., 0., 0., 0.);
        l1 = new Link(0., 0., 17., 0.);
        l2 = new Link(0., 17., 5., 0.);
        JO = new JointR(l0, l1);
        JA = new JointR(l1, l2);
        JE = new JointR(l2, l2);
    }

    public void compute() {
        
        
        for (double fi1 = 0.; fi1 <= 6.3; fi1 += 0.1) {
            JO.rotate(fi1);
            JA.translate(JO.getEnd());
            //System.out.println(l1);
            for (double fi2 = 0.; fi2 <= 6.3; fi2 += 0.1) {
                JA.rotate(fi2);
                s += "pline\n";
//                System.out.print("pline\n");
                s += l1;
                s += l2;
                s += '\n';
//                System.out.print(l1);
//                System.out.println(l2);
                //hey
            }
        }
    }

    public static void main(String[] args) {
        Rob2D r = new Rob2D();
        r.compute();
        
        try {
        FileWriter scrietxt = new FileWriter("D:/aaa/bbb/rob2d.scr");
        scrietxt.write(s);
        scrietxt.close();
       
        } catch (IOException e) {
        System.out.println(e);
        }
    }
        
        
    
}
