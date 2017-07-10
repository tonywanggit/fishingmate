package com.fishingmate.domain;

import com.fishingmate.facade.common.PrintFriendliness;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * 序号
 * Created by wangxudong on 2017/7/10.
 */
@Document(collection = "SequenceNumber")
public class SequenceNumber extends PrintFriendliness {

    @Id
    private String sequenceKey;

    @Field("num")
    private int sequence;


    public String getSequenceKey() {
        return sequenceKey;
    }

    public void setSequenceKey(String sequenceKey) {
        this.sequenceKey = sequenceKey;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}