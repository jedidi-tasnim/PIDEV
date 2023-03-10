package tn.esprit.pidevtasnim.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CenterOfCamp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String lieu;
    private String owner;
    private Integer capacity;
    private Integer nbStaff;
    private String opening;
    private String closure;

    @JsonIgnore
    @OneToMany(mappedBy="centerOfCamp", cascade=CascadeType.ALL)
    private Set<Event> events;
}
