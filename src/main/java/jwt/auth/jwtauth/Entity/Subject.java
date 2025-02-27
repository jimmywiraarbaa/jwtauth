package jwt.auth.jwtauth.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String namaMapel;

    @ManyToOne
    @JoinColumn(name = "guru_id", nullable = false)
    private Guru guru;
}
