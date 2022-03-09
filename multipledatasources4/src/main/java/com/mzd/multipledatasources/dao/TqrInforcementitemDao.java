package com.mzd.multipledatasources.dao;

import com.mzd.multipledatasources.mapper.InforcementitemGetMapping;
import com.mzd.multipledatasources.pojo.Inforcementitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TqrInforcementitemDao {
    @Autowired
    private InforcementitemGetMapping inforcementitemGetMapping;
    public List<Inforcementitem> list(){
        return inforcementitemGetMapping.list();
    }
    public void insert(List<Inforcementitem> inforcementitems){
        for(int i=0;i<inforcementitems.size();i++){
            inforcementitemGetMapping.add(inforcementitems.get(i));
        }
    }
}
