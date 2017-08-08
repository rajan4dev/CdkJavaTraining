package org.cdk.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//annotation- declarative way of configuration, only for syatem configuration
//bean still cannot be configured via annotation, nnedd xml

@Component
public class Employee {
    @Value("2000")
    int id;
    @Value("rajan")
    String name;
    @Value("7864734439")
    String phone;

    @Autowired
    @Qualifier("addr2") //if more than one bean of same type ,use byName
    Address address;

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public Employee(String phone, int id) {

        this.id = id;
        this.phone = phone;
    }
}
