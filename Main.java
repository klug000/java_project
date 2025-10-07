import java.util.Scanner;

public class Main {

    //написть функцию с параметрами x, y, z и телом которое считает (x / y + y / x) ^ (2 * z ^ 0,5)
    public static double[] make_array1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x: ");
        double x = sc.nextDouble();

        System.out.println("enter y: ");
        double y = sc.nextDouble();

        System.out.println("enter z: ");
        double z = sc.nextDouble();
        double[] array = {x, y, z};
        return array;
    }
    public static double calculate(double[] array) {
        return Math.pow((array[0] / array[1] + array[1] / array[0]), Math.sqrt(2 * array[2]));
    }

    //Написати програму перерахунку величини тимчасового інтервалу, заданого в хвилинах, у величину, виражену в годиннах і хвилинах.
    public static void time(int minutes){
        int hours = minutes / 60;
        int last_minutes = minutes % 60;
        System.out.println( hours + "h " + last_minutes + "m ");
    }

    //Нехай x_0 = с; х_1 = d; x_k = q * x_(k-1) + r * x_(k-2) + b, k = 2, 3, … . Дано дійсні числа q, r, b, c, d, натуральне n ( n >= 2). Отримати х_n.
    public static int[] make_array2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter q: ");
        int q = sc.nextInt();

        System.out.println("enter r: ");
        int r = sc.nextInt();

        System.out.println("enter b: ");
        int b = sc.nextInt();

        System.out.println("enter c: ");
        int c = sc.nextInt();

        System.out.println("enter d: ");
        int d = sc.nextInt();

        System.out.println("enter n (n must be greater than or equal to 2): ");
        int n = sc.nextInt();

        int[] array = {q, r, b, c, d, n};
        return array;
    }
    public static void equation(int[] array){
        float x_k1 = array[4], x_k2 = array[3], x_k = 0, x_result = 0;
        if (array[5] < 2){
            System.out.println("error n < 2");
            return;
        }
        for (int i = 2; i <= array[5]; i++){
            x_k = array[0] * x_k1 + array[1] * x_k2 + array[2];
            x_k2 = x_k1;
            x_k1 = x_k;
            x_result = x_k;
        }
        System.out.println("result = " + x_result);
    }

    //Задано діапазон чисел від -5 до 5. Знайти суму всіх додатніх та добуток від’ємних чисел.
    public static void sum_and_multip(){
        int min = -5, max = 5, sum = 0, multiplication = 1;

        for (int j = min; j <= max; j++){
            if (j >= 0){
                sum = sum + j;
            }
            if (j < 0){
                multiplication = multiplication * j;
            }
        }

        System.out.println("summa = " + sum);
        System.out.println("multiplication = " + multiplication);
    }

    //Нехай х_0 = 1; x_k = (2 - x_k-1^3)/5 , k = 1, 2, … . Знайти перший член х_n , для якого | х_n - х_n-1 | < 10^-5 .
    public static void x_find(){
        double k_1 = 0, k = 1;
        do {
            k_1 = k;
            k = (2 - Math.pow(k_1, 3)) / 5;
        } while (Math.abs(k - k_1) >= Math.pow(10, -5));

        System.out.println("the first member that meets the condition  = " + k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        


        //task 1
        System.out.println("task 1");

        double[] array1 = make_array1();
        double result = calculate(array1);
        System.out.println("result: " + result);



        //task 2
        System.out.println("task 2");

        System.out.println("enter minutes: ");
        int minutes = sc.nextInt();

        time(minutes);



        //task 3
        System.out.println("task 3");

        int[] array2 = make_array2();
        equation(array2);



        //task 4
        System.out.println("task 4");

        sum_and_multip();


        
        //task 5
        System.out.println("task 5");

        x_find();
    }
}
