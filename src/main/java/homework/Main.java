package homework;

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
    }
}
