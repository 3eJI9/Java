package Lesson1;


import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString

public class Posts {
    private int userId;
    private int id;
    private String title;
    private String body;
}
