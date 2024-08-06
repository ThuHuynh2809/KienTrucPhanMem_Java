package org.example;



import jdepend.xmlui.JDepend;

import java.io.PrintWriter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend(new PrintWriter("reports/report.xml"));
        depend.addDirectory("D:/KienTrucThucHanhTuan04/Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }
}