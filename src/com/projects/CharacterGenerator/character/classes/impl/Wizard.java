package com.projects.CharacterGenerator.character.classes.impl;

import com.projects.CharacterGenerator.character.classes.ICharacterClass;

import java.util.ArrayList;

public class Wizard implements ICharacterClass {

    String[] statOrder = {"Intelligence", "Constitution", "Dexterity", "Wisdom", "Charisma", "Strength"};
    int level = 1;

    public Wizard(){

    }

    @Override
    public String[] getStatOrder() {
        return statOrder;
    }

    @Override
    public String toString(){
        return "Wizard";
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public int getBaseHitPoints() {
        return 0;
    }

    @Override
    public boolean hasShield() {
        return false;
    }

    @Override
    public String getArmorType() {
        return null;
    }

    @Override
    public ArrayList<String> getFeatures() {
        return null;
    }

    @Override
    public String getUnarmoredDefense() {
        return null;
    }

    @Override
    public ArrayList<String> getBalancedInventory() {
        return null;
    }

    @Override
    public ArrayList<String> getCombatInventory() {
        return null;
    }

    @Override
    public ArrayList<String> getRPInventory() {
        return null;
    }
}
