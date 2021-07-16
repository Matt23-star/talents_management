package com.foe.talentmanagementback.entity.dto;

/**
 * @author: Matt
 * @date: 2021/7/16/15:26
 * @description:
 */
public class NormalEmailDTO {
    private Integer toId;
    private String title;
    private String content;

    public Integer getToId() {
        return toId;
    }

    public void setToId(Integer toId) {
        this.toId = toId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
