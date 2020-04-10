import java.util.Arrays;
import java.util.Iterator;

public class MyString {
    private char[] chars;

    public MyString(char[] chars) {
        this.chars = chars;
    }

    public char get(int index) throws IllegalArgumentException, IndexOutOfBoundsException {
        verifyOutOfBounds(index);
        verifyIllegalArgument(index);
        if (index >= 0) {
            return chars[index];
        } else {
            return 0;
        }
    }


    public void set(char letter, int index) throws IllegalArgumentException, IndexOutOfBoundsException {
        verifyOutOfBounds(index);
        verifyIllegalArgument(index);
        if (index >= 0) {
            chars[index] = letter;
        }
    }

    public int indexOf(char letter) {
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == letter) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(char letter) {
        for (char aChar : chars) {
            if (aChar == letter) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        MyString myString = new MyString("abcdefgh".toCharArray());
        System.out.println(myString.get(3));
        System.out.println("Before set: " + myString.toString());
        System.out.print("After set: ");
        myString.set('x', 3);
        System.out.println(myString.toString());
        System.out.println(myString.indexOf('h'));
        System.out.println(myString.contains('p'));
    }


    private void verifyOutOfBounds(int index) throws IndexOutOfBoundsException {
        if (index >= chars.length)
            throw new IndexOutOfBoundsException("Выходит за границы");

    }

    private void verifyIllegalArgument(int index) throws IllegalArgumentException {
        if (index < 0)
            throw new IllegalArgumentException("Не тот тип переменной");
    }


    @Override
    public String toString() {
        return "MyString{" +
                "chars=" + Arrays.toString(chars) +
                '}';
    }


    class MyStringIterator implements Iterable {
        private int count = 0;


        @Override
        public Iterator iterator() {
            return new Iterator() {
                @Override
                public boolean hasNext() {
                    if (chars.length > count) {
                        return true;
                    } else {
                        count = 0;
                        return false;
                    }
                }

                @Override
                public Character next() throws IndexOutOfBoundsException {
                    verifyOutOfBounds(chars[count]);
                    char nextChar = chars[count];
                    count++;
                    return nextChar;
                }
            };
        }
    }
}





















