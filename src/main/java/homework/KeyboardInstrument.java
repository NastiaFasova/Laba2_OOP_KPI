package homework;

import homework.enums.TypeOfKeyboards;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@EqualsAndHashCode(callSuper = true)
@Data
public class KeyboardInstrument extends MusicalInstrument {
    private TypeOfKeyboards typeOfKeyBoard;

    public KeyboardInstrument(String name, String timbreOfSound, TypeOfKeyboards typeOfKeyBoard) {
        super(timbreOfSound, name);
        this.typeOfKeyBoard = typeOfKeyBoard;
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        os.writeObject(typeOfKeyBoard.name());
    }

    private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
        is.defaultReadObject();
        String name = (String) is.readObject();
        typeOfKeyBoard = TypeOfKeyboards.valueOf(name);
    }
}
