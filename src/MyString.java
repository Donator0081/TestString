import java.util.Arrays;

public class MyString {

    public char get(String s, int number) {
        if (number > 0) {
            char[] chars = s.toCharArray();
            return chars[number];
        } else {
            return 0;
        }
    }


    public char[] get(String s, int from, int to) {
        if (from < to && from >= 0) {
            int temp = 0;
            char[] chars = s.toCharArray();
            char[] newChars = new char[to - from];
            for (int i = from; i < to; i++) {
                newChars[temp] = chars[i];
                temp++;
            }
            return newChars;
        } else {
            return null;
        }
    }

    public char[] set(String s, char letter, int number) {
        if (number >= 0) {
            char[] chars = s.toCharArray();
            chars[number] = letter;
            return chars;
        } else {
            return null;
        }
    }

    public int indexOf(String s, char letter) {
        char[] chars = s.toCharArray();
        int number = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == letter) {
                number = i;
            }
        }
        return number;
    }

    public int contains(String s, char letter) {
        char[] chars = s.toCharArray();
        int number = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == letter) {
                number = 1;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        MyString myString = new MyString();
        String test = "abcdefgh";
        System.out.println(myString.get(test, 3));
        System.out.println(myString.get(test, 2, 4));
        System.out.println("Before set: " + test);
        System.out.print("After set: ");
        System.out.println(myString.set(test, 'f', 3));
        System.out.println(myString.indexOf(test, 'h' ));
        System.out.println(myString.contains(test, 'p' ));
    }
}





















