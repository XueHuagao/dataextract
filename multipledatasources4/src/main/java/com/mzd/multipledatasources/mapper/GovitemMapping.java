package com.mzd.multipledatasources.mapper;

import com.mzd.multipledatasources.pojo.Govitem;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GovitemMapping {
    List<Govitem> list();
    void add(Govitem govitem);
}
