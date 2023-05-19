package Player;

public abstract class Player {
    public int get_HP() {
        return _HP;
    }

    public void set_HP(int _HP) {
        this._HP = _HP;
    }

    public static int get_baseHP() {
        return _baseHP;
    }

    public void set_characterName(String _characterName) {
        this._characterName = _characterName;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void set_playerName(String _playerName) {
        this._playerName = _playerName;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public static int get_baseLevel() {
        return _baseLevel;
    }

    public static int get_baseXP() {
        return _baseXP;
    }

    public int getLevel() {
        return level;
    }

    public int getXP() {
        return XP;
    }

    public String get_characterName() {
        return _characterName;
    }

    public String get_playerName() {
        return _playerName;
    }

    // Atributos
    protected String _playerName;
    protected String _characterName;
    protected int level;
    protected int XP;
    protected int _HP;

    // Constantes
    private static final int _baseXP = 0;
    private static final int _baseLevel = 1;
    private static final int _baseHP = 100;
    Player(String _playerName, String _characterName){
        super();
        this._playerName = _playerName;
        this._characterName = _characterName;
        this.level = _baseLevel;
        this.XP = _baseXP;
        this._HP = _baseHP;
    }
    Player(String _playerName, String _characterName, int _baseLevel, int _baseXP, int _baseHP){
        super();
        this._playerName = _playerName;
        this._characterName = _characterName;
        this.level = _baseLevel;
        this.XP = _baseXP;
        this._HP = _baseHP;
    }
    public abstract void gainXP(int value);
    public String toString(){
        System.out.println("Player Name: " + this._playerName);
        System.out.println("Character Name: " + this._characterName);
        System.out.println("Character Level: " + this.level);
        System.out.println("Character XP: " + this.XP);
        System.out.println("Character HP: " + this._HP);
        return null;
    }
}
