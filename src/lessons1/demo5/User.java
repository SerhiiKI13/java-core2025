package lessons1.demo5;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private boolean status;
    protected double weight;



}
