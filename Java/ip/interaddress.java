package com.wang.ip;

import java.net.InetAddress;

public class interaddress {
    public static void main(String[] args) throws Exception {          //ipconfig          ping
                                                                      //获取本机ip地址和名字
        InetAddress ip1=InetAddress.getLocalHost();
        System.out.println(ip1.getHostName());
        System.out.println(ip1.getHostAddress());

        InetAddress ip2=InetAddress.getByName("xyjxww.cn");       //通过域名或者IP地址获得域名/ip地址。
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        InetAddress ip3=InetAddress.getByName("106.55.7.113");
        System.out.println(ip2.getHostName());
        System.out.println(ip2.getHostAddress());

        System.out.println(ip3.isReachable(5000));                  //判断是否能联通网络，超时显示

                                                                          //默认端口号，http80 ftp21 注册端口mysql 3306  tomat8080


                                                                         //传输层  TCP，面向链接的可靠通行。三次握手，链接安全，链接效率低，可传大量数据。请求、回应，再次请求，确认....取消链接是第四次握手
                                                                         //       UDP，无连接、不可靠。每个包64KB，直接封装本地，目的，端口，不需要确认直接发送，无需释放，开销小，数据快。不安全容易丢失





    }
}