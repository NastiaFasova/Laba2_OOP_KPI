package homework;

import homework.enums.TypeOfKeyboards;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class KeyboardInstrument extends MusicalInstrument {
    private TypeOfKeyboards typeOfKeyBoard;

    public KeyboardInstrument(String name, String timbreOfSound, TypeOfKeyboards typeOfKeyBoard) {
        super(timbreOfSound, name);
        this.typeOfKeyBoard = typeOfKeyBoard;
    }
}
