import java.util.List;

/**
 * This PlayerInterface keeps all the public behaviours of a Player.
 */
public interface PlayerInterface {

  /**
   * This method check if there is a treasure present in the current cave, and picks it if there is.
   */
  void pickTreasure();

  /**
   * This function moves the player to a desired / specified location.
   *
   * @param newLocation      The location object (int []).
   * @param newCaveCumTunnel The cave/tunnel object.
   */
  void moveInDungeon(int[] newLocation, CaveTunnelInterface newCaveCumTunnel);

  /**
   * Gives the possible moves of the Cave/Tunnel the player is present in.
   *
   * @return The List of integer array object having possible row, column locations.
   */
  List<int[]> getPossibleMoves();

  /**
   * The current location of the player in the dungeon.
   *
   * @return The location object (int[]).
   */
  int[] getCurrLoc();

  /**
   * Collected treasures.
   *
   * @return collected treasures.
   */
  List<Treasure> getCollectedTreasures();
}
