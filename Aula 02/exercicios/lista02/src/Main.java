import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ex1 ex1 = new Ex1();

        System.out.println("Digite o número do exercício que deseja corrigir");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                ex1.ex1();
                break;
            case 2:
                ex1.ex2();
                break;
            case 3:
                ex1.ex3();
                break;
            case 4:
                ex1.ex4();
                break;
            case 5:
                ex1.ex5();
                break;
            case 6:
                ex1.ex6();
                break;
            case 7:
                System.out.println(ex1.ex7(5, 5));
                break;
            case 8:
                ex1.ex8();
                break;
            case 9:
                ex1.ex9();
                break;
            case 10:
                ex1.ex10();
                break;
            case 11:
                ex1.ex11();
                break;
            case 12:
                ex1.ex12();
                break;
            case 13:
                ex1.ex13();
                break;
            case 14:
                ex1.ex14();
                break;
            case 15:
                System.out.println("Digite um numero");
                int x = sc.nextInt();
                System.out.println(ex1.ex15(x));
                break;
            case 16:
                ex1.ex16();
                break;
        }
    }
}