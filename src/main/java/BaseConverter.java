import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число градусов по Цельсию.");
        int celsiusDegrees = scanner.nextInt();

        System.out.println("Напишите \"Кельвины\", если требуется конвертировать в Кельвины.\n" +
                "Напишите \"Фаренгейты\", если конвертировать в Фаренгейты");
        String convertationType = scanner.next();

        convert(celsiusDegrees, convertationType);
    }

    //Метод округляет результат до целого числа
    public static void convert(int celsiusDegrees, String convertationType){
        int resultDegrees;
        switch(convertationType.toUpperCase()){
            case "КЕЛЬВИНЫ":
                resultDegrees = (int) Math.round (celsiusDegrees + 273.15);
                System.out.println(celsiusDegrees + " по Цельсию равняется " + resultDegrees + " по Кельвину");
                break;
            case "ФАРЕНГЕЙТЫ":
                resultDegrees = (int) Math.round (celsiusDegrees * 1.8 + 32);
                System.out.println(celsiusDegrees + " по Цельсию равняется " + resultDegrees + " по Фаренгейту");
                break;
        }
    }
}
