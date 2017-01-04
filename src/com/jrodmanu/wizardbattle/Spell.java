package com.jrodmanu.wizardbattle;

/**
 * Created by 19829 on 1/4/2017.
 */
public class Spell {
    WizardBattle.Stats stat;
    float change;
    String message;

    public Spell(WizardBattle.Stats stat, float change, String message) {
        this.stat = stat;
        this.change = change;
        this.message = message;
    }

}
