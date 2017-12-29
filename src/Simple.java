public class Simple {
    public static void main(String[] args) {
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

        short[] mass=new short[101];

        for(short i=101;i<mass.length;i--){
            mass[i]=i;
            System.out.print(mass[i]+"");

        }









    }
}
