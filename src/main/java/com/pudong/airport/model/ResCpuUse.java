package com.pudong.airport.model;

import java.sql.Timestamp;

/**
 * Created by Jason on 17/6/4.
 */
public class ResCpuUse {
    private Timestamp sampleTime;
    private int objectId;
    private String name;
    private String ipaddr;
    private int cpuUsage;

    public ResCpuUse() {
    }

    public ResCpuUse(Timestamp sampleTime, int objectId, String name, String ipaddr, int cpuUsage) {
        this.sampleTime = sampleTime;
        this.objectId = objectId;
        this.name = name;
        this.ipaddr = ipaddr;
        this.cpuUsage = cpuUsage;
    }

    public Timestamp getSampleTime() {
        return sampleTime;
    }

    public void setSampleTime(Timestamp sampleTime) {
        this.sampleTime = sampleTime;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public int getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(int cpuUsage) {
        this.cpuUsage = cpuUsage;
    }
}
