package Player;

public class Burglar extends Player{
    public int get_AP() {
        return _AP;
    }

    @Override
    public void setXP(int XP) {
        super.setXP(XP);
    }

    protected int _AP;
    protected static final int _BaseAP = 1;
    Burglar(String _playerName, String _characterName) {
        super(_playerName, _characterName);
        this._AP = _BaseAP;
    }

    Burglar(String _playerName, String _characterName, int _baseLevel, int _baseXP, int _baseHP, int _AP) {
        super(_playerName, _characterName, _baseLevel, _baseXP, _baseHP);
        this._AP = _AP;
    }

    @Override
    public void gainXP(int value) {
        this.XP += value;
        int c = level * XP;
        if(c > level * 1000){
            this.level++;
            this._AP++;
            this._HP += 8;
        }
    }
    public boolean disableTrap(int trapDifficulty){
        if(level * _AP > trapDifficulty){
            System.out.println("Trap disabled");
            return true;
        }
        System.out.println("Trap activated");
        this._HP -= 10;
        return false;
    }

    public String toString() {
        super.toString();
        System.out.println("Character type: Burglar");
        System.out.println("Agility Power: " + _AP);
        return null;
    }
}
