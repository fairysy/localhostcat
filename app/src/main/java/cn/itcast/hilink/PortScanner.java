package cn.itcast.hilink;
import java.io.IOException;
import java.net.Socket;

public class PortScanner {

    // 扫描某个IP的指定端口
    public static boolean scanPort(String ipAddress, int port) {
        Socket socket = new Socket();
        try {
            socket.connect(new java.net.InetSocketAddress(ipAddress, port), 1000);  // 1秒超时
            socket.close();
            return true;  // 端口开放
        } catch (IOException e) {
            return false;  // 端口关闭
        }
    }

    // 扫描某个设备的一系列端口
    public static String scanDevicePorts(String ipAddress) {
        StringBuilder openPorts = new StringBuilder();
        for (int port = 1; port <= 20000; port++) {  // 示例：扫描80-100端口
            if (scanPort(ipAddress, port)) {
                openPorts.append("Port ").append(port).append(" is open.\n");
            }
        }
        return openPorts.toString();
    }
}
