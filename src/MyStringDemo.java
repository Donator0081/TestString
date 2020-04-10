public class MyStringDemo {

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
}
