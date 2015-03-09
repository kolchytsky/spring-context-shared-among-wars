package com.coldenergia.springcontextsharedamongwars.common;

/**
 * User: coldenergia
 * Date: 3/8/15
 * Time: 10:47 AM
 */
public class Nothing {

    private Integer id;

    private String name;

    public Nothing(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Nothing{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
