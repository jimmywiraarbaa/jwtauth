package jwt.auth.jwtauth.Entity;

import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "kelas")
public class Kelas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String namaKelas;

    @OneToMany(mappedBy = "kelas", cascade = CascadeType.ALL)
    private Set<Siswa> siswa;
}
