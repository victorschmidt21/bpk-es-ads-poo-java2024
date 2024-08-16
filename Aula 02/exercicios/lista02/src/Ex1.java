import java.lang.reflect.Array;
import java.util.*;

public class Ex1 {
    public static void ex1() {
        System.out.println("Hello World!!");
    }

    public static void ex2() {
        int number = 5;
        double number2 = 5.8;
        boolean bool = true;
        char ch = 'A';
        System.out.println(number);
        System.out.println(number2);
        System.out.println(bool);
        System.out.println(ch);
    }

    public static void ex3() {
        System.out.println("Digite 2 números");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
    }

    public static void ex4() {
        System.out.println("Digite um número");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("É par");

        } else {
            System.out.println("È impar");
        }
    }

    public static void ex5() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    public static void ex6() {
        int number[] = {5, 5, 5, 5, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
    }

    public static int ex7(int a, int b) {
        return a + b;
    }

    public static void ex8() {
        System.out.println("Digite seu nome");
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void ex9() {
        System.out.println("Digite dois número");
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Digite a operação que deseja fazer: +,-,*,/");
        String operacao = sc.next();
        switch (operacao) {
            case "+":
                System.out.println(num1 + num2);
                break;
            case "-":
                System.out.println(num1 - num2);
                break;
            case "*":
                System.out.println(num1 * num2);
                break;
            case "/":
                System.out.println(num1 / num2);
                break;
        }
    }

    public static void ex10() {
        System.out.println("Digite um número");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = number - 1; i > 2; i--) {
            if (number % i == 0) {
                System.out.println("Não é primo");
                return;
            } else {
                continue;
            }
        }
        System.out.println("È primo");
    }

    public static void ex11() {
        System.out.println("Digite uma palavra");
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        palavra = palavra.toLowerCase();
        StringBuffer buffer = new StringBuffer(palavra);
        buffer.reverse();
        String data = buffer.toString();
        if(palavra.equals(data)) {
            System.out.println("é um palindromo");
        }else{
            System.out.println("Não é um palindromo");
        }

    }
    public static void ex12() {
        Scanner sc = new Scanner(System.in);
        int[] number = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero");
            number[i] = sc.nextInt();
        }
        Arrays.sort(number);
        for (int i = 0; i < 5; i++) {
            System.out.println(number[i]);
        }
    }
    public static void ex13() {
        int sentinela = 0;
        int i = 0;
        Random rand = new Random();
        int number = rand.nextInt(100);
        while (sentinela == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero");
            int num = sc.nextInt();
            if(number > num) {
                System.out.println("é um numero maior");
                i++;
            }else if(number < num){
               System.out.println("é um numero menor");
               i++;
            }else{
                System.out.println("Parabens voce acertou em " + i +" tentativas");
                sentinela = 1;
            }
        }
    }
    public static void ex14() {
        int soma = 0;
        int consoantes;
        System.out.println("Digite uma palavra");
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();
        for(int i=0; i<palavra.length();i++) {
            char c = palavra.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                soma++;
            }else{
                continue;
            }
        }
        consoantes = palavra.length()-soma;
        System.out.println("Vogal: "+soma);
        System.out.println("Consoante: "+consoantes);
    }
    public static int ex15(int x) {
        if(x == 1) {
            return 1;
        }else{
            return x * (ex15(x-1));
        }
    }
    public static void ex16() {
        System.out.println("Digite [F] para converter Fahrenheit ");
        System.out.println("Digite [C] para converter Celsius ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        switch (string) {
            case "F":
                System.out.println("Digite a temperatura em Celsius");
                float celsius = sc.nextFloat();
                celsius = celsius * 9/5 + 32;
                System.out.println("Fahrenheit: "+celsius);
            case "C":
                System.out.println("Digite a temperatura em Fahrenheit");
                float fahrenheit = sc.nextFloat();
                fahrenheit = (float) ((fahrenheit -32) / 1.8);
                System.out.println("Celsius: "+fahrenheit);
        }

    }

}
