package basic.ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) {
        String oriName = "c:/TEMP/test.jpg";
        String targetName = "c:/TEMP/test2.jpg";

        try(
                InputStream is = new FileInputStream(oriName);
                OutputStream os = new FileOutputStream(targetName);
        ){

            byte[] data = new byte[1024];

            while(true){
                int num = is.read(data);
                if(num == -1) break;
                os.write(data, 0, num);
            }
            os.flush();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}






