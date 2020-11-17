package homework;

import homework.enums.TypeOfWindInstruments;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class WindInstrument extends MusicalInstrument {
    private TypeOfWindInstruments typeOfWindInstruments;

    public WindInstrument(String name, String timbreOfSound,
                          TypeOfWindInstruments typeOfWindInstruments) {
        super(name, timbreOfSound);
        this.typeOfWindInstruments = typeOfWindInstruments;
    }
}
