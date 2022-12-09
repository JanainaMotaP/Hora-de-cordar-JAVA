//Exercicios de Java - Hora de codar


/*public class Exercicio1 {

    public static void main(String[] args){
        String planeta = "Plutão";

        System.out.println(planeta);
    }
}
 */
    
/*public class Exercicio2 {

    public static void main(String[] args){
        try(Scanner ler = new Scanner(System.in)){
            System.out.println("Informe seu nome: ");
            String nome = ler.nextLine();
            System.out.println("Olá, " + nome);
        }
    }

}
*/

/*

public class Exercicio3 {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Informe sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Olá, " + nome + " sua idade é " + idade);

        ler.close();
    }

} */


/* exercicio 4

 * public class Circulo {

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        int raio = ler.nextInt();
        int diametro = raio * raio;
        double pi = 3.14;

        System.out.println("A area do circulo é: " + diametro * pi);
        ler.close();

    }

}
 */

 /*public class Losango {

    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Informe a diagonal maior: ");
        int diagonal_maior = numbers.nextInt();
        System.out.println("Informe a diagonal menor: ");
        int diagonal_menor = numbers.nextInt();
        System.out.println((diagonal_maior * diagonal_menor) / 2);

        numbers.close();
    }

} */

/*public class Paralelograma {

    public static void main(String[] args){
        Scanner ler_base = new Scanner(System.in);
        Scanner ler_altura = new Scanner(System.in);
        System.out.println("Informe a base: ");
        int base = ler_base.nextInt();
        System.out.println("Informe a altura: ");
        int altura = ler_altura.nextInt();
        System.out.println("Valor da área: " + altura*base);

        ler_base.close();
        ler_altura.close();
    }

} */

/*public class Quadrado {

    public static void main(String[] args){
        Scanner lado = new Scanner(System.in);
        System.out.print("Informe o valor do lado: ");
        int valor = lado.nextInt();
        System.out.println("Valor da área: " + valor*valor);

        lado.close();
    }

}
 */

 /*public class Retangulo {

    public static void main(String[] args){
        Scanner ler_base = new Scanner(System.in);
        Scanner ler_altura = new Scanner(System.in);
        System.out.println("Informe a base: ");
        int base = ler_base.nextInt();
        System.out.println("Informe a altura: ");
        int altura = ler_altura.nextInt();
        System.out.println("Valor da área: " + altura*base);

        ler_base.close();
        ler_altura.close();
    }

} */

/*public class Trapezio {

    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Informe a diagonal maior: ");
        int diagonal_maior = numbers.nextInt();
        System.out.println("Informe a diagonal menor: ");
        int diagonal_menor = numbers.nextInt();
        System.out.println("Informe a altura: ");
        int altura = numbers.nextInt();
        System.out.println(((diagonal_maior + diagonal_menor)*altura) / 2);

        numbers.close();
    }

} */

/*public class Triangulo {

    public static void main(String[] args){
        Scanner numbers = new Scanner(System.in);
        System.out.println("Informe a base: ");
        int base = numbers.nextInt();
        System.out.println("Informe a altura: ");
        int altura = numbers.nextInt();
        System.out.println((base * altura) / 2);

        numbers.close();
    }
} */


/* exercicio 5
 * 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um valor: ");
        int valor = scanner.nextInt();

        if(valor > 0){
            System.out.println(valor +" O valor é positivo");
        } else if(valor < 0){
            System.out.println(valor +" O valor é negativo");
        }else{
            System.out.println(valor +" O valor é neutro");
        }

        scanner.close();

    }

}
 */


 /*public class Exercicio6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite outro valor: ");
        int n2 = scanner.nextInt();
        System.out.println("Digite mais um valor: ");
        int n3 = scanner.nextInt();

        int maior = Math.max(n1, Math.max(n2, n3));
        System.out.println("O maior numero é: " + maior);
        scanner.close();

    }
} */


/* exercicio 6.1

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[4];

        for(int i = 0; i < 4; i++){
            System.out.println("Digite um numero: ");
            number[i] = scanner.nextInt();
        }

        int maior = Arrays.stream(number).max().getAsInt();
        System.out.println("O maior numero é: " + maior);

    }
} */

/*
public class Exercicio7 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Digite um numero: ");
        a = scanner.nextInt();
        System.out.println("Digite um numero: ");
        b = scanner.nextInt();
        System.out.println("Digite um numero: ");
        c = scanner.nextInt();

        double result = Math.min(a, Math.min(b,c));
        double valor = a + b + c - result;
        System.out.println("A soma dos dois maiores é: " + valor);

        scanner.close();



    }
}
 */

 /* exercicio 7.1
  * 
  public class Exercicio71 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        int maior1 = 0;
        int maior2 = 0;



        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            number = scanner.nextInt();

            if(number > 0){
                if(number > maior1){
                    if(i >= 1){
                        maior2 = maior1;
                    }
                    maior1 = number;
                }else if(number > maior2){
                    maior2 = number;
                }
            }

        }
        int result = maior1 + maior2;
        System.out.println("A soma dos maiores é: " + result);

    }
}
  */

  /*public class Exercicio8 {

   * public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = scanner.nextInt();

        if (n2 <= 0){
            System.out.print("O numero nao pode ser menor ou igual a 0. Digite outro numero: ");
            n2 = scanner.nextInt();
        }
        System.out.println("O resultado da divisao é: " + (n1 / n2));
    }
}
   */

   /*import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um numero: ");
            numbers[i] = scanner.nextInt();
        }
        for(int j = 0; j < numbers.length; j++){
            sum+= numbers[j];
        }
        int media = sum / 10;
        System.out.println("A soma dos numeros é: " + media);
    }
} */

/*public class Exercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        int sum = 0;

        for(int i = 0; i < 4; i++){
            System.out.print("Digite a nota: ");
            numbers[i] = scanner.nextInt();
        }
        for(int j = 0; j < numbers.length; j++){
            sum+= numbers[j];
        }
        int media = sum/4;
        if(media >= 6){
            System.out.println("Parabéns voce foi aprovado!");
        }else {
            System.out.println("Eita... Você foi reprovado :(");
        }
    }
} */

/*public class Exercicio11 {
    public static void main(String[] args){
        for(int i = 30; i >= 0; i--){
            System.out.println(i);
        }
        System.out.println("BOOOOOM");

    }
} */

/*public class Exercicio12 {
    public static void main(String[] args){
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }

    }
} */

/*public class Exercicio13 {
    public static void main(String[] args){
        int num1;
        int num2;
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Insira um valor: ");
            num1 = scanner.nextInt();
            System.out.print("Insira outro valor: ");
            num2 = scanner.nextInt();
        }
        int num = 0;
        int nuM = num2 - num1;
        int media = 0;

        while(num1 <= num2){
            num = num + num1;
            System.out.println(num);
            num1++;
        }

        media = num/nuM;
        System.out.println("A media aritmetica é: " + media);
    }
} */


/*public class Exercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int i = 0;
        int aprovados = 0;
        String verificar;
        char letra;


        while(i < 1){
            System.out.print("Digite a nota: ");
            n1 = scanner.nextInt();
            System.out.print("Digite a nota: ");
            n2 = scanner.nextInt();
            double media = (n1 + n2) / 2;

            if(media >= 6.5){
                aprovados++;
                System.out.print("Deseja adicionar outro aluno? S/N: ");
                verificar = scanner.next();
                letra = verificar.charAt(0);
                if(letra == 'S'){

                }else if(letra == 'N'){
                    i++;
                }
            } else{
                System.out.print("Deseja adicionar outro aluno? S/N: ");
                verificar = scanner.next();
                letra = verificar.charAt(0);
                if(letra == 'S'){

                }else if(letra == 'N'){
                    i++;
                }
            }
        }
        System.out.println("O total de alunos aprovados é: " + aprovados);
        }


} */

/* */