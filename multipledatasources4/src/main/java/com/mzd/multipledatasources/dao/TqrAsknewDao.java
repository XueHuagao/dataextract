package com.mzd.multipledatasources.dao;

import com.mzd.multipledatasources.mapper.AsknewMapping;
import com.mzd.multipledatasources.pojo.Asknew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TqrAsknewDao {
    @Autowired
    private AsknewMapping asknewMapping;
    public List<Asknew> list(){
        return asknewMapping.list();
    }
    public void insert(List<Asknew> asknews){
        for(int i=0;i<asknews.size();i++){
            asknewMapping.add(asknews.get(i));
        }
    }
}
