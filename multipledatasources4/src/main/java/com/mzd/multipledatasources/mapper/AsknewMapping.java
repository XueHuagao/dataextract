package com.mzd.multipledatasources.mapper;

import com.mzd.multipledatasources.pojo.Asknew;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AsknewMapping {
    List<Asknew> list();
    void add(Asknew asknew);
}
