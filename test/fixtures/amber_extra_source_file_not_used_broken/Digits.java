// Nothing calls this class, but cyber-dojo.sh compiles *.java, so the whole
// compilation stops here and the tests never run.
public class Digits {

    public static int count(int n) {
        return String.valueOf(n).length()
    }
}
