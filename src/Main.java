public class Main {
    public static void main(String[] args) {

        Menu coffee=new Menu("コーヒー",200,2,true);
        Menu kohler=new Menu("コーラー",300,1,true);
        Menu steak=new Menu("ステーキ",900,2,false);


        Menu.printTitle();
        coffee.printDate();
        kohler.printDate();
        steak.printDate();

        int sum= coffee.getTotalPrice()+ kohler.getTotalPrice()+ steak.getTotalPrice();
        System.out.println("合計金額"+sum+"円");

        System.out.println("割引券の発行");


        int total=0;

        for (int i=500; i<=sum; i+=500){   //割引券の枚数計算
            System.out.println("１００円割引券");
            total= i /500;
        }

        System.out.println("合計"+total+"枚");
    }
}