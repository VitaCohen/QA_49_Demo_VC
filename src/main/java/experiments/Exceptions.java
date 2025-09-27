package experiments;

public class Exceptions {
    public static void main(String[] args) {
        // типы данных
        // целочисельные int-> Integer
        // с плавающей точкой double -> Double
        // символьный char - > Character
        // boolean -> Boolean

        String[] strArray = {"str1", "str2", "str3"};
        // Boolean[] boolArray = {true, false, True, "true"};
        try {
            pause();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        uncheckedException(strArray);
    }

    private static void uncheckedException(String[]strArray){
        try{
            for (int i = 0; i<5; i++){
                System.out.println(strArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            System.out.println("Created Exception!!!!");
        }
        System.out.println("Programm is working");
    }

    private static void pause() throws InterruptedException {
        checkException();
        System.out.println("pause 3 sec");
    }

    private static void checkException() throws InterruptedException {
        Thread.sleep(3000);

    }


}
