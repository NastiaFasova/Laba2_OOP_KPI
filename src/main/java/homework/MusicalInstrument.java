package homework;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public abstract class MusicalInstrument {
    private String timbreOfSound;
    private String name;

    public MusicalInstrument() {
    }

    public MusicalInstrument(String name, String timbreOfSound) {
        this.timbreOfSound = timbreOfSound;
        this.name = name;
    }
}
