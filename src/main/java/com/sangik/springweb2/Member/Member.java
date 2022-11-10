package com.sangik.springweb2.Member;

public class Member {
    private long id;
    private String name;
    private Grade grade;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }



    public Member (Long id, String name, Grade grade){
        this.id=id;
        this.grade=grade;
        this.name=name;




    }






}
