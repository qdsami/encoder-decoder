import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr_ru = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я'};
        char[] arr_ru_bigger = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ', 'Э', 'Ю', 'Я'};
        System.out.println("L32 - перемещение влево");
        System.out.println("R32 - перемещение вправо");
//        String answer = in.nextLine();
        String answer = "";
        String answer2 = in.nextLine();
        //R10 L10
        char[] charArray2 = answer2.toCharArray();
        if (Character.toString(charArray2[0]).equals("R") || Character.toString(charArray2[0]).equals("r")){
            answer = "1";
        }else if (Character.toString(charArray2[0]).equals("L") || Character.toString(charArray2[0]).equals("l")){
            answer = "2";
        }
        String key = answer2.substring(1);


        if (Objects.equals(answer, "1")){
            System.out.println("Введите текст!");
            String word = in.nextLine();
            char[] charArray = word.toCharArray();
            String[] words = word.split(" ");
            System.out.printf("Оригинальное: ");
            for (int i = 0; i < word.length(); i++) {
                for (int a = 0; a < arr_ru.length; a++){
                    if (word.charAt(i) == arr_ru[a]){
                        if((Integer.parseInt(key) + a) > 32){
                            charArray[i] = arr_ru[Integer.parseInt(key) + a - 33];
                        }else{
                            charArray[i] = arr_ru[Integer.parseInt(key) + a];
                        }
                    } else if (word.charAt(i) == arr_ru_bigger[a]) {
                        if((Integer.parseInt(key) + a) > 32){
                            charArray[i] = arr_ru_bigger[Integer.parseInt(key) + a - 33];
                        }else{
                            charArray[i] = arr_ru_bigger[Integer.parseInt(key) + a];
                        }
                    }else{
                        charArray[i] = charArray[i];
                    }
                }

                System.out.printf(String.valueOf(word.charAt(i)));

            }
            System.out.println(" ");
            String modifiedString = new String(charArray);
            System.out.println("Измененная строка: " + modifiedString);
        }else if (Objects.equals(answer, "2")){
            System.out.println("Введите текст!");
            String word = in.nextLine();
            char[] charArray = word.toCharArray();
            String[] words = word.split(" ");
            System.out.printf("шифр: ");
            for (int i = 0; i < word.length(); i++) {
                for (int a = 0; a < arr_ru.length; a++){
                    if (word.charAt(i) == arr_ru[a]){
                        if((a - Integer.parseInt(key)) < 0){
                            charArray[i] = arr_ru[a - Integer.parseInt(key) + 33];
                        }else{
                            charArray[i] = arr_ru[a - Integer.parseInt(key)];
                        }
                    } else if (word.charAt(i) == arr_ru_bigger[a]) {
                        if((a - Integer.parseInt(key)) < 0){
                            charArray[i] = arr_ru_bigger[a - Integer.parseInt(key) + 33];
                        }else{
                            charArray[i] = arr_ru_bigger[a - Integer.parseInt(key)];
                        }
                    }else{
                        charArray[i] = charArray[i];
                    }
                }

                System.out.printf(String.valueOf(word.charAt(i)));

            }
            System.out.println(" ");
            String modifiedString = new String(charArray);
            System.out.println("расшифровка: " + modifiedString);
        }else{

        }
    }
}