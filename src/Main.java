import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//      Programmieren: Array
//      Erstelle ein Array vom Typ String mit einer Länge von 4.
        String[] names = new String[4];

//      Speichere an Index 0 den Wert "Florian".
//      Speichere an Index 1 den Wert "Martin".
//      Speichere an Index 2 den Wert "Dominic".
//      Speichere an Index 3 den Wert "Sara".
        names[0] = "Florian";
        names[1] = "Martin";
        names[2] = "Dominic";
        names[3] = "Sara";

//        Erstelle ein neues Java-Projekt und implementiere die folgenden Schritte. Verwende Schleifen, wenn nötig:
//
//        Schritt 1: Erstelle ein Array mit den Zahlen von 1 bis 10 und gib es auf der Konsole aus.
        int[] numbers1 = {1,2,3,4,5,6,7,8,9,10};
//        Schritt 2: Berechne die Summe aller Zahlen im Array und gib das Ergebnis auf der Konsole aus.

        int sum=0;
        for (int number : numbers1) {
            sum += number;
        }
        System.out.println("Die Summe ist: " + sum);

        //                Schritt 3: Finde die größte Zahl im Array und gib sie auf der Konsole aus.
        int biggest = 0;
        for (int number: numbers1) {
            if (number > biggest) {
                biggest = number;
            }
        }
        System.out.println("The biggest number is " + biggest);


//        Schritt 4: Erstelle ein zweites Array mit den Zahlen von 11 bis 20.
        int[] numbers2 = {11,12,13,14,15,16,17,18,19,20};
//        Schritt 5: Führe eine elementweise Addition der beiden Arrays durch und speichere das Ergebnis in einem dritten Array. Gib das Ergebnisarray auf der Konsole aus.
        int[] addition = new int[10];
        for (int i=0; i <numbers1.length; i++ ) {
            addition[i] = numbers1[i] + numbers2[i];
        }
        System.out.println("The addition array is: " + Arrays.toString(addition));
    }
}