// Member.java
package jp.ac.uryukyu.ie.e205236.library;

public class Member {
    int id;
    String name;

    public Member(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    public String getName(){
        return this.name;
    }
}
