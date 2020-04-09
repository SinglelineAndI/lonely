package com.three.lonely.pojo;

import com.alibaba.druid.sql.visitor.functions.Char;
import lombok.Data;

import javax.persistence.Entity;

/**
 * 〈〉
 *
 * @author el
 * @email 1337307801@qq.com
 * @create 2020/4/9
 * @since 1.0.0
 * 〈纵使时光相隔百年遥，仍感你近在咫尺〉
 */
@Entity
@Data
public class Log {

    private Integer id;
    /*请求地址*/
    private String url;
    /*请求参数*/
    private String params;
    /*请求方法*/
    private String method;
    /*请求人员*/
    private String userName;
    /*日志级别*/
    private Char level;
    /*错误信息*/
    private String errorInfo;
    /*执行时间*/
    private Integer excuteTime;
}
