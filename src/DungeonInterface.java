import java.util.List;

/**
 * This DungeonInterface keeps all the public behaviours of a Dungeon.
 */
public interface DungeonInterface {

  /**
   * This function moves the player to a desired / specified location.
   *
   * @param newLocation The location object (int []).
   */
  public void movePlayer(int[] newLocation);


  /**
   * Gives the moves current Cave/Tunnel at which the player is present.
   *
   * @return The List of integer array object having possible row, column locations.
   */
  public List<int[]> getCurrentMoves();

  /**
   * Gives the players current location in the dungeon.
   *
   * @return Payers current location object.
   */
  int[] getPlayerCurrentLocation();
}
