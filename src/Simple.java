import java.util.Scanner;

public class Simple {



    public static void main(String[] args) {


        //==============================================
        //Четное число
//        int n=6;
//        if(n%2==0){
//            System.out.println("Your number is even");
//        }
//        else{
//            System.out.println("Your number is not even");
//        }

        //Ближайшее число
//        double m=9.8;
//        double n=10.9;
//        int a=10;
//        double m1=Math.abs(a-m);
//        double n1=Math.abs(a-n);
//        if(m1<n1){
//            System.out.println("Число "+m+" ближе к "+a);
//        }
//        if(m1>n1){
//            System.out.println("Число "+n+" ближе к "+a);
//        }
        //Вывести на экран числа от -10 до 25 с помощью всех известных циклов

//        for(int i=-10;i<26;i++){
//            System.out.print(i);
//        }
//
//        int num =26;
//        int b=-11;
//        while(b<num){
//            b++;
//            System.out.print(b);
//        }

        //.Вывести на экран все числа от 1 до 100, которые делятся на 5 без остатка.

//        for(int i=1;i<101;i++){
//            if(i%5==0){
//                System.out.print(i);
//            }
//        }

        //Заполнить массив short типа числами от 100 до 0.

//        short[] mass=new short[101];
//        for(int i=0;i<100;i--){
//           System.out.println(mass[i]+" ");
//        }

//        for(int i=0;i<=3;i++){
//            if(i==5 || i==7){
//                System.out.println(i);
//            }else{
//                System.out.println("else");
//            }
//            System.out.println("fix");
//        }

//                String str ="Был и я среди донцов...\\n\"+\n" +
//                "        \"Была пора: наш праздник молодой...\\n\"+\n" +
//                "        \"В альбом (Гонимый рока самовластьем...)\\n\"+\n" +
//                "        \"В альбом (Долго сих листов заветных...)\\n\"+\n" +
//                "        \"В альбом А. О. Смирновой\\n\"+\n" +
//                "        \"В альбом княжны А. Д. Абамалек\\n\"+\n" +
//                "        \"В альбом Павлу Вяземскому\\n\"+\n" +
//                "        \"В еврейской хижине лампада...\\n\"+\n" +
//                "        \"В крови горит огонь желанья...\\n\"+\n" +
//                "        \"В мои осенние досуги...\\n\"+\n" +
//                "        \"В начале жизни школу помню я...\\n\"+\n" +
//                "        \"В поле чистом серебрится Снег...\\n\";"
//
//             String str2=str.replace();


//            System.out.println("Type any number - ");
//            Scanner in = new Scanner(System.in);
//
//
//            int n = in.nextInt();
//            if(n%2 == 1){
//                System.out.println("Нечетное число");
//            }
//            else if (n%2 == 0){
//                System.out.println("Четное число");
//            }
//        //=======================================================
//            int i=0;
//        System.oui.println(i);
//
   //     firtsMethod();
   //     String str2=firstStringMethod();
//        System.out.println(firstStringMethod());
//        int a=0;//бязательно ини
//        String str="if star";
//        if(str.length()!=0){
//            a=5;
//        }
//
//        System.out.println(a);

        String one="one";
        System.out.println(one);
        String two=firstStringMethod2(one);
        System.out.println(two);


    }

        public static void firtsMethod(){
            int a = 2;
            int b = 5;
            int sum = a + b;
            System.out.println(sum);

        }

//     public static String firstStringMethod() {//переменная типа стринг в методе
//        String str="str";
//        return null;//return str;
//    }

    public static String firstStringMethod2(String str) {//переменная типа стринг в методе
     str=" sv str";
        return str;
    }



}
