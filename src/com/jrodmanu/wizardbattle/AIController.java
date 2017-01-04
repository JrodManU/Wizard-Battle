package com.jrodmanu.wizardbattle;

import java.util.Random;

/**
 * Created by 19829 on 1/4/2017.
 */
public class AIController implements WizardController {

    public AIController() {
        rand = new Random();
    }

    public Spell chooseSpell() {
        return SpellsInfo.getRandomSpell();
    }

}
