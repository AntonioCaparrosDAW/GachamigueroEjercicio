public class GachamigaV1 {
    public static void main(String[] args) {
        GachamigaV1 programa = new GachamigaV1();
        programa.start();
    }

    void start(){
        for (int i=1;i<=100;i++){
            if ((i%3==0)&&(i%5==0))
                System.out.println("Gachamiga");
            else if (i%3==0)
                System.out.println("Gacha");
            else if (i%5==0)
                System.out.println("Miga");
            else
                System.out.println(i);
        }
    }
}
