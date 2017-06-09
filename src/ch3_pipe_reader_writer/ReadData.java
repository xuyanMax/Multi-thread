package ch3_pipe_reader_writer;

import java.io.IOException;
import java.io.PipedReader;

/**
 * Created by xu on 2017/6/9.
 */
public class ReadData {
    public void readMethod(PipedReader input) {
        try{
            System.out.println("read: ");

            //difference
            char[] byteArray = new char[20];
            int readLength = input.read(byteArray);

            while (readLength != -1) {
                String newData = new String(byteArray, 0, readLength);
                System.out.print(newData);
                readLength = input.read(byteArray);
            }
            System.out.println("");
            input.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
