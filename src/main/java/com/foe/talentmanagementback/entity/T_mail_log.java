package com.foe.talentmanagementback.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public class T_mail_log implements Serializable {


    /**
     * 消息id
     */
    private String msgId;

    /**
     * 接收员工id
     */
    private Integer eid;

    /**
     * 状态（0:消息投递中 1:投递成功 2:投递失败）
     */
    private Integer status;

    /**
     * 路由键
     */
    private String routeKey;

    /**
     * 交换机
     */
    private String exchange;

    /**
     * 重试次数
     */
    private Integer count;

    /**
     * 重试时间
     */
    private LocalDateTime tryTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    private LocalDateTime updateTime;


    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRouteKey() {
        return routeKey;
    }

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public LocalDateTime getTryTime() {
        return tryTime;
    }

    public void setTryTime(LocalDateTime tryTime) {
        this.tryTime = tryTime;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "T_mail_log{" +
        "msgId=" + msgId +
        ", eid=" + eid +
        ", status=" + status +
        ", routeKey=" + routeKey +
        ", exchange=" + exchange +
        ", count=" + count +
        ", tryTime=" + tryTime +
        ", createTime=" + createTime +
        ", updateTime=" + updateTime +
        "}";
    }
}
