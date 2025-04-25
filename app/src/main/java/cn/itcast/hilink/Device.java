package cn.itcast.hilink;

import java.util.List;

public class Device {

    private String name;          // 设备名称
    private String ip;            // 设备 IP 地址
    private String type;          // 设备类型
    private String mac;           // 设备的 MAC 地址
    private boolean isOnline;     // 设备是否在线
    private long responseTime;    // 响应时间
    private List<Integer> openPorts; // 开放的端口列表

    // 构造方法
    public Device(String name, String ip, String type, String mac, boolean isOnline, long responseTime, List<Integer> openPorts) {
        this.name = name;
        this.ip = ip;
        this.type = type;
        this.mac = mac;
        this.isOnline = isOnline;
        this.responseTime = responseTime;
        this.openPorts = openPorts;
    }

    // Getter 和 Setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public long getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(long responseTime) {
        this.responseTime = responseTime;
    }

    public List<Integer> getOpenPorts() {
        return openPorts;
    }

    public void setOpenPorts(List<Integer> openPorts) {
        this.openPorts = openPorts;
    }

    // 获取设备的信息字符串
    public String getDeviceInfo() {
        return "设备名称: " + name + "\n" +
                "IP 地址: " + ip + "\n" +
                "类型: " + type + "\n" +
                "MAC 地址: " + mac + "\n" +
                "是否在线: " + (isOnline ? "是" : "否") + "\n" +
                "响应时间: " + responseTime + "ms\n" +
                "开放端口: " + openPortsToString();
    }

    // 将开放的端口转换为字符串
    private String openPortsToString() {
        if (openPorts == null || openPorts.isEmpty()) {
            return "无";
        }
        StringBuilder ports = new StringBuilder();
        for (int port : openPorts) {
            ports.append(port).append(", ");
        }
        // 移除最后的逗号和空格
        return ports.substring(0, ports.length() - 2);
    }
}
