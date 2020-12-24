package homework;

import homework.enums.TypeOfKeyboards;
import homework.enums.TypeOfStringed;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

@EqualsAndHashCode(callSuper = false)
@Data
public class StringInstrument extends MusicalInstrument {
    private transient TypeOfStringed typeOfStringed;

    public StringInstrument(String name, String timbreOfSound, TypeOfStringed typeOfStringed) {
        super(timbreOfSound, name);
        this.typeOfStringed = typeOfStringed;
    }

    private void writeObject(ObjectOutputStream os) throws IOException {
        os.defaultWriteObject();
        os.writeObject(typeOfStringed.name());
    }

    private void readObject(ObjectInputStream is) throws ClassNotFoundException, IOException {
        is.defaultReadObject();
        String name = (String) is.readObject();
        typeOfStringed = TypeOfStringed.valueOf(name);
    }
}
