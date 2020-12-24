package homework;

import homework.enums.TypeOfStringed;
import homework.enums.TypeOfWindInstruments;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@Data
@EqualsAndHashCode(callSuper = false)
public class WindInstrument extends MusicalInstrument {
    private transient TypeOfWindInstruments typeOfWindInstruments;

    public WindInstrument(String name, String timbreOfSound,
                          TypeOfWindInstruments typeOfWindInstruments) {
        super(name, timbreOfSound);
        this.typeOfWindInstruments = typeOfWindInstruments;
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        os.writeObject(typeOfWindInstruments.name());
    }

    private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
        is.defaultReadObject();
        String name = (String) is.readObject();
        typeOfWindInstruments = TypeOfWindInstruments.valueOf(name);
    }
}
