package com.hquery.blog.app.model;

import java.io.Serializable;

/**
 * @author 
 */
public class MetasDO implements Serializable {
    private Long id;

    private String name;

    /**
     * 标签的分类 link category tags
     */
    private String type;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}