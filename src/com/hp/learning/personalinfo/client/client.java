package com.hp.learning.personalinfo.client;

import com.hp.learning.personalinfo.dto.address;
import com.hp.learning.personalinfo.dto.person;




public class client {
    public static void main(String[] args) {
    person p = new person();

    p.setAge(25);
        System.out.println(p.getAge());
        p.setFirstname("Mahesh");
        System.out.println(p.getFirstname());
        p.setLastname("Kotekey");
        System.out.println(p.getLastname());
        System.out.println(p.getFullname());

        address a = new address();

        a.setStreet("CKB_layout-street");
        System.out.println(a.getStreet());
        a.setHouseNumber(203);
        System.out.println(a.getHouseNumber());

        a.setBuildingName("Amrutha Apartments");
        System.out.println(a.getBuildingName());

        a.setCity("Marthalli");
        System.out.println(a.getCity());


        a.setState("Karnataka");
        System.out.println(a.getState());

        a.setPincode(518543);
        System.out.println((a.getPincode()));

    }
}
