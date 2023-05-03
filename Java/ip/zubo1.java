package com.wang.ip;

import java.io.IOException;
import java.net.*;

public class zubo1 {
    public static void main(String[] args) throws IOException {
        MulticastSocket socket=new MulticastSocket(6598);                      //创建服务端

//        socket.joinGroup(InetAddress.getByName("224.0.1.1"));
        byte[] buffer=new byte[1024*64];                                          //数据包大小
        DatagramPacket packet=new DatagramPacket(buffer, buffer.length);          //封装数据包

        while (true) {
            socket.receive(packet);                               //接受数据包


            int len = packet.getLength();                          //判断长度

            String s = new String(buffer, 0, len);
            System.out.println("收到了来自" +packet.getSocketAddress()+"对方端口是"+packet.getPort()+"的消息"+s);

        }
    }
}
