package com.elif.Proje7.Repository;

import com.elif.Proje7.entity.Admin;
import static com.elif.Proje7.DataBase.WebDB.*;

public class AdminRepository {
    public void save (Admin admin){
        admins[adminCount++]=admin;
    }

    public Admin[] findAllAdmins(){
        Admin [] adminArray = new Admin[adminCount++];
        for(int i=0; i<adminCount; i++){
            adminArray[i]=admins[i];
        }
        return adminArray;
    }
}
