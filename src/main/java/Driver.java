import protocols.client.heartbeat.HeartbeatProtocolManager;

import java.io.IOException;

public class Driver {
    public static void main(String[] args) throws IOException {
        new HeartbeatProtocolManager(System.getProperty("myapplication.ip"), 43210, "Test");
    }
}
