class Formatter {
    public static String format(String value) {
        return "[" + value + "]";
    }
}

public class Kat {
    public static String handle(Formatter f, String s) {
        if("".equals(s)){
            return "(none)";
        }
        return f.format(s.trim());
    }
}