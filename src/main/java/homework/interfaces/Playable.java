package homework.interfaces;

import homework.MusicalInstrument;

public interface Playable {
    <T extends MusicalInstrument> T play(T instrument);
}
