package com.wang.core.inside.classs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class onClick {
    public static void main(String[] args) {
        JFrame win=new JFrame("猜一猜");
        JPanel pannel=new JPanel();
        JButton btn=new JButton("点我");
        win.add(pannel);
        pannel.add(btn);
        btn.addActionListener(e->{JOptionPane.showMessageDialog(win,"生日快乐");});
        win.setSize(720,480);
        win.setVisible(true);
    }
}
