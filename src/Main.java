public class Main {
    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();

    }
    public static void Task1(){
        System.out.println("Задача №1");
        int q = 0;
        while(q < 10) {
            System.out.print( ++q + " " );
        }
        System.out.println();

        for (; q>0; q--){
            System.out.print(q+ " ");
        }
        System.out.println();
    }

    public static void Task2(){
        System.out.println("Задача №2");

        for(int r = 3; r <= 31; r=r+7){
            System.out.println("Сегодня пятница," + r + "-е число. Необходимо подготовить отчет.\"");
        }
    }

    public static void Task3(){
        System.out.println("Задача №3");
        for( int i = 0; i < 2122; i = i+79)
            if(i>1822){
            System.out.println(i);}
    }
}
