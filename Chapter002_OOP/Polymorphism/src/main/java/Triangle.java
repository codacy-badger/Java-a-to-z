/**
 * Class .
 *
 * @author Roman Rusanov
 * @version 0.1
 * @since 11.04.17
 */
public class Triangle implements Shape {
    /**
     * Constant contain end of string for current OS.
     */
    private static final String END_STRING = System.getProperty("line.separator");
    /**
     * @return String with square.
     */
    public String pic() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("  *");
        stringBuilder.append(END_STRING);
        stringBuilder.append(" * *");
        stringBuilder.append(END_STRING);
        stringBuilder.append("*   *");
        return stringBuilder.toString();
    }
}
