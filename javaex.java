package java1;

public class javaex {

	public static void main(String[] args) {
		import javax.swing.JOptionPane;
		import java.lang.reflect.Array;
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.List;
		import java.util.Scanner;
		public class Main{
		    public static void main(String[] args) {

//		        Casa casa1 = new Casa("Azul-Marinho","Sobrado",2,true);
//		        casa1.evidenciar();
//		        System.out.println("Houve uma reforma! Nova casa com atualizações --> ");
//		        casa1.setCor("Preto");
//		        casa1.evidenciar();
//		        buble();

		// equals compara os atributos do objeto
		        //List -> interface(recurso com métodos para adcionar na lista, com métodos como ex: o add)
		        // add
		        //get
		        //iterator
		        //listiterator
		        //size
		        //tipos: LinkedList - ArrayList - Vector(ela tem propriedades de elasticidade(manipular a quantidade de valores no array) )
		        //Map = Mapa
		        // Map mapa = new HashMap();
		        // mapa.put("Diretor",



		        //Considerando o material em anexo, resolva os exercícios 77 a 91, utilizando Linguagem Java.
		        //A resolução de cada exercício deve conter:
		        //a) resolução usando array ou vetores
		        //b) resolução usando lista
		        //c) teste de mesa, mostrando o estado das variáveis em cada momento.



		        //arrlist();
		        //ex87();
		        teste();
		    }

		    static void teste(){
		        Scanner sc = new Scanner(System.in);
		        ArrayList<Integer> gg = new ArrayList<>();

		        for(int i = 0; i < 5;i++){
		            System.out.println("Insira o número: ");
		            gg.add(sc.nextInt());
		        }
		        System.out.println(Arrays.toString(gg.toArray()));
		    }




		    static void buble(){
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Quantos números quer no array --> ");
		        int n = sc.nextInt();
		        int[] numeros = new int[n];

		        for (int i = 0;i < numeros.length; i++){
		            System.out.println("Insira os números no Array: ");
		            numeros[i] = sc.nextInt();
		        }
		            for (int i = 0;i < numeros.length; i++){
		            for(int j = i + 1; j < numeros.length;j++){
		                if (numeros[i] > numeros[j]) {
		                    int temporario = numeros[j];
		                    numeros[j] = numeros[i];
		                    numeros[i] = temporario;
		                }
		            }
		        }
		        System.out.println(Arrays.toString(numeros));
		    }

		    static void arrlist(){
		        Scanner sc = new Scanner(System.in);
		        ArrayList<Integer> nums = new ArrayList<>();

		        for(int i = 0;i < 5; i++){
		            nums.add(15);
		        }
		        System.out.println(Arrays.toString(nums.toArray() ));
		    }


		    static void ex87(){
		        Scanner sc = new Scanner(System.in);
		        ArrayList<Integer> vetorD = new ArrayList<>(6);
		        for(int i = 0;i < 5 ;i++){
		            System.out.println("Insira os valores desordenados: ");
		            vetorD.add(sc.nextInt());
		        }
		        for (int markas: vetorD){
		            System.out.println(markas);
		        }
		        for(int i = 0;i< vetorD.size();i++){
		            for(int j = i + 1;j< vetorD.size()-1;j++){
		                if(vetorD.get(i).compareTo(vetorD.get(i+1)) > 0){
		                    int temporario = vetorD.get(i);
		                    vetorD.set(i,vetorD.get(i+1));
		                    vetorD.set(i+1,temporario);
		                }
		            }
		        }
		        System.out.println("O Array ordenado: ");
		        for (int mostra:vetorD){
		            System.out.println(mostra);
		        }

//		        System.out.println("Insira mais um valor: ");
//		        int mais = sc.nextInt();


		    }

		    static void ex77(){
		        int[] V = {5,1,4,2,7,8,3,6};

		        for(int i = 8;i >= 5;i--){
		            int auxiliar = V[i];
		            V[i] =  V[7-i + 1];
		            V[7 - i + 1] = auxiliar;
		        }
		        V[2] = V[0];
		        V[V[2]] = V[V[1]];

		        System.out.println(Arrays.toString(V));

		    }


	}

}
