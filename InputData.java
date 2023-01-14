package homework_exceptions;

import java.util.Scanner;
/*
 * Фамилия Имя Отчество датарождения номертелефона пол
Форматы данных:
фамилия, имя, отчество - строки
дата_рождения - строка формата dd.mm.yyyy
номер_телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.
 */
public class InputData {
    private String userData;

    public void inputData() {
        System.out.println("Введите Фамилию, имя, отчество, дату рождения, номер телефона, пол (m или f) одной строкой через пробелы\n например: Иванов Иван Иванович 21.11.2001 9839564511 m");
        Scanner keyboard = new Scanner(System.in);
        this.userData = keyboard.nextLine();
        keyboard.close();
    }

    public String getUserData() {
        return this.userData;
    }

}
