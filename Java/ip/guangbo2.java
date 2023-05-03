package com.wang.ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class guangbo2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9999);                      //创建服务端
        byte[] buffer = new byte[1024 * 64];                                          //数据包大小
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);          //封装数据包

        while (true) {
            socket.receive(packet);                               //接受数据包
String ip=packet.getAddress().getHostAddress();
int port=packet.getPort();

            int len = packet.getLength();                          //判断长度

            String s = new String(buffer, 0, len);
            System.out.println(ip+"端口是" + port + "说了：" + s);
        }
    }
}