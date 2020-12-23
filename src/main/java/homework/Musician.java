package homework;

import homework.interfaces.Playable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Musician implements Playable {
    private String name;
    private int age;
    // Aggregation between Musician and his instrument
    private MusicalInstrument instrument;

    public Musician(String name, int age, MusicalInstrument instrument) {
        this.name = name;
        this.age = age;
        this.instrument = instrument;
    }

    @Override
    public <T extends MusicalInstrument> T play(T instrument) {
        System.out.println(this.getName() + " is playing the " + instrument.getName());
        return instrument;
    }
}
