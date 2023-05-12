package taek.jpastudy.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String name;

    private String email;
    private String password;


    @JsonIgnore
    @OneToMany(mappedBy = "member")
    private List<Board> bords = new ArrayList<>();
}