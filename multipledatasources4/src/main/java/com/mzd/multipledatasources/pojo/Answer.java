package com.mzd.multipledatasources.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Answer {
    private int id;
    private int answerid;
    private String title;
    private String source;
    private String area;
    private int enforcementitemid;
    private int qaid;
}
