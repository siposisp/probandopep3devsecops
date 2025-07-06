package G1TBD.LABTBD.auth.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {

    private String rut;
    private String email;
    private String name;
    private String lastName;
    private Date birthDate;
    private String sex;
    private String password;
    private String role;
    private boolean availability;
    private LocationRequest location;

}
