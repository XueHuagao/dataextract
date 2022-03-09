package com.mzd.multipledatasources.dao;

import com.mzd.multipledatasources.mapper.GovitemMapping;
import com.mzd.multipledatasources.pojo.Govitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TqrGovitemDao {
    @Autowired
    private GovitemMapping govitemMapping;
    public List<Govitem> list(){
        return govitemMapping.list();
    }
    public void insert(List<Govitem> govitems){
        for(int i=0;i<govitems.size();i++){
            govitemMapping.add(govitems.get(i));
        }
    }
}
