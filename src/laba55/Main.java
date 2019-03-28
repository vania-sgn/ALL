package laba55;

public class Main {
    public static void main(String[] args) {
        String s =
                "Как решать ряды. На первом шаге нужно разложить общий член ряда в сумму дробей. Используем метод неопределённых коэффициентов.";
        Text text = new Text(s);
        System.out.println(text);
        System.out.println("+++++++++++++++++++++++++++++++");

        text.sortedSentencesByWordsCount();



    }
}
