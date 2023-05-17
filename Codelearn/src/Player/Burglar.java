package Player;

public class Burglar extends Player{
    Burglar(String _playerName, String _characterName) {
        super(_playerName, _characterName);
    }

    Burglar(String _playerName, String _characterName, int _baseLevel, int _baseXP, int _baseHP) {
        super(_playerName, _characterName, _baseLevel, _baseXP, _baseHP);
    }

    @Override
    public void gainXp(int value) {

    }
}
