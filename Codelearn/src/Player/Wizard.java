package Player;

public class Wizard extends Player{
    protected int MP;
    protected int MPoints;
    protected int avaibleMPoints;
    protected static final int BaseMP = 1;
    protected static final int BaseMPoints = 10;

    Wizard(String _playerName, String _characterName) {
        super(_playerName, _characterName);
    }

    Wizard(String _playerName, String _characterName, int _baseLevel, int _baseXP, int _baseHP) {
        super(_playerName, _characterName, _baseLevel, _baseXP, _baseHP);
    }

    @Override
    public void gainXp(int value) {

    }
}
