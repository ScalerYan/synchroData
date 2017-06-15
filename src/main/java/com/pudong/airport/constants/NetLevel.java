package com.pudong.airport.constants;

/**
 * Created by Jason on 17/6/6.
 */
public enum NetLevel {
    core("核心层", 100), converge("汇聚层", 80), access("接入层", 20);
    // 成员变量
    private String name;
    private int index;

    // 构造方法
    NetLevel(String name, int index) {
        this.name = name;
        this.index = index;
    }

    // 普通方法
    public static String getName(int index) {
        for (NetLevel c : NetLevel.values()) {
            if (c.getIndex() == index) {
                return c.name;
            }
        }
        return null;
    }

    // get set 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static void main(String[] args) {
        for (NetLevel level : NetLevel.values()){
            System.out.println(level.toString());
        }
    }
}
