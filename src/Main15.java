import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main15 {
    static void main() {
        Pattern pattern = Pattern.compile(Main14.IP);
        Matcher matcher = pattern.matcher(Main14.cc);
        String res;
        if (matcher.find()) {
            String foundIp = matcher.group();
            res = "Найден корректный IP-адрес: " + foundIp;
        } else {
            res = "Корректного IP-адреса в строке не обнаружено.";
        }
        registerInFile(res);
    }

    static void registerInFile(String ip) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\egor2\\IdeaProjects\\JavaWork\\src\\mm15"))) {
            bufferedWriter.write(ip);
            System.out.println("Информация записанна");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}