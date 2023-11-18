package com.elif.Proje7.Repository;

import com.elif.Proje7.entity.Register;
import com.elif.Proje7.entity.User;

import static com.elif.Proje7.DataBase.WebDB.*;

public class RegisterRepository {
    public void save (Register register){

        registers[registerCount++]=register;
    }

    public Register findByUserName(String userName){
        for(Register register: registers){
            if(register.getUserName().equalsIgnoreCase(userName)){
                return register;
            }
        }
        return null;
    }

    public Register [] findAllRegisters(){
        Register [] newArray = new Register[registerCount];
        for(int i=0; i<registerCount; i++){
            newArray[i]=registers[i];
        }

        return registers;
    }

}
