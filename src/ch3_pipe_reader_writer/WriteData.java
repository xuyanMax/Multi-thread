package ch3_pipe_reader_writer;

import java.io.IOException;
import java.io.PipedWriter;

/**
 * Created by xu on 2017/6/9.
 */
public class WriteData {
    public void writeMethod(PipedWriter out) {

            try {
                System.out.println("write: ");
                for (int i=0; i<300; i++) {
                    String outData = "" + (i + 1);
                    out.write(outData);
                    System.out.print(outData);
                }
                System.out.println("");
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


    }
}
