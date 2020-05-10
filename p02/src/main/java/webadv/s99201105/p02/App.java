package webadv.s99201105.p02;
import org.apache.commons.codec.digest.DigestUtils;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }else{
            String username="xiaoye";
            String password="8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92";
            if(password.equals(sha256hex(args[1]))&&username.equals(args[0])){
                System.out.println("PASS");
            }else {
                System.out.println("FAIL");
            }
        }
//       System.out.println(sha256hex(args[0]));
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }

}
