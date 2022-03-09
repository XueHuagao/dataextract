package com.mzd.multipledatasources.test;

import com.mzd.multipledatasources.bean.TestBean;
import com.mzd.multipledatasources.controller.TransactionController;
import com.mzd.multipledatasources.pojo.*;
import com.mzd.multipledatasources.service.SelectTqrService;
import com.mzd.multipledatasources.service.TransactionService1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RunWith(SpringJUnit4ClassRunner.class)

public class ImportData {

    private SelectTqrService selectTqrService;
    @Test
    public void importAsknew(){
        List<Asknew> asknews=selectTqrService.getAsknewList();
        selectTqrService.insertAsknew(asknews);
    }

    @Test
    public void importGovitem(){
        List<Govitem> govitems=selectTqrService.getGovitemList();
        selectTqrService.insertGovitem(govitems);
    }
    @Test
    public void importQa(){
        List<Qa> qas=selectTqrService.getQaList();
        selectTqrService.insertQa(qas);
    }
    @Test
    public void importAnswer(){
        List<Answer> answers=selectTqrService.getAnswerList();
        selectTqrService.insertAnswer(answers);
    }
    @Test
    public void importInforcementitem(){
        List<Inforcementitem> inforcementitems=selectTqrService.getInforcementList();
        selectTqrService.insertInforcement((inforcementitems));
    }
}
