import gachamigaV2.GachamigaV2;

public class TestGachamigaV2 {
    @Test
    public void test1(){
        String result = GachamigaV2.resultadoGachamiga(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    public void test2(){
        String result = GachamigaV2.resultadoGachamiga(2);
        Assertions.assertEquals("2", result);
    }

    @Test
    public void test3(){
        String result = GachamigaV2.resultadoGachamiga(3);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void test4(){
        String result = GachamigaV2.resultadoGachamiga(4);
        Assertions.assertEquals("4", result);
    }

    @Test
    public void test5(){
        String result = GachamigaV2.resultadoGachamiga(5);
        Assertions.assertEquals("Miga", result);
    }

    @Test
    public void test6(){
        String result = GachamigaV2.resultadoGachamiga(6);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void test7(){
        String result = GachamigaV2.resultadoGachamiga(7);
        Assertions.assertEquals("7", result);
    }

    @Test
    public void test8(){
        String result = GachamigaV2.resultadoGachamiga(8);
        Assertions.assertEquals("8", result);
    }

    @Test
    public void test9(){
        String result = GachamigaV2.resultadoGachamiga(9);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void test10(){
        String result = GachamigaV2.resultadoGachamiga(10);
        Assertions.assertEquals("Miga", result);
    }

    @Test
    public void test11(){
        String result = GachamigaV2.resultadoGachamiga(11);
        Assertions.assertEquals("11", result);
    }

    @Test
    public void test12(){
        String result = GachamigaV2.resultadoGachamiga(12);
        Assertions.assertEquals("Gacha", result);
    }

    @Test
    public void test13(){
        String result = GachamigaV2.resultadoGachamiga(13);
        Assertions.assertEquals("13", result);
    }

    @Test
    public void test14(){
        String result = GachamigaV2.resultadoGachamiga(14);
        Assertions.assertEquals("14", result);
    }

    @Test
    public void test15(){
        String result = GachamigaV2.resultadoGachamiga(15);
        Assertions.assertEquals("Gachamiga", result);
    }

    @Test
    public void test16(){
        String result = GachamigaV2.resultadoGachamiga(30);
        Assertions.assertEquals("Gachamiga", result);
    }
}
