package com.atta.starter.attaidgenspringbootstarter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "atta.uid")
public class UidGenProperties {
    /**
     * 以下为可选配置, 如未指定将采用默认值(28-22-13)，三个参数加起来必须等于63
     */
    private int timeBits;
    private int workerBits;
    private int seqBits;
    private String epochStr ;

    /**
     * RingBuffer size扩容参数, 可提高UID生成的吞吐量
     */
    private int boostPower;

    /**
     * 指定何时向RingBuffer中填充UID, 取值为百分比(0, 100), 默认为50
     * 举例: bufferSize=1024, paddingFactor=50 -> threshold=1024 * 50 / 100 = 512.
     * 当环上可用UID数量 < 512时, 将自动对RingBuffer进行填充补全
     */
    private int paddingFactor;

    /**
     * 另外一种RingBuffer填充时机, 在Schedule线程中, 周期性检查填充
     * 默认:不配置此项, 即不实用Schedule线程. 如需使用, 请指定Schedule线程时间间隔, 单位:秒
     */
    private Long scheduleInterval;


}
