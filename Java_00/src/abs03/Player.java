package abs03;

public class Player {
	private PlayerLevel level;
	
	public Player () {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }

	public PlayerLevel getLevel() {
		return level;
	}
	
	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play(int count) {
        this.level.go(count);
    }

}
