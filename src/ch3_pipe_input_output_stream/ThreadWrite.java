package ch3_pipe_input_output_stream;

import java.io.PipedOutputStream;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream outputStream;

    public ThreadWrite(WriteData write, PipedOutputStream outputStream) {
        super();
        this.write = write;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        write.writeMethod(outputStream);
    }
}
