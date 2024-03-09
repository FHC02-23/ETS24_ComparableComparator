package org.campus02.lv;

import java.util.Comparator;

public class StudentsLastFirstNameComporator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int res = o1.getLastName().compareTo(o2.getLastName());
        if (res == 0) {
            res = o2.getFirstName().compareTo(o1.getFirstName());
        }
        return res;
    }
}
