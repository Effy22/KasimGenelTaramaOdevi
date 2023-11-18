package com.elif.Proje7.DataBase;

import com.elif.Proje7.entity.Admin;
import com.elif.Proje7.entity.Register;
import com.elif.Proje7.entity.Visitor;

public class WebDB {
    public static Visitor [] visitors=new Visitor[100];
    public static Register[] registers=new Register[5];
    public static Admin[] admins=new Admin[3];

    //Counts

    public static int visitorCount =0;
    public static int registerCount =0;
    public static int adminCount =0;

}
