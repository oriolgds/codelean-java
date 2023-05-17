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
    public void gainXp(int value) {
        XP += value;
        int c = level * XP;
        if(c > level * 1000 * level / 2){
            level++;
            MP++;
            MPoints += 5;
            this._HP += 5;
        }
    }
}
