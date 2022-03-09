package com.mzd.multipledatasources.dao;

import com.mzd.multipledatasources.mapper.AnswerMapping;
import com.mzd.multipledatasources.mapper.InforcementitemGetMapping;
import com.mzd.multipledatasources.pojo.Answer;
import com.mzd.multipledatasources.pojo.Inforcementitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TqrAnswerDao {
    @Autowired
    private AnswerMapping answerMapping;
    public List<Answer> list(){
        return answerMapping.list();
    }
    public void insert(List<Answer> answers){
        for(int i=0;i<answers.size();i++){
            answerMapping.add(answers.get(i));
        }
    }
}
