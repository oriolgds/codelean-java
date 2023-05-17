package Player;

public class Warrior extends Player {
    Warrior(String _playerName, String _characterName) {
        super(_playerName, _characterName);
    }

    Warrior(String _playerName, String _characterName, int _baseLevel, int _baseXP, int _baseHP) {
        super(_playerName, _characterName, _baseLevel, _baseXP, _baseHP);
    }

    public static int get_BaseCP() {
        return _BaseCP;
    }

    public void set_CP(int _CP) {
        this._CP = _CP;
    }

    public static int get_BaseDP() {
        return _BaseDP;
    }

    public int get_CP() {
        return _CP;
    }

    public int get_DP() {
        return _DP;
    }

    public void set_DP(int _DP) {
        this._DP = _DP;
    }

    protected int _CP;
    protected int _DP;
    protected static final int _BaseCP = 1;
    protected static final int _BaseDP = 1;


    @Override
    public void gainXp(int value) {
        int c = level * XP;
        if(c > level * 1000 * level / 4){
            level++;
            _CP ++;
            _DP++;
            _HP += 10;
        }
    }
    public boolean attack(int enemyDP){
        if(_DP > enemyDP * 2){
            System.out.println("Attack succeeded");
            return true;
        }
        System.out.println("Attack failed");
        return false;
    }
    public String toString(){
        super.toString();
        System.out.println("Character type: Warrior");
        System.out.println("Combat Power: " + this._CP);
        System.out.println("Combat Defense: " + this._DP);
        return null;
    }
}
