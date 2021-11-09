import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The Player class implement the PlayerInterface, in order to provide all the publicly
 * usable functionalities.
 * It represents players and its details like current location and treasure it have and moves he
 * can take.
 */
public class Player implements PlayerInterface {
  private int[] currLocation;
  private final List<Treasure> treasureList;
  private CaveTunnelInterface currCaveCumTunnel;

  /**
   * The player constructor initialises the player object, on the basis of certain given inputs.
   *
   * @param currLocation      The current location object.
   * @param treasureList      The treasure List object if it has anything in the beginning.
   * @param currCaveCumTunnel The cave or tunnel he is in object.
   */
  public Player(int[] currLocation, List<Treasure> treasureList,
                CaveTunnelInterface currCaveCumTunnel) {
    this.currLocation = currLocation;
    this.treasureList = treasureList;
    this.currCaveCumTunnel = currCaveCumTunnel;
  }

  /**
   * The constructor for Player Class.
   * Sets the defaults values for the class.
   */
  public Player() {
    int[] currLocation = {-1, -1};
    this.currLocation = currLocation;

    this.treasureList = new ArrayList<>();

    CaveTunnelInterface currCaveCumTunnel = new CaveTunnel();
    currCaveCumTunnel.setMatrixIndex(currLocation);
    this.currCaveCumTunnel = currCaveCumTunnel;
  }

  private boolean haveTreasure() {
    List<Treasure> caveTreasureList = currCaveCumTunnel.getTreasureList();
    return caveTreasureList.size() > 0;
  }

  @Override
  public void pickTreasure() {
    if (this.haveTreasure()) {
      List<Treasure> caveTreasureList = currCaveCumTunnel.getTreasureList();
      this.treasureList.addAll(caveTreasureList);
      currCaveCumTunnel.clearTreasureList();
    }
  }

  @Override
  public void moveInDungeon(int[] newLocation, CaveTunnelInterface newCaveCumTunnel) {
    this.currLocation = newLocation;
    this.currCaveCumTunnel = newCaveCumTunnel;
  }

  @Override
  public List<int[]> getPossibleMoves() {
    return currCaveCumTunnel.getPossibleMoves();
  }

  @Override
  public int[] getCurrLoc() {
    return currLocation;
  }

  @Override
  public List<Treasure> getCollectedTreasures() {
    return this.treasureList;
  }

  @Override
  public String toString() {
    return "Player{" +
            "currLocation=" + Arrays.toString(currLocation) +
            ", playerTreasureList=" + treasureList +
            ", currCaveCumTunnel=" + currCaveCumTunnel +
            '}';
  }
}
