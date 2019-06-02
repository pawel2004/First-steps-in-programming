public class Player {

    private String name;
    private int hp;
    private int max_damage;
    private int min_damage;
    private int potions;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public int getHp()
    {
        return hp;
    }

    public void setMax_damage(int max_damage)
    {
        this.max_damage = max_damage;
    }

    public int getMax_damage()
    {
        return max_damage;
    }

    public void setMin_damage(int min_damage)
    {
        this.min_damage = min_damage;
    }

    public int getMin_damage()
    {
        return  min_damage;
    }

    public void setPotions(int potions)
    {
        this.potions = potions;
    }

    public int getPotions()
    {
        return potions;
    }
}
