package chapters.chapter12;

public enum Apple4 {
    Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Cortland(8);

    private int price;

    Apple4(int p){
        price = p;
    }

    Apple4(){
        price = -1;
    }

    public int getPrice(){
        return price;
    }
}
