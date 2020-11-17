package homework;

import homework.enums.TypeOfStringed;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
@Data
public class StringInstrument extends MusicalInstrument {
    private TypeOfStringed typeOfStringed;

    public StringInstrument(String name, String timbreOfSound, TypeOfStringed typeOfStringed) {
        super(timbreOfSound, name);
        this.typeOfStringed = typeOfStringed;
    }
}
