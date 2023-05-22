public class Gachamiguero {
    public static void main(String[] args) {
        Gachamiguero p = new Gachamiguero();
        p.start();
    }

    void start(){
        int i=1;
        do{
            System.out.println(catar(i));
            i++;
        }while(i<100);
    }

    public static String catar(int i){
        boolean a=(i%15==0), b=(i%5==0), c=(i%3==0);
        if(a)
            return "Gachamiga";
        else if(b)
            return "Miga";
        else if(c)
            return "Gacha";
        else
            return ""+i;
    }
}
