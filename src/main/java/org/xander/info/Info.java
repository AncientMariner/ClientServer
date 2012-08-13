package org.xander.info;

import java.io.Serializable;

public class Info implements Serializable {

    /*Total number of processors or cores available to the JVM */
    String availableProcessors = "Available Processors " +
            Runtime.getRuntime().availableProcessors();

    /* Total amount of free memory available to the JVM */
    String freeMemory = "Free memory (bytes): " +
            Runtime.getRuntime().freeMemory();

    /* This will return Long.MAX_VALUE if there is no preset limit */
    long maxMemory = Runtime.getRuntime().maxMemory();
    String maxMemoryAmount = "Maximum memory (bytes): " +
            (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory);

    /* Total memory currently in use by the JVM */
    String totalMemory = "Total memory (bytes): " +
            Runtime.getRuntime().totalMemory();

    public String getAvailableProcessors() {
        return availableProcessors;
    }

    public void setAvailableProcessors(String availableProcessors) {
        this.availableProcessors = availableProcessors;
    }

    public String getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(String freeMemory) {
        this.freeMemory = freeMemory;
    }

    public long getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(long maxMemory) {
        this.maxMemory = maxMemory;
    }

    public String getMaxMemoryAmount() {
        return maxMemoryAmount;
    }

    public void setMaxMemoryAmount(String maxMemoryAmount) {
        this.maxMemoryAmount = maxMemoryAmount;
    }

    public String getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory(String totalMemory) {
        this.totalMemory = totalMemory;
    }
}
