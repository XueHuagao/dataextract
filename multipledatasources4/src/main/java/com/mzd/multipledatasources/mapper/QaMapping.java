package com.mzd.multipledatasources.mapper;

import com.mzd.multipledatasources.pojo.Qa;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface QaMapping {
    List<Qa> list();
    void add(Qa qa);
}
