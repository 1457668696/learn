package com.wang.ip;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class guangbo {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();                   //创建发送对象，发送端口自带默认端口号
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请说:");
            String s = sc.nextLine();

            if ("exit".equals(s)) {
                System.out.println("离线成功");
                socket.close();
                break;
            }
            byte[] buffer = s.getBytes();                     //创建一个数据包
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getByName("255.255.255.255"), 9999);  //封装数据包

            socket.send(packet);                                            //发送（字节，长度，接收端的ip和端口）

        }


    }
}