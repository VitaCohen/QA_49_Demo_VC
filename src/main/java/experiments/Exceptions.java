package experiments;

public class Exceptions {
    public static void main(String[] args){
        // типы данных
        // целочисельные int-> Integer
        // с плавающей точкой double -> Double
        // символьный char - > Character
        // boolean -> Boolean

        String [] strArray = {"str1", "str2", "str3"};
        // Boolean[] boolArray = {true, false, True, "true"};


    }

    private static void pause() throws InterruptedException {
        checkException();
        System.out.println();
    }
    
    private   static  void  checkException() throws InterruptedException {
        Thread.sleep(3000);

    }


}
