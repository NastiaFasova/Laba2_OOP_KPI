package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import homework.enums.TypeOfKeyboards;
import homework.enums.TypeOfStringed;
import homework.enums.TypeOfWindInstruments;

public class Main {
    public static void main(String[] args) {
        MusicalInstrument piano = new KeyboardInstrument("Piano",
                "mellow", TypeOfKeyboards.CHORDOPHONE);
        MusicalInstrument violin = new StringInstrument("violin",
                "bright", TypeOfStringed.ELECTRONIC);
        MusicalInstrument flute = new WindInstrument("flute",
                "thin", TypeOfWindInstruments.WOODWIND);

        Musician pianoMusician = new Musician("Pete", 46, piano);
        Musician violinMusician = new Musician("Ann", 32, violin);
        Musician fluteMusician = new Musician("Hugh", 37, flute);

        pianoMusician.play(piano);
        violinMusician.play(violin);
        fluteMusician.play(flute);

        Orchestra orchestra = new Orchestra();
        orchestra.setMusicians(List.of(pianoMusician, violinMusician, fluteMusician));

        System.out.println(orchestra);

        //Serializing objects
        KeyboardInstrument writableKeyboard = new KeyboardInstrument("Piano", "mellow",
                TypeOfKeyboards.CHORDOPHONE);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("keyboardInstruments.txt");
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(writableKeyboard);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            throw new RuntimeException("Some problems while writing an object!!!");
        }

        KeyboardInstrument readableKeyboard;
        try {
            FileInputStream fileInputStream = new FileInputStream("keyboardInstruments.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            readableKeyboard = (KeyboardInstrument) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {
            throw new RuntimeException("Some problems while reading a keyboard instrument!!!");
        }

        if (writableKeyboard.getTypeOfKeyBoard().equals(readableKeyboard.getTypeOfKeyBoard())
                && writableKeyboard.getName().equals(readableKeyboard.getName()) &&
                writableKeyboard.getTimbreOfSound().equals(readableKeyboard.getTimbreOfSound())) {
            System.out.println("Success! The keyboards are successfully written and read from the file!");
        }
        else {
            System.out.println("Fail! The keyboards differ!");
        }
    }
}
