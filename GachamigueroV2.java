public class GachamigaV2 {
    public static void main(String[] args) {
        GachamigaV2 p = new GachamigaV2();
        p.start();
    }

    void start(){
        for(int i=1;i<=100;i++)
            System.out.println(resultadoGachamiga(i));
    }

    public static String resultadoGachamiga(int i){
        if ((i%3==0)&&(i%5==0))
            return "Gachamiga";
        else if (i%3==0)
            return "Gacha";
       	return "Nada2";
    }
}

