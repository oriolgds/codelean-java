package Player;

public class Wizard extends Player{
    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getMPoints() {
        return MPoints;
    }

    public void setMPoints(int MPoints) {
        this.MPoints = MPoints;
    }

    protected int MP;
    protected int MPoints;
    protected int avaibleMPoints;
    protected static final int BaseMP = 1;
    protected static final int BaseMPoints = 10;

    Wizard(String _playerName, String _characterName) {
        super(_playerName, _characterName);
        this.MP = BaseMP;
        this.MPoints = BaseMPoints;
    }

    Wizard(String _playerName, String _characterName, int _baseLevel, int _baseXP, int _baseHP, int MP, int MPoints) {
        super(_playerName, _characterName, _baseLevel, _baseXP, _baseHP);
        this.MP = MP;
        this.MPoints = MPoints;
    }

    @Override
    public void gainXP(int value) {
        XP += value;
        int c = level * XP;
        if(c > level * 1000 * level / 2){
            level++;
            MP++;
            MPoints += 5;
            this._HP += 5;
        }
    }
    public boolean castSpell(int spellDifficulty, int spellCost){
        if(this.avaibleMPoints >= spellCost){
            avaibleMPoints -= spellCost;
            if(this.MP > spellDifficulty * 2){
                System.out.println("Spell casting succeeded");
                return true;
            }
            else {
                System.out.println("Spell casting failed");
            }
        }
        else {
            System.out.println("Not enough magical energy");
        }
        return false;
    }
    public void rest(int time){
        System.out.println("Resting");
        if(time < 12){
            avaibleMPoints += MPoints / 2;
            if(avaibleMPoints > MPoints){
                avaibleMPoints = MPoints;
            }
        }
        else {
            avaibleMPoints = MPoints;
        }
    }

    public String toString() {
        super.toString();
        System.out.println("Character type: Wizard");
        System.out.println("Magical Power: " + this.MP);
        System.out.println("Maximum Magical Points: " + this.MPoints);
        System.out.println("Available Magical Points: " + this.avaibleMPoints);
        return null;
    }
}
