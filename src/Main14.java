import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main14 {
    public static final String cc = "Привет пользователь с IP-адресом 123.234.001.111";
    public static final String IP = "(([0 1]\\d\\d|2[0-4]\\d|25[0-5])\\.){3}([0 1]\\d\\d|2[0-4]\\d|25[0-5])";

    void main() {
        String cc = "Привет пользователь с IP-адресом 123.234.001.111";
        String cc1 = "123.234.001.111";
        Pattern IP = Pattern.compile("(([0 1]\\d\\d|2[0-4]\\d|25[0-5])\\.){3}([0 1]\\d\\d|2[0-4]\\d|25[0-5])");
        Matcher M = IP.matcher(cc);
        boolean res = M.find();
        if (res) {
            System.out.println(IP);
        } else {
            System.out.println(IP + " не равен " + cc1);
        }

    }
}


//Лабораторная работа № 14 по разработке программных модулей.
//В строке найти и вывести корректный ip-адрес при помощи регулярных выражений