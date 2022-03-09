package com.mzd.multipledatasources.controller;

import java.util.List;
import java.util.UUID;

import com.mzd.multipledatasources.pojo.Asknew;
import com.mzd.multipledatasources.pojo.Govitem;
import com.mzd.multipledatasources.pojo.Inforcementitem;
import com.mzd.multipledatasources.pojo.Qa;
import com.mzd.multipledatasources.service.SelectTqrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mzd.multipledatasources.bean.TeachersBean;
import com.mzd.multipledatasources.bean.TestBean;
import com.mzd.multipledatasources.dao.TransactionDao2;
import com.mzd.multipledatasources.service.TransactionService1;
import com.mzd.multipledatasources.service.TransactionService2;

/**
 * 多数据源事务测试
 * 
 * @author acer
 *
 */
@RestController
public class TransactionController {
	@Autowired
	private TransactionService1 ts1;
	@Autowired
	private TransactionService2 ts2;

	@Autowired
	private SelectTqrService selectTqrService;

//	@RequestMapping("/savetest.do")
//	public String savetest() {
//		TestBean tb = new TestBean();
//		tb.setId(UUID.randomUUID().toString().replaceAll("-", ""));
//		tb.setScore(70);
//		tb.setClassid("1");
//		tb.setUserid("a");
//		ts1.test01_saveTestBean(tb);
//		return "success";
//	}
//
//	@RequestMapping("/saveteacher.do")
//	public String saveteacher() {
//		TeachersBean tb = new TeachersBean();
//		tb.setId(UUID.randomUUID().toString().replaceAll("-", ""));
//		tb.setTeachername("王老师");
//		tb.setClassid("1");
//		ts2.test02_saveTeachersBean(tb);
//		return "success";
//	}

	@RequestMapping("/tqrtest")
	public String importInforcementItem() {
		selectTqrService.getInforcementitem();

		List<Inforcementitem> inforcementitems = selectTqrService.getInforcementList();
		selectTqrService.insertInforcement(inforcementitems);
		return "inforcement";
	}

	@RequestMapping("/asknew")
	public void importAsknew(){
		List<Asknew> asknews=selectTqrService.getAsknewList();
		selectTqrService.insertAsknew(asknews);
	}

	@RequestMapping("/govitem")
	public void importGovitem(){
		List<Govitem> govitems=selectTqrService.getGovitemList();
		selectTqrService.insertGovitem(govitems);
	}
	@RequestMapping("/qanew")
	public void importQa(){
		List<Qa> qas=selectTqrService.getQaList();
		selectTqrService.insertQa(qas);
	}
}
