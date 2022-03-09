package com.mzd.multipledatasources.mapper;

import com.mzd.multipledatasources.pojo.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerMapping {
    List<Answer> list();
    void add(Answer answer);
}
