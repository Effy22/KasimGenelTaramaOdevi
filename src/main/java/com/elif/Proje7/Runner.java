package com.elif.Proje7;

import com.elif.Proje7.Repository.RegisterRepository;
import com.elif.Proje7.entity.Admin;
import com.elif.Proje7.entity.Register;
import com.elif.Proje7.entity.User;
import com.elif.Proje7.entity.Visitor;

public class Runner {
    public static void main(String[] args) {
        Admin admin1=new Admin("elifgur","xklJDH24KD");
        Visitor visitor1 = new Visitor("1","Ahmet","abdDH24K","192.168.123.132.");

       //Polymorphism; Pareng class can take reference of its child classes.
        User user1 =(Admin)admin1;
        User user2 = (Visitor)visitor1;


        Register register1= new Register();
        Register register2= new Register();
        register1.setUserName(user1.getUserName());
        register1.setPassword(user1.getPassword());
        register2.setUserName(user2.getUserName());
        register2.setPassword(user2.getPassword());

        RegisterRepository registerRepository1= new RegisterRepository();
        registerRepository1.save(register1);
        registerRepository1.save(register2);

        Register[] registerArray = registerRepository1.findAllRegisters();
        for(Register register: registerArray){
            System.out.println(register);
        }


    }

}
