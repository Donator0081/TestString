import java.util.Arrays;
import java.util.Iterator;

public class MyString {
    private char[] chars;

    public MyString(char[] chars) {
        this.chars = chars;
    }

    public char get(int index) throws IllegalArgumentException, IndexOutOfBoundsException {
        verifyIndexInLength(index);
        verifyPositiveIndex(index);
        return this.chars[index];
    }


    public void set(char letter, int index) throws IllegalArgumentException, IndexOutOfBoundsException {
        verifyIndexInLength(index);
        verifyPositiveIndex(index);
        this.chars[index] = letter;
    }

    public int indexOf(char letter) {
        for (int i = 0; i < this.chars.length; i++) {
            if (this.chars[i] == letter) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(char letter) {
        for (char aChar : this.chars) {
            if (aChar == letter) {
                return true;
            }
        }
        return false;
    }

    public MyStringIterator iterator() {
        return new MyStringIterator();
    }


    private void verifyIndexInLength(int index) throws IndexOutOfBoundsException {
        if (index >= this.chars.length)
            throw new IndexOutOfBoundsException("Выходит за границы");

    }

    private void verifyPositiveIndex(int index) throws IllegalArgumentException {
        if (index < 0)
            throw new IllegalArgumentException("Не тот тип переменной");
    }


    @Override
    public String toString() {
        return "MyString{" +
                "chars=" + Arrays.toString(this.chars) +
                '}';
    }


    class MyStringIterator implements Iterator {
        private int count = 0;

        @Override
        public boolean hasNext() {
            return MyString.this.chars.length > count;
        }


        @Override
        public Character next() {
            char nextChar = MyString.this.chars[count];
            this.count++;
            return nextChar;
        }
    }
}





















