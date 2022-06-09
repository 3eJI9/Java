package Lesson2.demo2_enums;

public enum Role {
    ADMIN("foo"), MANAGER("bar");

    private String token;

    Role(String token) {
        this.token = token;
    }
    public String getToken(){
        return token;
    }
}
