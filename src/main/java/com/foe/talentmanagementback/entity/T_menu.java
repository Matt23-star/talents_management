package com.foe.talentmanagementback.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Matt
 * @since 2021-07-08
 */
public class T_menu implements Serializable {


    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * url
     */
    private String url;

    /**
     * path
     */
    private String path;

    /**
     * 组件
     */
    private String component;

    /**
     * 菜单名
     */
    private String name;

    /**
     * 图标
     */
    private String iconCls;

    /**
     * 是否保持激活
     */
    private Boolean keepAlive;

    /**
     * 是否要求权限
     */
    private Boolean requireAuth;

    /**
     * 父id
     */
    private Integer parentId;

    /**
     * 是否启用
     */
    private Boolean enabled;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public Boolean getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Boolean keepAlive) {
        this.keepAlive = keepAlive;
    }

    public Boolean getRequireAuth() {
        return requireAuth;
    }

    public void setRequireAuth(Boolean requireAuth) {
        this.requireAuth = requireAuth;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String toString() {
        return "T_menu{" +
        "id=" + id +
        ", url=" + url +
        ", path=" + path +
        ", component=" + component +
        ", name=" + name +
        ", iconCls=" + iconCls +
        ", keepAlive=" + keepAlive +
        ", requireAuth=" + requireAuth +
        ", parentId=" + parentId +
        ", enabled=" + enabled +
        "}";
    }
}
