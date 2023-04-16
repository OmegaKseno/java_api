package org.example.sem1.sem2;

import java.io.File;
import java.io.IOException;
import java.util.Locale;

public class Sem1 {
    public static void main(String[] args) throws IOException {
        /*todo Перевод строки в нижний регистр!*/
        String a ="HELLO";
        String b = (a.toLowerCase(Locale.forLanguageTag(a)));
        System.out.println(b);
        /*todo Перевод строки в верхний регистр!*/
         a ="hello";
         b = (a.toUpperCase(Locale.forLanguageTag(a)));
        System.out.println(b);
        /*todo Из массива строк делает строку в параметрах "какой разделитель будет при слипании"*/
        String[] arr ={"H","E","L","L","O"};
        a = String.join(" пробел ",arr);
        System.out.println(a);
        /*todo Для обращению к символу*/
        System.out.println(a.charAt(0));
        /*todo Для вывода нескольких сиволов из строки*/
        int start = 0; //с какого символа начнем выводить
        int end = 5; // на каком законсим
        char [] charArr = new char[end-start];
        a.getChars(start,end,charArr,0);
        System.out.println(charArr);
        /*todo Для сравнения между двумя строками*/
        System.out.println(a.equals(b));//false если разные и true если похожи.
        System.out.println(a.equalsIgnoreCase(b));//не оброщает на заглавные буквы.
        /*todo Для поиска индекса символа в строке*/
        int ind = a.indexOf("Й"); // если он не найдет то выведит -1
        System.out.println(ind);
        /*todo Для опридиления начинается ли строка с этого слова,символа*/
        boolean strBool = a.startsWith("Q");// вернет да или нет.
        System.out.println(strBool);
        /*todo Для опридиления заканчивется ли строка с этого слова,символа*/
        strBool = a.endsWith("O");// вернет да или нет.
        System.out.println(strBool);
        /*todo Для замены символа,слова в строке*/
        String charReplace = a.replace("пробел","()");
        System.out.println(charReplace);
        /*todo Для удаления начальных и конечных пробелов*/
        String strTrim = " Hello ";
        System.out.println(strTrim);
        System.out.println(strTrim.trim());
        /*todo Для раздиления строки в массив по определенному символу*/
        String strSplit = "HelloWorld hello hello hello hello hello hello";
        String[] splitArr = strSplit.split(" ");
        System.out.println(splitArr[0]);
        System.out.println("РАБОТА С ФАЙЛАМИ");
        /*todo +++++++++++++++++++++РАБОТА С ФАЙЛАМИ+++++++++++++++++++++++++*/
        /*import java.io.File;- нужно подтянуть библиотеку*/
        /*todo Для создания виртуального файла */
        File file = new File("temp.txt");
        /*todo Для проверки это директория или файл*/
        System.out.println(file.isDirectory());//Вернет бинар да или нет
        System.out.println(file.isFile());//Вернет бинар да или нет
        /*todo Для проверки существует ли данный файл*/
        System.out.println(file.exists());//Вернет бинар да или нет
        /*todo Для создания  дериктории file.mkdir();
        todo Но в примере создаем файл */
        //import java.io.IOException; - нужно подтянуть библиотеку.
        if(file.exists()){ //Создал условие если данного файла нет то создать его.(что бы не плодить файлы)
            file.createNewFile();//Само создание файла
        }

    }
}
