import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by igor
 */
public class Test {

    public static void main(String[] arg) {

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        System.out.println(encoder.encode("1234"));

        class Qwe {
            public boolean test (String testString){
                Pattern p = Pattern.compile("[a-z0-9_+-]+");
                Matcher m = p.matcher(testString);
                return m.matches();
            }

        }
        Qwe qwe = new Qwe();
        String testString = "-+";
        boolean asd = qwe.test(testString);
        if (asd) {
            System.out.println("qwe");
        } else {
            System.out.println("asd");
        }
    }
}
