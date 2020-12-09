/**Puppy class is our character's class */
public class Puppy {
    /** Current state of our puppy whether it is eating, playing, or asleep*/
    private PuppyState state;
    /** feedCounter is the amount of times that our puppy will eat*/
    private int feedCounter;
    /** playCounter is the amount of times that our puppy will play*/
    private int playCounter;
    /**Puppy is the default constructor which initializes the feed, play, and sets the initial state
     */
    public Puppy() {
        feedCounter = 0;
        playCounter = 0;
        state = new Asleep();
    }

    /** setState, sets the puppies current state
     * @param s is the current state the puppy is in
     */
    public void setState( PuppyState s){
        state = s;
    }

    /** eatSwitch is the food offering option to the puppy
     */
    public void eatSwitch(){
        state.feed( this );
    }

    /** playSwitch is the play offering option to the puppy
     */
    public void playSwitch(){
        state.play( this );
    }

    /** incrementFeed increments the feed option of the puppy 
     * being used to ensure that the puppy doesn't overeat
     */
    protected void incrementFeed(){
        ++feedCounter;
    }

    /** incrementPlay increments the play option of the puppy
     * being used to ensure that the puppy doesn't overplay 
     */
    protected void incrementPlay(){
        ++playCounter;
    }

    /** reset counter for the puppy */
    public void reset(){
        feedCounter = 0; 
        playCounter = 0;
    }

    /** getFeed is a get method that returns the feedCounter
     * @return the feed counter
     */
    public int getFeed(){
        return feedCounter;
    }

    /** getPlay is a get method that returns the playCounter
     * @return the play counter 
     */
    public int getPlay(){
        return playCounter;
    }
}