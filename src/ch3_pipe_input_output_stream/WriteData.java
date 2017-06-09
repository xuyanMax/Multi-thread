package ch3_pipe_input_output_stream;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by xu on 2017/6/9.
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out) {
        try{
            System.out.println("write: ");
            for(int i=0; i<300; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            System.out.println("");
            out.close();

        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
