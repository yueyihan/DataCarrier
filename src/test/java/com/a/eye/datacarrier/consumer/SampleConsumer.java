package com.a.eye.datacarrier.consumer;

import com.a.eye.datacarrier.SampleData;

import java.util.List;

/**
 * Created by wusheng on 2016/10/26.
 */
public class SampleConsumer implements IConsumer<SampleData> {
    public int i = 1;

    @Override
    public void consume(List<SampleData> data) {
        for(SampleData one : data) {
            one.setIntValue(this.hashCode());
            ConsumerTest.buffer.offer(one);
        }
    }

    @Override
    public void onError(List<SampleData> data, Throwable t) {

    }
}
