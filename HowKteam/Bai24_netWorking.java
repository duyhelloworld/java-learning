import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.channels.NetworkChannel;
import java.util.Set;

public class Bai24_netWorking implements NetworkChannel {

    @Override
    public void close() throws IOException {
        System.out.println("Closing...");
    }

    @Override
    public boolean isOpen() {
        return false;
    }

    @Override
    public NetworkChannel bind(SocketAddress arg0) throws IOException {
        return null;
    }

    @Override
    public SocketAddress getLocalAddress() throws IOException {
        return null;
    }

    @Override
    public <T> T getOption(SocketOption<T> arg0) throws IOException {
        return null;
    }

    @Override
    public <T> NetworkChannel setOption(SocketOption<T> arg0, T arg1) throws IOException {
        return null;
    }

    @Override
    public Set<SocketOption<?>> supportedOptions() {
        return null;
    }

    public static void main(String[] args) {
        Bai24_netWorking net = new Bai24_netWorking();
        System.out.println(net.isOpen());
    }
}
