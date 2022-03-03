package com.mycompany.factorybuilder;

public class Archer implements Characters {

    private String name;
    private Avatar avatar;

    public Archer(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Character must have a name");
        }
        this.name = name;
        // TODO: instantiate an avatar builder using Avatar.Builder
        this.avatar = new Avatar.Builder(SkinTone.MEDIUM)
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_STRAIGHT).withBodyType(BodyType.SKINNY).withFacialFeatures(FacialFeatures.CLEAN_SHAVEN)
                .build();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Avatar getAvatar() {
        return avatar;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return this.name + " has " + this.avatar.toString();
    }

}
