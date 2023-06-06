/**
 *
 * @author Elkin Pabon, Modelos Discretos, DCCO ESPE
 */

public class Main {

    public static boolean P(int x) {
        return x % 2 == 0; 
    }
    
    public static void main(String[] args) {
        int x = 4;
        int y = 5;

        boolean proposicion1 = P(x) && P(y); 
        boolean proposicion2 = P(x) || P(y); 
        boolean proposicion3 = !P(x) || P(y); 

        boolean cuantificacion1 = false;
        for (int i = 0; i < 10; i++) {
            if (P(i)) {
                cuantificacion1 = true;
                break;
            }
        }

        boolean cuantificacion2 = true;
        for (int i = 0; i < 10; i++) {
            if (!P(i)) {
                cuantificacion2 = false;
                break;
            }
        }

        System.out.println(proposicion1); 
        System.out.println(proposicion2); 
        System.out.println(proposicion3); 
        System.out.println(cuantificacion1); 
        System.out.println(cuantificacion2); 
    }
}


