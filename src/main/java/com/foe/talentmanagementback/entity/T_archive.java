package com.foe.talentmanagementback.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public class T_archive implements Serializable {


    private Integer id;

    private Integer talentId;

    private Integer archiveDetailId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTalentId() {
        return talentId;
    }

    public void setTalentId(Integer talentId) {
        this.talentId = talentId;
    }

    public Integer getArchiveDetailId() {
        return archiveDetailId;
    }

    public void setArchiveDetailId(Integer archiveDetailId) {
        this.archiveDetailId = archiveDetailId;
    }

    @Override
    public String toString() {
        return "T_archive{" +
        "id=" + id +
        ", talent_id=" + talentId +
        ", archive_detail_id=" + archiveDetailId +
        "}";
    }
}
