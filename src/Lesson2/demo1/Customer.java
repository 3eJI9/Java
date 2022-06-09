package Lesson2.demo1;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    private String login;
    private String password;

    private Passport passport;


    public Customer(String login, String password, String series, String number) {
        this.login = login;
        this.password = password;
        this.passport = new Passport(series, number);
    }
}
