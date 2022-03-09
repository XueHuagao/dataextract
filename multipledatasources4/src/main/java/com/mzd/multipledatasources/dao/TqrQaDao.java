package com.mzd.multipledatasources.dao;

import com.mzd.multipledatasources.mapper.InforcementitemGetMapping;
import com.mzd.multipledatasources.mapper.QaMapping;
import com.mzd.multipledatasources.pojo.Inforcementitem;
import com.mzd.multipledatasources.pojo.Qa;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

@Component
public class TqrQaDao {
    @Autowired
    private QaMapping qaMapping;

    public List<Qa> list() {
        return qaMapping.list();
    }

    //    public void insert(List<Qa> qas){
//        for(int i=0;i<qas.size();i++){
//            qas.add(qas.get(i));
//        }
//    }
    @Autowired
    SqlSessionTemplate sqlSessionTemplate;
    public void insert(List<Qa> qas){
        SqlSession sqlSession = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH,false);
        try{
            QaMapping mapping=sqlSession.getMapper(QaMapping.class);
            for(int i=0;i<qas.size();i++){
                mapping.add(qas.get(i));
                if(i%400==0||i==qas.size()-1){
                    sqlSession.commit();
                    sqlSession.clearCache();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            sqlSession.close();
        }
    }
}
