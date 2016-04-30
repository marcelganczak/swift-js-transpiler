public class JsDictionaryMethod {

    public static String translate(String method) {
        if(method.equals("count")) {
            return "size";
        }
        if(method.equals("updateValue")) {
            return "updateValue";
        }
        return null;

    }
}
