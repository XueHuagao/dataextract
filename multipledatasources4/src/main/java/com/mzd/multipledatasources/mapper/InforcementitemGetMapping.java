package com.mzd.multipledatasources.mapper;

import com.mzd.multipledatasources.pojo.Inforcementitem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InforcementitemGetMapping {
    List<Inforcementitem> list();
    void add(Inforcementitem inforcementitem);
}
