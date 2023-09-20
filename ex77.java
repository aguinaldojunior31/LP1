import java.util.Arrays;
import java.util.Scanner;

public class ex77 {

    public static void main(String[] args) {

        int[] v = { 5, 1, 4, 2, 7, 8, 3, 6 };

        for (int i = 8; i >= 5; i--) {
            int auxiliar = v[i];
            v[i] = v[7 - 1 + 1];
            v[7 - i + 1] = auxiliar;
        }
        v[2] = v[0];
        v[v[2]] = v[v[1]];

        System.out.println(Arrays.toString(V));
    }

    public class ex78 {

     public static void main(String[] args) {
     
        int[] v = {1,2,3,4,5,6,7,8,9,10};

        for (int n =10; n >= 1; n--) {
            int auxiliar = v[n];
            v[n] = v[10-1];
            v[10- n + 1] = auxiliar;
        }
        v[1] = v[0];
        v[v[1]] = v[v[0]];

        Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
	    
		if (n < 0) {
			System.out.println("ACHEI");
		}
		else {
			System.out.println("NAO ACHEI");
		}

		sc.close();


        }


        













    }
}



















}
