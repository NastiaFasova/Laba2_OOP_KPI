package homework;

import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Orchestra {
    // Composition between orchestra and list of musicians
    private List<Musician> musicians;
}
