package com.wang.ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPtest2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket=new DatagramSocket(8956);                      //创建服务端
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
