package com.elif.Proje7.Repository;
import com.elif.Proje7.entity.Visitor;

import static com.elif.Proje7.DataBase.WebDB.*;
public class VisitorRepository {
    public void save(Visitor visitor){
        visitors[visitorCount++]=visitor;
    }

    public Visitor [] findAllVisitors(){
        Visitor [] visitors1= new Visitor[visitorCount++];
        for(int i=0; i<visitorCount; i++){
            visitors1[i]=visitors[i];
        }
        return visitors1;
    }
}
