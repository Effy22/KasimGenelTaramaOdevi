package com.elif.Proje7.entity;

import java.util.UUID;

public class Admin extends User implements IAdmin{
    public Admin() {
        super();
        setIpAdress(UUID.randomUUID().toString());
    }

    public Admin(String userName, String password) {
        super(userName, password);
        setIpAdress(UUID.randomUUID().toString());
    }

    @Override
    public void accessDatas() {
        System.out.println(getUserName() +" verilere erişim için izin aldı.");
    }

    @Override
    public void changeWebDesign() {
        System.out.println(getUserName()+" web sitesinin tasarımını değiştirdi.");
    }

    @Override
    public void changeContent() {
        System.out.println(getUserName()+" içerikleri değiştirdi.");
    }

    @Override
    public void surfWebPages() {
        super.surfWebPages();
        System.out.println(getClass().getSimpleName() + " webde geziniyor.");
    }

    @Override
    public void changeHeader() {
        System.out.println(getClass().getSimpleName()+" başlıkları değiştirdi");
    }
}
