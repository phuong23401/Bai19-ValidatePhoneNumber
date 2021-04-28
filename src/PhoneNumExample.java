import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumExample {
    private static final String PHONE_NUMBER = "^[0-9]{2}[-|0]{1,2}[0-9]{9}$";

    public PhoneNumExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
