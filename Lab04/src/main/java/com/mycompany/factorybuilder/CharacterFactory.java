
package com.mycompany.factorybuilder;

import static com.mycompany.factorybuilder.CharacterTypes.*;

public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or Knight) by its name:
    public static Characters createCharacter(CharacterTypes type, String name){
        if (type == ARCHER) {
            return new Archer(name);
        }
        else if (type == KNIGHT) {
            return new Knight(name);
        }
        else if (type == FLAG_BEARER) {
            return new FlagBearer(name);
        }
        else {
            return null;
        }
    }
}
