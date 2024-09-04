package com.evgenypavlov.spring.model.data.teachers;

import com.evgenypavlov.spring.model.data.User;

public class Teachers extends User implements Comparable<Teachers> {
    private long teachersId;




    public Teachers(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);

    }

    @Override
    public int compareTo(Teachers o) {
        return Long.compare(this.teachersId,o.teachersId);
    }
}
