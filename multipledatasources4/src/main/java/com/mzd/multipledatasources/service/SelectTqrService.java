package com.mzd.multipledatasources.service;


import com.mzd.multipledatasources.dao.*;
import com.mzd.multipledatasources.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SelectTqrService {
    @Autowired
    private TqrInforcementitemDao tqrInforcementitemDao;
    @Autowired
    private TqrAsknewDao tqrAsknewDao;
    @Autowired
    private TqrGovitemDao tqrGovitemDao;
    @Autowired
    private TqrQaDao tqrQaDao;
    @Autowired
    private TqrAnswerDao tqrAnswerDao;

    @Transactional
    public void getInforcementitem() {
        System.out.println("get from tqr");
    }

    @Transactional
    public List<Inforcementitem> getInforcementList() {
        return tqrInforcementitemDao.list();
    }

    @Transactional
    public void insertInforcement(List<Inforcementitem> inforcementitems) {
        tqrInforcementitemDao.insert(inforcementitems);
    }

    //Asknew
    public List<Asknew> getAsknewList() {
        return tqrAsknewDao.list();
    }
    public void insertAsknew(List<Asknew> asknews){
        tqrAsknewDao.insert(asknews);
    }

    //Govitem
    public List<Govitem> getGovitemList(){
        return tqrGovitemDao.list();
    }
    public void insertGovitem(List<Govitem> govitems){
        tqrGovitemDao.insert(govitems);
    }

    //Qa
    public List<Qa> getQaList(){return tqrQaDao.list();}
    public void insertQa(List<Qa> qas){tqrQaDao.insert(qas);}

    //Answer
    public List<Answer> getAnswerList(){return tqrAnswerDao.list();}
    public void insertAnswer(List<Answer> answers){tqrAnswerDao.insert(answers);}
}
