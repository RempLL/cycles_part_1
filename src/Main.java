public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        for(int i = 1; i<=10; i++){
            System.out.print("Число: "+i+" ");
        }
        System.out.println();

        System.out.println("Задача 2");
        for(int i = 10;i>=1;i--){
            System.out.print("Число: "+i+" ");
        }
        System.out.println();

        System.out.println("Задача 3");
        for(int i = 0;i<=17;i++){
            if (i%2==0){
            System.out.print("Число: "+i+" ");
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for(int i = 10;i>=-10;i--) {
            System.out.print("Число: " + i + " ");
        }
        System.out.println();

        System.out.println("Задача 5");
        for(int i  = 1904; i<=2096;i+=4){
            System.out.println(i+" год является високосным.");
        }
        System.out.println();

        System.out.println("Задача 6");
        for(int i = 7;i<=98;i=i+7){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Задача 7");
        for(int i = 1;i<=512;i*=2){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Задача 8");
        int contribution = 29000;
        int sumContribution = contribution;
        for(int i = 1;i<=12;i++,sumContribution+=contribution){
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ sumContribution+" рублей.");
        }
        System.out.println();

        System.out.println("Задача 9");
        int contribution9 = 29000;
        int sumContribution9 = contribution;
        int count = 0;
        for(int i = 1;i<=12;i++,sumContribution9+=contribution9) {
            count = sumContribution9 + sumContribution9*i/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + count + " рублей.");
        }
        System.out.println();

        System.out.println("Задача 10");
        for(int i = 1;i<=10;i++){
            System.out.println("2*"+i+"="+i*2);
        }
    }
}