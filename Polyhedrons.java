import java.util.*;
public class Polyhedrons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        for(int i = 0;i<n;i++){
            String s = sc.next();
            if(s.equals("Tetrahedron")){
                count = count + 4;

            }
            if(s.equals("Cube")){
                count+=6;
            }
            if(s.equals("Octahedron")){
                count+=8;
            }
            if(s.equals("Dodecahedron")){
                count+=12;
            }
            if(s.equals("Icosahedron")){
                count+=20;
            }
            
        }
        System.out.println(count);
    }
}
