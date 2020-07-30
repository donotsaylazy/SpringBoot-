package com.amos.springbootstudy.model;

import java.util.List;

public class JsonPojo {


    /**
     * 提醒人员 : 任务执行用户
     * 提醒方式 : ["邮件","短信","IVR语音"]
     * 提醒频次 : 每日
     * 提醒时间 : 09:00
     * 提醒样例 : 尊敬的张XX，您好，您YYYY年MM月DD收到的“XXXXX”任务，截止至今日XX条线还有XX个业务指标未完成，任务还有X天失效，请尽快前往智慧运营平台查看详细并处理，谢谢。
     */

    private String 提醒人员;
    private String 提醒频次;
    private String 提醒时间;
    private String 提醒样例;
    private List<String> 提醒方式;

    public String get提醒人员() {
        return 提醒人员;
    }

    public void set提醒人员(String 提醒人员) {
        this.提醒人员 = 提醒人员;
    }

    public String get提醒频次() {
        return 提醒频次;
    }

    public void set提醒频次(String 提醒频次) {
        this.提醒频次 = 提醒频次;
    }

    public String get提醒时间() {
        return 提醒时间;
    }

    public void set提醒时间(String 提醒时间) {
        this.提醒时间 = 提醒时间;
    }

    public String get提醒样例() {
        return 提醒样例;
    }

    public void set提醒样例(String 提醒样例) {
        this.提醒样例 = 提醒样例;
    }

    public List<String> get提醒方式() {
        return 提醒方式;
    }

    public void set提醒方式(List<String> 提醒方式) {
        this.提醒方式 = 提醒方式;
    }
}
