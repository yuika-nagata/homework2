public class Menu {

    private final String name;      //商品名
    private final int price;        //単価
    private final int count;        //数量
    private final boolean takeout;  //テイクアウトできるかの真偽

    public Menu(String name,int price,int count,boolean takeout) {   //コンストラクタ
        this.name=name;
        this.price=price;
        this.count=count;
        this.takeout=takeout;
    }


    public boolean getTakeout() {
        return takeout;
    }

    public int getTotalPrice(){   //合計金額
        return count*price;
    }

    static void printTitle(){
        System.out.println("商品名      単価  数量  テイクアウト  金額");
    }

    String conversion(){   //真偽の変換
        if (getTakeout()){
            return "〇";
        }else{
            return "☓";
        }
    }

    void printDate(){
        System.out.println(name+"     "+price+"   "+count+"      "+conversion()+"       "+getTotalPrice());
    }




}

