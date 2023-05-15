package Player;

public abstract class Player {
    // Atributos
    protected String _playerName;
    protected String _characterName;
    protected int _level;
    protected int _XP;
    protected int _HP;

    // Constantes
    private static final int _baseXP = 0;
    private static final int _baseLevel = 1;
    private static final int _baseHP = 100;
    Player(String _playerName, String _characterName){
        this._playerName = _playerName;
        this._characterName = _characterName;
        this._level = _baseLevel;
        this._XP = _baseXP;
        this._HP = _baseHP;

    }
}
