package ch3_pipe_reader_writer;
import java.io.PipedWriter;

/**
 * Created by xu on 2017/6/9.
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedWriter outputStream;

    public ThreadWrite(WriteData write, PipedWriter outputStream) {
        super();
        this.write = write;
        this.outputStream = outputStream;
    }

    @Override
    public void run() {
        write.writeMethod(outputStream);
    }
}
